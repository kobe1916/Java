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


/*import java.util.*;
class hello{
    public static void main(String[] args){
        int a,b,c,d,x;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        x = in.nextInt();
        a = (x/1000);
        b = (x/100)%10;
        c = (x/10)%10;
        d = x%10;
        System.out.println(""+d+""+c+""+b+""+a);
    }
}
*/
