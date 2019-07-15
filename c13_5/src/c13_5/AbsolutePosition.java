package c13_5;

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition extends JFrame{
	public AbsolutePosition() {
		setTitle("本窗体使用绝对布局");
		setLayout(null);		//使该窗体取消布局管理器设置
		setBounds(300, 300, 1032, 432);
		Container c = getContentPane();
		
		JButton jb1 = new JButton("按钮1");
		JButton jb2 = new JButton("按钮2");
		jb1.setBounds(100, 200, 80, 30);
		jb2.setBounds(200, 100, 100, 20);
		c.add(jb1);
		c.add(jb2);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new AbsolutePosition();
	}

}
