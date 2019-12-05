/*
匿名内部类
  适合那种只需要使用一次的类。比如：键盘监听操作等等
new 父类构造器（实参类表） \实现接口（）{
//匿名内部类类体
}
注意：
1.匿名内部类没有访问修饰符
2.匿名内部类没有构造方法。因为它连名字都没有那又何来构造方法呢
*/


package 面向对象2;

/**
 * 测试匿名内部类
 */

public class TestAnonymousInnerClass {
    public static void test01(AA a){
        a.aa();//在这调用
    }
    public static void main(String[] args){
        TestAnonymousInnerClass.test01(new AA(){//定义类体

            public void aa(){
                System.out.println("aaaaaaaaaa");
            }
        });
    }

}
interface AA{
    void aa();
}






局部内部类
定义在方法内部的，作用域只限于本方法
public class Test2{
    public void show(){
        //作用域仅限于该方法
        class Inner{
            public void fun(){
                System.out.println("hello");
            }
        }
        new Inner().fun();
    }
    public static void main(String[] args){
        new Test2().show();
    }
}




