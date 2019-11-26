/*

1.父类也称超类、基类、派生类
2.Java中只有单继承，没有像c++中的多继承，多继承会引起混乱，是的继承链过于复杂，系统难于维护
3.Java中没有多继承，接口有多继承
4.子类继承父类，可以得到父类的全部属性和方法（除了父类的构造方法），但不见得可以直接访问（比如，父类私有的属性和方法）
5.定义一个 类时，没有调用extends，则它的父类时：java.lang.Object
*/

//ctrl+T可以方便的查看类的继承层次结构
//使用extends实现继承
public class TestExtend{
      public static void main(String[] args){
	Student stu = new Student();
	stu.name = "gaoqi";
	stu.height = 172;
	stu.rest();

	Student stu2 = new Student("xixi",6,"wajueji");
        }
}
	


class Person{
	String name;
	int height;

	public void rest(){
	System.out.println("休息一会");
	}
}
class Student extends Person{
	/*String name;
	int height;*/
	String major;
	
	public void study(){
	System.out.println("学习两小时");
	}
	/*public void rest(){
	System.out.println("休息一会");
	}*/
	public Student(String name,int height,String major){
	this.name = name;
	this.height = heighe;
	this.major = major;
	}


} 
	      
	      
/*
instanceof运算符：
instanceof是二元运算符，左边是对象，右边是类；
当对象是右面类或子类所创建的对象时，返回true；否则返回false
public class Test{
	public static void main(String[] args){
		Student s = new Student("gaoqi",172,"java");
		System.out.println(s instanceof Person);
		System.out.println(s  instanceof Student);
	}
}
//两句语句的输出都是true
*/
