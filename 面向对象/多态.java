/*
多态是指同一个方法调用，由于对象不同可能会有不同的行为。
现实生活中，同一个方法，具体实现会完全不同

多态的要点：
1.多态是方法的多态，不是属性的多态（多条与属性无关）
2.多态的存在要有3哥必要条件：继承，方法重写。父类引用指向子类对象
3.父类中引用指向子类对象后，用改父类引用调用子类重写的方法，此时多态就出现了
 */
 
 package 面向对象.cn.java.oo;

/**
 * 测试多态
 */
public class TestPolym {
    public static void main(String[] args){
        Animal a = new Animal();
        animalCry(a);

        Dog d = new Dog();
        animalCry(d);

    }
    static void animalCry(Animal a){//父类对象调用子类方法
        a.shout();
    }

    /*   无多态则需重载方法实现
    static void animalCry(Dog a){
        a.shout();
    }

    static void animalCry(Cat a){
        a.shout();
    }
     */
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    public void shout(){//重写
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void shout(){//重写
        System.out.println("喵喵喵");
    }
}
