/*
方法的重写：
子类通过重写父类的方法，可以用自身的行为替换父类的行为

三个要点：
1. “==”方法名、形参列表相同
2. “<=" 返回值类型和声明异常类型，子类小于等于父类
3. “>=" 访问权限，子类大于等于父类
*/


/*             java方法重写的规定：

方法的声明： 权限修饰符 返回值类型 方法名（形参列表） throws 异常的类型{  
// 方法体
}
子类中的叫重写的方法， 父类中的叫被重写的方法
子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同
子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
特殊情况：子类不能重写父类被声明为private权限的方法
返回值类型：
父类是void，子类只能是void
父类是A类型，子类是A类或A类的子类
父类是基本数据类型（如：double），子类返回值类型必须相同

子类重写的方法抛出的异常的类型不大于父类被重写的方法抛出的异常类型
https://www.cnblogs.com/heliusKing/p/10835031.html
*/
package 面向对象.cn;

/**
 * 测试重写/覆盖
 */

public class TestOverride{
    public static void main(String[] args){
        Horse h = new Horse();
        h.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("run...");
    }

    public void stop(){
        System.out.println("stop!");
    }
    public Person whoIsPsg(){
         /*  如果是一个类作为返回类型可以说是返回一个对象,
        返回后可以调用它的getter,setter方法*/
        return new Person();
    }
    
}

class Horse extends Vehicle{
    public void run(){
        System.out.println("四蹄纷飞");
    }
    public Student whoIsPsg(){
        //public Object whoIsPsg
        //返回值类型小于等于父类的类型   Object>Person>Student
        return new Student();
    }

}
