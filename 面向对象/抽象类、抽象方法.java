/*
抽象方法和抽象类：
抽象方法：
使用abstract修饰的方法，没有方法体，只有声明。
定义是一种“规范”，就是告诉子类必须给抽象方法提供具体的实现
抽象类：
包含抽象方法的类就是抽象类。通过abstract方法定义规范，然后要求子类必须定义具体实现。
通过抽象类，我们就可以做到严格限制子类的设计，使子类之间更加通用。

抽象类的使用要点：
1.有抽象方法的类只能定义成抽象类
2.抽象类不能实例化，即不能用new来实例化抽象类
3.抽象类可以包含属性、方法、构造方法，但是构造方法不能用new实例，只能用来被子类调用
4.抽象类只能用来被继承
5.抽象方法必须被子类实现
*/

package 面向对象2;

/**
 * 抽象类意义：为子类提供统一的、规范的模板。子类必须实现相关的抽象方法
 *
 */
public abstract class Animal {
    abstract public void shout();//抽象方法不需要方法体
    //第一：没有实现   第二：子类必须实现  (告诉子类必须实现？？？）

    public void run(){
        System.out.println("pao");
    }
    public static void main(String[] args){
        //Animal a = new Animal();  错误
        Animal a = new Dog();
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("wangwangwang");
    }
}
