/*
Java通过使用”访问控制符“来控制那些袭击需要封装，那些细节需要暴露的
1.private 表示私有，只能自己类访问
2.default表示没有修饰符修饰，只有同一个包的类能访问
3.protected表示可以被同一包中所有的类访问
4.public表示可以被该项目的所有包中的所有类访问

类的属性的处理：
1.一般使用private访问权限
2.提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作（注意：boolean变量的get方法是is开头！）
3.一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰
*/


package 面向对象.cn.java.oo;

public class Person4 {
    public static void main(String[] args){

        Person11 p = new Person11();
        //p.age =14;
        p.setAge(14);

        System.out.println(p.getAge());
    }
}

class Person11 {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("请输入正确的年龄");
        }
    }

    public int getAge() {
        return this.age;
    }

}




//JavaBean的封装实例
public class Person{
    //属性一般使用private修饰
    private String name;
    private int age;
    private boolean flag;
    //为属性提供public修饰的set/get方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public boolean isflag(){//注意：boolean类型的属性get方法是is开头的
        return flag;
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }
}
