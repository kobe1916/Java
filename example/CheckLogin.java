import java.util.Scanner;
/**
 * 测试登录信息
 * @author lhy
 *
 */
public class CheckLogin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入登录用户名：");
		String username = scan.nextLine();
		System.out.println("请输入登录密码：");
		String passwd = scan.nextLine();
		if(!username.equals("mr")) {
			System.out.println("用户名非法。");
		}else if(!passwd.contentEquals("mirsoft")){
			System.out.println("登陆密码错误！");
		}else{
			System.out.println("恭喜您，登录信息通过验证！");
	
		}
	}
}
/*
1、功能不同

"=="是判断两个变量或实例是不是指向同一个内存空间。

"equals"是判断两个变量或实例所指向的内存空间的值是不是相同。
2、定义不同

"equals"在JAVA中是一个方法。

"=="在JAVA中只是一个运算符合。
*/
