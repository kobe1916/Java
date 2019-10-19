import java.awt.*;
import javax.swing.*;
public class Ballgame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    //画窗口的方法
    public void paint(Graphics g){
        System.out.println("窗口被划了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,100,100,null);
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);


    }
    public static void main(String[] args){
        Ballgame game = new Ballgame();
        game.launchFrame();

    }
}
//版本一：出现窗口
//版本二：加载图片
