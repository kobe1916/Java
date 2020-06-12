
#spark读取数据文件创建DataFrame
from pyspark import SparkContext, SparkConf
from pyspark.sql import SparkSession
from pyspark.sql.functions import split
import pandas as pd

spark = SparkSession.builder.config(conf=SparkConf()).getOrCreate()

df = spark.read.csv("/BigData/trip_data_1.csv",
                    header=True,
                    inferSchema=True)

df = df.repartition(1)
df.show(10)

#上车时间
df = df.withColumn("pickup_time",
                   split(df['pickup_datetime'], " ")[1]).drop("pickup_datetime")  #新增列
df = df.withColumnRenamed("pickup_time", "pickup_datetime")   #重命名
#df.show(20)

'''对时间切片 得到小时然后统计'''
attrsName_pick = ['Hour_pick','Min_pick', 'Sec_pick',]
for i in range(len(attrsName_pick)):
    df = df.withColumn(attrsName_pick[i],
                       split(df['pickup_datetime'], ":")[i])

for x in attrsName_pick:
    df = df.withColumn(x, df[x].cast('int'))

#df.show(10)
df = df.select(df["trip_distance"],df["Hour_pick"])

distance_1 = list()
for x in range(0,24):
    a = df.filter(df["trip_distance"]<=1).filter(df["Hour_pick"]==x).count()
    distance_1.append(a)

distance_2 = list()
for x in range(0,24):
    a = df.filter(df["trip_distance"].between(1,3)).filter(df["Hour_pick"]==x).count()
    distance_2.append(a)

distance_3 = list()
for x in range(0,24):
    a = df.filter(df["trip_distance"].between(3,5)).filter(df["Hour_pick"]==x).count()
    distance_3.append(a)

distance_4 = list()
for x in range(0,24):
    a = df.filter(df["trip_distance"]>5).filter(df["Hour_pick"]==x).count()
    distance_4.append(a)

dis_list=[distance_1,distance_2,distance_3,distance_4]
name = ['dis_1','dis_2','dis_3','dis_4']
count_pd = pd.DataFrame(data=dis_list,columns=name)
count_pd.to_csv("distance_hour.csv")
