/*
静态内部类：
1.定义方式
static  class ClassName{
//类体
}
2.使用要点：
  1.当一个静态内部类对象存在，并不一定存在对应的外部类对象，因此，静态内部类的实例方法不能直接访问外部类的实例方法
  2.静态内部类看作外部类的一个静态成员。因此，外部类的方法可以通过：“静态内部类.名字”的方式访问静态内部类的静态成员，通过new静态内部类（）访问静态内部类的实例

*/


package 面向对象2;

/**
 * 测试静态内部类
 */
public class TestStaticInnerClass {
    public static void main(String[] args){
        Outer2.Inner2 inner = new Outer2.Inner2();

        //inner.方法
    }
}

class Outer2{
    static class Inner2{
        //相当于外部类的一个静态成员

    }
}
