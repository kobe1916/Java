import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan =new  Scanner(System.in);
		System.out.println("请输入一个整数");
		long number  = scan.nextLong();
		System.out.println("你输入的数字是" + number);
		System.out.println("该数字乘以2的运算结果是"+ (number<<1));
		System.out.println("该数字乘以4的运算结果是"+ (number<<2));
		System.out.println("该数字乘以8的运算结果是"+ (number<<3));
		System.out.println("该数字乘以16的运算结果是"+ (number<<4));
		}

}
