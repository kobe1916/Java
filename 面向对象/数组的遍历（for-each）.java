/*
增强for循环for-each是专门用于读取数组或集合中所有的元素
即对数组进行遍历

*/

public class Test02{
    public static void main(String[] args){
        int[] a = new int[4];
        //初始化数组元素的值
        for(int i = 0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("#########");
        //foreach循环：用于读取元素的值，不能修改元素的值
        for(int m:a){
            System.out.println(m);
        }
    }
}
