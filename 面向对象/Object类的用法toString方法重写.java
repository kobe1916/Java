/*
Object类是所有Java类的根基类，
也就意味着所有的Java对象都拥有Object类的属性和方法
*/

package 面向对象.cn.java.oo;

/**
 * 重写toString方法
 */
public class TestObject {
    public static void main(String[] args){

        TestObject to = new TestObject();
        System.out.println(to.toString());

        Person2 p2 = new Person2("xixi",6);
        System.out.println(p2.toString());
    }

    public String toString(){
        return "测试Object对象";
    }
}
class Person2{
    String name;
    int age;

    public String toString(){//大小写必须完全相同 ，不同就是新的方法了
        return name+",年龄:"+age;
    }

    public Person2(String name,int age){
        this.name = name;
        this.age = age;

    }
}
