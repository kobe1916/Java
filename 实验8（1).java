/*
1）在JFrame窗口中，加入一个内容面板，
在该面板上加入一个标签、一个按钮、一个文本框，
使用FlowLayout布局。设置标签、按钮、文本框的前景色、背景色、字体等属性。*/


package 实验八;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class One {
	 private JFrame jframe;
	 private JLabel jlb;
	 private JPanel jpel;
	 private JTextField jtfile;
	 private JButton jbt;
	
	 public void creat() {
		 jframe = new JFrame();
		 FlowLayout flow = new FlowLayout();
		 jframe.setSize(550, 450);
		 jframe.setLocation(100, 50);
		 jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jframe.setLayout(flow);
		 
		 jlb = new JLabel();
		 jlb.setBackground(Color.BLUE);
		 jlb.setForeground(Color.GREEN);
		 jlb.setBounds(500, 400, 200, 200);
		 
		 Font topfont = new Font("微软雅黑", Font.PLAIN, 20);
		 JLabel jlname = new JLabel("kkk");
		 jframe.add(jlname);
		 
		jtfile = new JTextField(15);
		jframe.add(jtfile);
		
		jbt = new JButton("点我");
		jbt.setFont(topfont);
		jframe.add(jbt);
		
		
		 
	 }
	 public void show() {
		 jframe.setVisible(true);
	 }
}


package 实验八;

public class Demo {

	public static void main(String[] args) {
		One ff = new One();
		ff.creat();
		ff.show();
	}

}




