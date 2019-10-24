import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nums = 0 ,alpha = 0 ,space = 0 ,others = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int j=0;j<str.length();j++){
            char i = str.charAt(j);
            if(i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z'){
                alpha ++;
            }else if(i >= '0' && i <= '9'){
                nums ++;
            }else if(i == ' '){
                space ++;
            }else{
                others++;
            }
        }
        System.out.println("字母个数：" + alpha);
        System.out.println("数字个数：" + nums);
        System.out.println("空格个数：" + space);
        System.out.println("其他字符个数：" + others);
    }
}
