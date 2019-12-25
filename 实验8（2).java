/*
使用Swing组件做一个登录界面。要求有用户名、密码文本框及标签，两个按钮（登录和退出），
并能够响应鼠标单击按钮事件，即当单击“登录”按钮时显示“登录成功”，单击“退出”按钮时退出程序。
*/
package 实验八;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Two {
	private JFrame jframe;
	private JButton jb1;
	private JButton jb2;
	private JPanel  jpl;
	public void creat() {
		jframe = new JFrame("登陆界面");
		jframe.setSize(550, 500);
		jframe.setLocation(550, 450);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jpl = new JPanel();
		jpl.setSize(500, 400);
		jframe.add(jpl);
		
		Font font = new Font("宋体", Font.PLAIN, 25);
		
		jb1 = new  JButton("登录");
		jb2 = new  JButton("退出");
		jb1.setFont(font);
		jb2.setFont(font);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame jff = new JFrame();
				jff.setSize(150, 200);
				jff.setLocation(250, 250);
				jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JTextField jtf = new JTextField("登录成功");
				jff.add(jtf);
				jff.setVisible(true);
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
			}
		});
		
		jpl.add(jb1);
		jpl.add(jb2);
		
		
		}
	
	public void show() {
		jframe.setVisible(true);
	}
}


package 实验八;

public class Demo2 {

	public static void main(String[] args) {
		Two ss = new Two();
		ss.creat();
		ss.show();
	}

}
