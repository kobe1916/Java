'''
思路：统计出租车接客及下客时间 统计每个时间段出租车行驶数量 得出纽约居民生活作息规律
'''

#spark读取数据文件创建DataFrame
from pyspark import SparkContext, SparkConf
from pyspark.sql import SparkSession
from pyspark.sql.functions import split

spark = SparkSession.builder.config(conf=SparkConf()).getOrCreate()

df = spark.read.csv("/BigData/trip_data_1.csv",
                    header=True,
                    inferSchema=True)
#spark读取数据文件创建DataFrame
from pyspark import SparkContext, SparkConf
from pyspark.sql import SparkSession
from pyspark.sql.functions import split

spark = SparkSession.builder.config(conf=SparkConf()).getOrCreate()

df = spark.read.csv("/BigData/trip_data_1.csv",
                    header=True,
                    inferSchema=True)

df = df.repartition(1)
#df.show(100)  #打印前100行


#切割时间信息   得到年月日 小时 分钟 秒
#上车时间
df = df.withColumn("pickup_time",
                   split(df['pickup_datetime'], " ")[1]).drop("pickup_datetime")  #新增列
df = df.withColumnRenamed("pickup_time", "pickup_datetime")   #重命名
#df.show(20)

#下车时间
df = df.withColumn("drop_time",
                   split(df['dropoff_datetime'], " ")[1]).drop("dropoff_datetime")
df = df.withColumnRenamed("drop_time", "dropoff_datetime")
#df.show(20)

'''对时间切片 得到小时然后统计'''
attrsName_pick = ['Hour_pick','Min_pick', 'Sec_pick',]
for i in range(len(attrsName_pick)):
    df = df.withColumn(attrsName_pick[i],
                       split(df['pickup_datetime'], ":")[i])

attrsName_drop = ['Hour_drop', 'Min_drop', 'Sec_drop', ]
for i in range(len(attrsName_drop)):
    df = df.withColumn(attrsName_drop[i],
                       split(df['dropoff_datetime'], ":")[i])

#df.printSchema()    #DataFrame中的数据结构信息，即为schema。

#转为整形
for x in attrsName_drop:
    df = df.withColumn(x, df[x].cast('int'))

for x in attrsName_pick:
    df = df.withColumn(x, df[x].cast('int'))

#df.show(20)

#分别将上车、下车时间存入csv文件
countByHourPick = df.groupBy("Hour_pick").count().orderBy("Hour_pick")
countByHourPick.toPandas().to_csv("CountHour_pickup.csv",
                              encoding='utf-8',
                              index=False)

countByHourDrop = df.groupBy("Hour_drop").count().orderBy("Hour_drop")
countByHourDrop.toPandas().to_csv("CountHour_dropoff.csv",
                              encoding='utf-8',
                              index=False)
