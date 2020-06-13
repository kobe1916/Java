
import plotly.io as pio
import pandas as pd

import plotly.graph_objs as go


dis_hour= pd.read_csv("distance_hour.csv")

list = dis_hour.values.tolist()
Hour = []  # 存储的是要提取的数据
dis_1 = []
dis_2 = []
dis_3 = []
dis_4 = []
for i in range(len(list)):
    Hour.append(list[i][0])
for i in range(len(list)):
    dis_1.append(list[i][1])
for i in range(len(list)):
    dis_2.append(list[i][2])
for i in range(len(list)):
    dis_3.append(list[i][3])
for i in range(len(list)):
    dis_4.append(list[i][4])
trace_1 = go.Bar(
    x = Hour,
    y = dis_1,
    name = '短程')
trace_2 = go.Bar(
    x=Hour,
    y=dis_2,
    name='中短程')
trace_3 = go.Bar(
    x=Hour,
    y=dis_3,
    name='中长程')
trace_4 = go.Bar(
    x=Hour,
    y=dis_4,
    name='长途')
trace = [trace_1, trace_2, trace_3,trace_4]
# Layout
layout = go.Layout(
    title = '行驶距离与时间关系'
    )
# Figure
fig_dh = go.Figure(data = trace, layout = layout)

fig_dh.show()

pio.write_html(fig_dh, 'fig_dh.html')
