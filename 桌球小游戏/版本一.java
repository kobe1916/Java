import java.awt.*;
import javax.swing.*;
public class Ballgame extends JFrame {

    //窗口加载
    void launchFrame(){
        setSize(300,300);
        setLocation(50,50);
        setVisible(true);


    }
    public static void main(String[] args){
        Ballgame game = new Ballgame();
        game.launchFrame();

    }
}
//版本一：出现窗口
