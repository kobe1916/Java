class student{
    String name = "student";
    int age = 15;
    public void stuMethod(){
        System.out.println("" +
                "学生的学习方法");
    }
    public void showStu(){
        System.out.println("学生的姓名："+name+",年龄"+age+
                ",学习方法如下：");
        stuMethod();
    }
}

class Undergraduate extends student{
    String name = "Undergraduate student";
    int age = 20;
    String major  = "JAVALanguage";
    String degree  =  "本科";
    public void stuMethod(){
        System.out.println("本科生的学习方法");
    }
    public void showUnd(){
        System.out.println("学生的姓名："+name+",年龄"+age+
                ",学习方法如下：");
        System.out.println("专业："+major+",学位："+degree+",学习方法如下：");
        stuMethod();
    }
}
class GraduateStu extends Undergraduate{
    String name="Graduate student";
    int age=25;
    String major="C++Language";
    String degree="研究生";
    String researchDir="人工智能";
    public void stuMethod() {
        System.out.println("研究生的学习方法");
    }
    public void showGra() {
        System.out.println("学生的姓名:"+name+",年龄:"+age);
        System.out.println("专业:"+major+",学位:"+degree+
                ",学习方法如 下： ");
        stuMethod();
    }
}

public class Student1 {
    public static void main(String[] args){
        student a = new student();
        Undergraduate b = new Undergraduate();
        GraduateStu c= new GraduateStu();
        a.showStu();
        b.showStu();
        c.showStu();

    }
}
