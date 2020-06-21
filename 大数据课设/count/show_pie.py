import plotly.express as px
import plotly.io as pio
import pandas as pd
import plotly.graph_objects as go

Count_pie = pd.read_csv("Count_pie.csv")

#print(type(cntByHour_pick))
#试试折线图更好点
fig_cp = px.pie(Count_pie,
             names="count_type",
             values="count",
             title="乘客人数占比图")

fig_cp.show()

pio.write_html(fig_cp,'fig_cp.html')



