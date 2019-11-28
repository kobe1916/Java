/*
 创建一个对象：
1.分配对象方法，并将对象成员变量初始化为0或空
2.执行属性值的显示初始化
3.执行构造方法
4.返回对象的地址给相关的变量

this的本质“创建好的对象的地址”
由于在构造方法调用前，对象以创建，因此在构造方法中也可以使用this代表“当前对象”
*/

/*
• this的作用:
• this表示的是当前对象本身，
• 更准确地说， this代表当前对象的一个引用。
• 普通方法中使用this。
• 区分类成员属性和方法的形参.
• 调用当前对象的其他方法（可以省略）
• 位置： 任意
• 构造方法中使用this。
• 使用this来调用其它构造方法
• 位置： 必须是第一条语句
• this不能用于static方法。 
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
