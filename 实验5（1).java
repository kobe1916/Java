package 实验;
class Staff {
    String name;
    int age;
    char sex;

    public Staff(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void ShowStaff() {
        System.out.printf("该员工的姓名为:%s,年龄为:%d,性别为:%c\n",
                this.name,
                this.age,
                this.sex);
    }
}
    class Manager extends Staff {
        int salary;
        String duty;

        public Manager(String name, int age, char sex, int a, String duty) {
            super(name, age, sex);
            this.salary = a;
            this.duty = duty;
        }

        public void ShowManager() {
            System.out.printf("该管理者的姓名为:%s,年龄为:%d,性别为:%c,职务 为:%s,年薪为:%d 万\n",
                    name, age, sex, duty, salary);
        }
    }

public class 员工类 {
    public static void main(String[] args) {
        Staff a=new Staff("张三",23,'男');
        Manager b =new Manager("李四",34,'男',10,"经理");
        a.ShowStaff();
        b.ShowManager();
    }
}
