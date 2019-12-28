package oo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Shiyan7one {
public static void main(String[] args) {
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
Calendar cal = Calendar.getInstance();
cal.set(1949, 10, 1);
long stime = cal.getTimeInMillis();
cal.set(2010, 8, 15);
long etime = cal.getTimeInMillis();
long jtime = (etime - stime)/(1000*60*60*24);
System.out.println("相隔："+jtime);
}
}


//）使用日期类中的方法，编程实现求出从1949年10月1日至2010年8月15日之间的相隔天数。
