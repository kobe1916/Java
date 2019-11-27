/*（2）（从键盘输入两个字符串，例如“欢迎访问西邮网站”和“www.xupt.edu.cn”，将这两个字符串连接成一个字符串，
再将连接后的字符串中所有小写字母转换为大写字母，并得到和输出这个字符串中的第一个和最后一个字符。

代码：
*/
package 实验;

import java.util.Scanner;

public class Stringusing {

    public static void main(String[] args) {
        Scanner inx = new Scanner(System.in);
        String  one = inx.next();
        String other =inx.next();
        String another= one+other;

        System.out.println(another);
        System.out.println(another.toUpperCase());

        inx.close();
    }
}
