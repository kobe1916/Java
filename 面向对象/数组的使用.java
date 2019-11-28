
/*

数组是相同数据类型数据的有序集合。
数组描述的是相同类型的若干数据，按照一定的先后次序排列组合而成
其中，每一个数据乘坐一个元素，每个元素可以通过一个索引（下标）来访问它们

数组的三个基本特点：
1.长度是确定的，数组一旦被创建，它的大小就是不可以改变的
2.其元素必须是相同类型，不允许出现混合类型
3.数组类型可以是任何数据类型，包括基本类型和引用类型

数组变量属引用黎欸选哪个，数组也可以看成是对象，
数组中的每个元素详单与该对象的成员变量

数组声明（两种）
type[] arr_name;  //推荐
type    arr_name;
注意：
1.声明的时候并没有实例化任何对象，只有在是李丽华数组对象时JVM才分配空间，这时才与长度有关
2.声明一个数组的时候并没有数组真正被创建
3.构造一个数组，必须指定长度

//创建基本类型一维数组
public class Test{
	public static void main(String[] args){
	int[] s = null;//声明
	s = new int[10];//给数组分配空间
	for(int i = 0;i<10;i++){
	s[i] = 2*i+1;//给数组赋值
	}
	}
}

//创建引用类型
class Man{
	private int age;
	privare int id;
	public Man(int id,int age){
	super();
	this.age = age;
	this.id = id;
	}
}
pubic class AppMain{
	public static void main(String[] args){
	Man[] mans;//声明引用类型数组
	 mans = new Man[10];//给引用类型数组分配空间

	Man m1= new Man(1,11);
	Man m2 = new Man(2,22);
	
	mans[0] = m1;//给引用类型数组元素赋值
	mans[1] = m2;//给引用类型数组元素赋值
	}
}

*/

package 数组;

public class Test01 {
    public static void main(String[] args){
        //声明  和 分配空间
        int[] arr01 = new int[10];
        String[] arr02 = new String[5];


        arr01[0]= 13;//索引下标赋值

        //通过循环初始化数组
        for(int i = 0;i< arr01.length;i++){
            arr01[i] = 10*i;
        }

        //通过循环读取数组
        for(int i = 0;i< arr01.length;i++) {
            System.out.println(arr01[i]);
        }

        User[] arr03 = new User[3];
        arr03[0] = new User(1001,"gaoqi");
        arr03[1] = new User(1002,"gao");
        arr03[2] = new User(1003,"qi");

        for(int i = 0;i<arr03.length;i++){
            System.out.println(arr03[i].getName());
        }
    }
}
class User{
    private int id;
    private String name;

    public User(int id,String name){
        super();
        this.id = id;
        this.name = name;//不能少
    }//构造器

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}







/*
数组初始化总共有三种：静态初始化、动态初始化、默认初始化

数组的默认初始化
  数组时引用类型，它的元素相当于类的实例变量，因此数组一经分配空间，
其中的每个元素也被按照实例变量同样的方式被隐式初始化

int a2[] = new int[2]//默认值：0.0
boolean[] b = new boolean[2];//默认值：false，false
String[] s = new String[2];//默认值：null,null
*/

package 数组;

/**
 * 测试数组的3种初始化方法
 */
public class Test02 {
    public static void main(String[] args){
        //静态初始化
        int[] a = {2,3,50};
        User[] b = {
                new User(1001,"zhangsan"),
                new User(1002,"lisi"),
                new User(1003,"gaoqi")
        };

        //默认初始化
        int[] c = new int[3];//默认给数组的元素进行赋值，赋值的规则和成员变量默认赋值规则一致

        //动态初始化
        int[] a1 = new int[2];//动态初始化数组，先分配空间
        a1[0] = 1;//给数组元素赋值
        a1[1] = 2;//给数组元素赋值
    }
}

