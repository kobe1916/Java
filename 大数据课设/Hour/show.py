import plotly.express as px
import plotly.io as pio
import pandas as pd
import plotly.graph_objects as go

cntByHour_pick = pd.read_csv("CountHour_pickup.csv")

#print(type(cntByHour_pick))
#试试折线图更好点
fig_pick = px.bar(cntByHour_pick,
            x = "Hour_pick",
            y = "count",
            title='该月份居民打车时间人数柱形图')


fig_pick.show()

pio.write_html(fig_pick,'fig_pick.html')

cntByHour_drop = pd.read_csv("CountHour_dropoff.csv")


fig_drop = px.bar(cntByHour_drop,
            x = "Hour_drop",
            y = "count",
            title='该月份居民下车时间人数柱形图')

fig_drop.show()
pio.write_html(fig_drop,'fig_drop.html')
si
