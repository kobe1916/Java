import java.awt.*;
import javax.swing.*;
public class Ballgame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 100;//小球的横坐标
    double y = 100;//小球的纵坐标
    boolean right = true;

    //画窗口的方法
    public void paint(Graphics g){
        System.out.println("窗口被划了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
       //让小球动起来 x+=1;

        if(right){
            x +=20;
        }else{
            x -=20;
        }

        if(x>856-40-30){//减去边框和直径  实现碰边返回
            right = false;
        }
        if(x<40){
            right = true;
        }
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        //重画窗口  每秒25次
        while(true){
            repaint();
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }
    public static void main(String[] args){
        Ballgame game = new Ballgame();
        game.launchFrame();

    }
}
//版本一：出现窗口
//版本二：加载图片
//版本三：使小球动起来（来回移动）
