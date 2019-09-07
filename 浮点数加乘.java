import java.math.BigDecimal;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		while(reader.hasNext())
		{
			String a=reader.nextLine();
			String b=reader.nextLine();
			BigDecimal a1=new BigDecimal(a);
			BigDecimal b1=new BigDecimal(b);
			System.out.println(b1.add(a1));
			System.out.println(b1.multiply(a1));
			///System.out.println(a1+b1);
			///System.out.println(a1*b1);
		}
	}
}
