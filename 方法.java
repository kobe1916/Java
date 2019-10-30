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


//重载的方法：实际是完全不同的方法，知识名称相同而已（形参个数、类型、顺序不同）


public class TestOverload {
    public static void main(String[] args){
        System.out.println(add(3,5));
        System.out.println(add(2,3,4));

    }
    public static int add(int n1,int n2){
        int sum = n1+n2;
        return sum;
    }
   
    //调用非static方法时必须要在main中new一个新的对象才能调用，
    // 加static后可以直接在main方法中调用
    //个数不同构成重载
    public static /*加static方便调用*/int add(int n1,int n2,int n3){
        int sum = n1+n2+n3;
        return sum;
    }
    
    //类型不同构成重载
    //顺序不同构成重载
    
}
//只有参数名称不同不构成重载
//只有返回值不同不构成重载
//System.out.println()  就是一个方法的重载   打印类型、个数不同
