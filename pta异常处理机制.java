/*
使用异常处理输入机制，让程序变得更健壮。


main方法：
输入n，创建大小为n的int数组。
输入n个整数，放入数组。输入时，有可能输入的是非整型字符串，这时候需要输出异常信息，然后重新输入。
使用Arrays.toString输出数组中的内容。
输入样例：
5
1
2
a
b
4
5
3
输出样例：
java.lang.NumberFormatException: For input string: "a"
java.lang.NumberFormatException: For input string: "b"
[1, 2, 4, 5, 3]
*/


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        int i=0;
        ArrayList arrayList=new ArrayList();
        while (i<time){
            String str=sc.next();
            char c=str.charAt(0);
            if (c<48||c>57){
                System.out.println("java.lang.NumberFormatException: For input string: \""+c+"\"");
            }
            else {
                i++;            
                arrayList.add(c);
            }
        }
        System.out.println(arrayList);
    }

}
