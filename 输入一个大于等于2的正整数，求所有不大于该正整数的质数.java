import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        for (int i = 2; i <= 30; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
            if ( i % j == 0) {
            flag = false;
            break;
            }
            }
            if(flag)
            {System.out.print(i+" ");}
            }
            }
                
            

    
    }
