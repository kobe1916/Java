/*
在类中，用static声明的成员变量为静态成员变量，也称为类变量。
类变量的生命周期和类相同，在整个应用程序执行期间都有效。

static修饰的成员变量和方法，从属于类。普通变量和方法从属于对象。

构造方法用于对象的初始化
静态初始化块，用于类的初始化操作
在静态初始化块中不能直接访问非static成员

注意：
静态初始化块执行顺序（学完继承再看）：
1.上溯到Object类，先执行Object的静态初始化块，
再向下执行子类的静态初始化块，直到我们的类的静态初始化块为止
2.构造方法执行顺序和上面顺序一样
*/


package 面向对象;

public class User3 {
    int id;
    String name;
    String pwd;
    static String company;

    //静态块  类初始化时执行  不能调不同方法  构造器前执行
    static{
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args){
        User3 u3 = null;
    }
}
