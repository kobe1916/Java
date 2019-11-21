/*
 创建一个对象：
1.分配对象方法，并将对象成员变量初始化为0或空
2.执行属性值的显示初始化
3.执行构造方法
4.返回对象的地址给相关的变量

this的本质“创建好的对象的地址”
由于在构造方法调用前，对象以创建，因此在构造方法中也可以使用this代表“当前对象”
*/

package 面向对象;

public class TestThis {
    int a,b,c;
    TestThis(int a,int b){
        this.a = a;//this指当前对象
        this.b = b;
    }
    TestThis(int a,int b,int c){
        this(a,b);//构造器调用必须放在第一句
        this.c = c;
    }
    void sing(){}
    void eat(){
        this.sing();//
        System.out.println("你妈妈喊你回家吃饭");
    }
    public static void main(String[] args){
        TestThis hi = new TestThis(2,3);
        hi.eat();
    }
}
