/*
设计一个表示用户的User类，类中的变量有用户名、口令和记录用户个数的静态变量，
定义类的3个构造方法（无参、为用户名赋值、为用户名和口令赋值）、
设置用户名和口令的方法。定义测试类测试User类。*/
import java.util.*;
class User{
    public String name , pwd;
    public static int num;
    public User(){
        }
    public User(String name) {
        this.name = name;
    }
    public User(String name,String pwd){
        this.name = name ;
        this.pwd = pwd;
    }
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name  = name;
    }
    public String toString(){
        return "name:"+name+"       pwd:"+pwd;
    }


}

public class User1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        User user1 = new User();
        User user2 = new User("kobe");
        User user3 = new User("james","123");
        user1.setName("wade");
        user1.setPwd("111");
        user2.setPwd("456");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
    }
}

