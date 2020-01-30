import java.text.SimpleDateFormat;
import java.util.Calendar;
public class rl{
public static void main(String[] args) {
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

Calendar cal = Calendar.getInstance();

cal.set(1949, 10, 1);
long stime = cal.getTimeInMillis();
cal.set(2010, 8, 15);
long etime = cal.getTimeInMillis();

long jtime = (etime - stime)/(1000*60*60*24);
System.out.println(jtime);
}


}
