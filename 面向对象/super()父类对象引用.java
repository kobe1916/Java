/*
super是直接父类对象的引用
可以通过super来访问父类中被子类覆盖的方法或属性
使用super调用普通方法，语句没有位置限制，可以在子类中随便调用
若是构造方法的第一行代码没有显式的调用super（...)或者this(...)
那么Java默认都会调用super（），含义是调用父类的无参数构造方法
这里super（）可以省略
*/

package 面向对象.cn.java.oo;

public class TestSuper01 {
    public static void main(String[] args){
        new ChildClass().f();
    }
}
class FatherClass{
    public int value;

    public void f(){
        value = 100;
        System.out.println("FatherClass.value="+value);

    }
}

class ChildClass extends FatherClass{
    public int value;

    public void f(){
        super.f();//调用父类对象的普通方法
        value = 200;
        System.out.println("ChildClass.value="+value);
        System.out.println(value);
        System.out.println(super.value);;//调用父类对象的成员变量
    }
}




package 面向对象.cn.java.oo;

public class TestSuper02 {
    public static void main(String[] atgs){
        System.out.println("开始创建一个ChildClass对象");
        new ChildClass2();
    }
}
class FatherClass2{
    public FatherClass2(){
        System.out.println("创建FatherClass");
    }
}
class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        //super(); 永远位于构造方法第一句  默认都会调用   上溯！！！
        //所以先打印Father Class然后打印ChildClass
        System.out.println("创建ChildClass");
    }
}
