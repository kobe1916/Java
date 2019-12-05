/*
内部类： 成员内部类（非静态内部类、静态内部类）、匿名内部类、局部内部类

非静态内部类（外部类里使用非静态内部类和平时使用其他类没有什么不同）
1.非静态内部类必须寄存在一个外部类对象里。因此，如果有一个非静态内部类对象那么一定存在对应的外部类对象
非静态内部类对象单独属于外部类的某个对象
2.非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员
3.非静态内部类不能有静态方法、静态属性和静态初始化块
4.外部类的静态方法、静态代码块不能访问非静态内部类，包括不能使用非静态内部类定义变量、创建实例

成员变量访问要点：
1.内部类里方法的局部变量：变量名
2.内部类属性：this.变量名
3.外部类属性：外部类名.this.变量名
*/


package 面向对象2;

import javax.swing.*;

/**
 * 测试非静态内部类
 */
public class TestInnerClass {
    public static void main(String[] args){

        //创建内部类对象
        Outer.Inner in = new Outer().new Inner();

        in.show();//调用方法才运行  不调用不运行
    }
}
class Outer {
    private int age = 10;

    public void testOuter() {}

        class Inner{
            /*非静态内部类  加static为静态内部类*/
            int age = 20;

            public void show() {
                int age = 30;
                System.out.println("外部类的成员变量age" + Outer.this.age);
                System.out.println("内部类的成员变量age" + this.age);
                System.out.println("内部类的成员变量age" + age);
            }
        }

}
