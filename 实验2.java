package shiyan1;
import java.util.*;
public class shiyan1 {
	public static void main(String[] args)
	{
		System.out.println("请输入你一元二次方程的a,b,c");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		double d=b*b-4*a*c;
		double e,f;
		if (d==0){
		System.out.println("这是个完全平方");
		e=f=-b/2*a;
		System.out.print(e);
		}
		else if(d<0) {
		System.out.println("无效根");
		}
		else {
		System.out.println("这是个不完全平方，需要用求根公式");
		double g=Math.sqrt(Math.abs(b));
		e=-(b+g)/2*a;
		f=-(e);
		System.out.println("第一根是"+e);
		System.out.println("第二根是"+f);
		}
}
