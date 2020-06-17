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

a_1 = df.filter(df["passenger_count"]==1).count()
a_2 = df.filter(df["passenger_count"]==2).count()
a_3 = df.filter(df["passenger_count"]==3).count()
a_4 = df.filter(df["passenger_count"]==4).count()

Count = [{'count_type':'1人','count':a_1},{'count_type':'2人','count':a_2},{'count_type':'3人','count':a_3},{'count_type':'4人','count':a_4}]

count_pd = pd.DataFrame(Count)
count_pd.to_csv("Count_pie.csv")

