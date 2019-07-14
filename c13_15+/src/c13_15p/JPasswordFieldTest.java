package c13_15p;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordFieldTest extends JFrame{
	public JPasswordFieldTest() {
		final JPasswordField jp = new JPasswordField("aaa", 20);
		jp.setEchoChar('@');		//改变密码框的回显字符
		final JButton jb = new JButton("清除");
		jp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jp.setText("触发事件");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jp.setText("");
				jp.requestFocus();
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jp);
		c.add(jb);
		setTitle("这是一个练习TextField类的程序");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JPasswordFieldTest();
	}

}
