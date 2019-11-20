package 实验;
interface ClassName{
    public String getClassName();
}
class Company implements ClassName{
        String name;
        public Company(String a) {
        this.name =a;
        }
        public String getClassName() {
        return name;
        }
        }
public class ClassName1{
    public static void main(String[] args) {
        Company a=new Company("万达科技");
        System.out.println(a.getClassName());
    }
}
