package 面向对象;

public class Student {
    //属性  成员变量
    int id;
    String name;
    int age;

    Computer comp;//计算机
    //则根据这个类创建的对象都会包含上边的属性
    //方法  行为特征  功能实现
    void study(){
        System.out.println("学习"+comp.brand);
    }
    void play() {
        System.out.println("play game");
    }
    //构造方法  用于创建这个类的对象  无参的构造方法可以由系统自动创建
    Student(){
    }


    //以上相当于图纸  因为没有对象
    public static void main(String[] args){
        Student stu = new Student();//创建一个对象
        stu.id = 1001;
        stu.name = "高崎";
        stu.age = 18;
        stu.play();//调用方法
//一个Java文件可以写多个类  但是只能有一个public修饰的类
        Computer c1 = new Computer ();
        c1.brand = "联想";

        stu.comp = c1;
        stu.play();
        stu.study();
    }
}
class Computer/*没有括号*/{
    String brand;
}
