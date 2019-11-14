package 面向对象;

public class User2 {
    //成员变量
    int id;//id
    String name;//账户名
    String pwd;//密码

    //重载：方法名相同、形参列表不同    //构造器重载跟方法重载没有什么两样
    public User2(){
    }
    public User2(int id/*局部变量*/,String name){
        //super();   构造方法的第一句总是super()
        this.id = id;//this表示创建好的对象   this.id 指成员变量
        this.name = name;
    }
    public User2(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static void main(String[] args){
        User2 u1= new User2();
        User2 u2 = new User2 (101,"高小七");
        User2 u3 = new User2(100,"高崎","13456");
    };
}

