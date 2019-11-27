/*
（1）有以下两个数组：
数组a：1，7，9，11，13，15，17，19；
数组b：2，4，6，8，10
要求将两个数组合并为数组c，并按升序排列。将数组c输出。

代码：
*/
package 实验;

import java.util.Arrays;

public class Arrayusing {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[14];

        System.arraycopy(a, 0, c, 1, 8);
        System.arraycopy(b, 0, c, 9, 5);

        Arrays.sort(c);

        for (int i = 1; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
