import java.util.Scanner;
public class ReverseTest {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
int r = 0;
String str = "";
if (num > 0) {
while (num != 0) {
r = num % 10;
str = str + r;
num/=10;
}
}
System.out.println(str);
}
}
