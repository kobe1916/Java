/*
方法相当于带名字的语句块，类似于其他语言中的函数
*/


//方法的调用
public class TestMethod {
    public static void main(String[] args)
    {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.print1();

        tm.add(30,40,50);
        tm.add1(1,2,3);
        int a = tm.add1(1,2,3)+1000;
    //因为tm.add1()返回一个int类型，所以可以整体当作int类型
        System.out.println(a);
    }
    void print1()
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

    }
    void add(int a,int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
    int add1(int a,int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
        return sum;//return两个作用：1.结束方法的运行   2.返回值
    }

}
