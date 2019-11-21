/*
Java中，方法中所有的参数都是“值传递”也就是说“传递的是值的副本”

引用类型参数的传值
  传递的是值的副本，但是引用类型指的是“对象的地址”
因此改变副本指向地址对象的值，一位置原参数指向对象的值也发生了改变
*/

package 面向对象;

public class 传参 {
    int id;
    String name;
    String pwd;
    public 传参(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(传参 u) {
        u.name = "搞笑吧";
    }

    public void testParameterTransfer02(传参 u) {
        u = new 传参(200,"高三");
    }

    public static void main(String[] args){
        传参 u1 = new 传参(100,"高小七");

        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
