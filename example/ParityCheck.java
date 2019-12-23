import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		long number = scan.nextLong();
		String check = (number %2 == 0)?"偶":"奇";
		System.out.println(check);
	}
}
