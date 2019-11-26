/*
”==“代表比较双方是否相同。
如果是基本类型则表示值相等
如果是引用类型则表示地址相等即是同一个对象
Object类中定义有：public boolean equals(Object obj)方法，
提供定义”对象内容相等“的逻辑
*/

package 面向对象.cn.java.oo;

public class TestEquals {
    public static void main(String[] args){
        Object obj;
        String str;

        User u1 = new User(1000,"gaoqi","123456");
        User u2 = new User(1000,"gaoxixi","123456");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("sxt");
        String str2 = new String("sxt");
        System.out.println(str1 ==str2);
        System.out.println(str1.equals(str2));

    }
}
class User{
    int id;
    String name;
    String pwd;


    public User(int id,String name,String pwd){
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public int hashCode(){//可有可无
        final int prime =31;
        int result = 1;
        result = prime*result+id;
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        User other = (User)obj;
        if(id != other.id)
            return false;
        return true;
    }
}

/*
补充：
https://blog.csdn.net/weixin_44509889/article/details/93347191


              Java中基本类型和引用类型的区别
一、基本数据类型：
byte：Java中最小的数据类型，在内存中占8位(bit)，即1个字节，取值范围-128~127，默认值0
short：短整型，在内存中占16位，即2个字节，取值范围-32768~32767，默认值0
int：整型，用于存储整数，在内在中占32位，即4个字节，取值范围-2147483648~2147483647，默认值0
long：长整型，在内存中占64位，即8个字节-263~263-1，默认值0L
float：浮点型，在内存中占32位，即4个字节，用于存储带小数点的数字（与double的区别在于float类型有效小数点只有6~7位），默认值0
double：双精度浮点型，用于存储带有小数点的数字，在内存中占64位，即8个字节，默认值0
char：字符型，用于存储单个字符，占16位，即2个字节，取值范围0~65535，默认值为空
boolean：布尔类型，占1个字节，用于判断真或假（仅有两个值，即true、false），默认值false
二、引用数据类型：
类、接口类型、数组类型、枚举类型、注解类型。
区别：
基本数据类型在被创建时，在栈上给其划分一块内存，将数值直接存储在栈上。
引用数据类型在被创建时，首先要在栈上给其引用（句柄）分配一块内存，而对象的具体信息都存储在堆内存上，然后由栈上面的引用指向堆中对象的地址。

相关知识：
静态区： 保存自动全局变量和 static 变量（包括 static 全局和局部变量）。静态区的内容在总个程序的生命周期内都存在，由编译器在编译的时候分配。
堆区： 一般由程序员分配释放，由 malloc 系列函数或 new 操作符分配的内存，其生命周期由 free 或 delete 决定。在没有释放之前一直存在，直到程序结束，由OS释放。其特点是使用灵活，空间比较大，但容易出错
栈区： 由编译器自动分配释放，保存局部变量，栈上的内容只在函数的范围内存在，当函数运行结束，这些内容也会自动被销毁，其特点是效率高，但空间大小有限
文字常量区： 常量字符串就是放在这里的。 程序结束后由系统释放
*/
