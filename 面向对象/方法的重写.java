/*
方法的重写：
子类通过重写父类的方法，可以用自身的行为替换父类的行为

三个要点：
1. “==”方法名、形参列表相同
2. “<=" 返回值类型和声明异常类型，子类小于等于父类
3. “>=" 访问权限，子类大于等于父类
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
