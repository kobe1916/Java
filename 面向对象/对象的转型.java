/*

对象的转型
 父类引用指向子类对象，我们成这个过程为像行转型，属于自动类型转换
 向上转型后的父类引用变量只能调用它编译类型的方法，不能调用它运行时类型的方法，
这时我们就需要进行类型的强制转换，我们称为向下转型
在向下转型过程中，必须将引用变量转成真实的子类类型（运行时类型）
否则会出现类型转换异常ClassCastException
*/

package 面向对象.cn.java.oo;


public class TestPolym {
    public static void main(String[] args){
        Animal a = new Animal();
        animalCry(a);

        Animal d = new Dog();//自动向上转型
        //Dog d = new Dog();
        animalCry(d);
        animalCry(new Cat());

        //d.seeDog();   不能调，因为编译器认为你是Animal

        Dog d2 = (Dog) d;//强制向下转型
        d2.seeDog();

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
    public void seeDog(){
        System.out.println("看门！！");
    }
}
class Cat extends Animal{
    public void shout(){//重写
        System.out.println("喵喵喵");
    }
}
