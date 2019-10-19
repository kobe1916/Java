import java.awt.*;
import javax.swing.*;
public class Ballgame2 extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 100;//小球的横坐标
    double y = 100;//小球的纵坐标
    //boolean right = true;
    double degree = 3.14/3;  //弧度 此处就是60度

    //画窗口的方法
    public void paint(Graphics g){
        System.out.println("2窗口被划了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        //让小球动起来 x+=1;

         x+=10*Math.cos(degree);
         y+= 10*Math.cos(degree);

         //上下弹
         if(y>500-40-30||y<40+40){
             degree = -degree;
         }

         //左右弹
        if(x<40||x>856-40-30){
            degree = 3.14 - degree;

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
