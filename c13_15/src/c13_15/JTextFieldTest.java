package c13_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldTest extends JFrame{
	public JTextFieldTest() {
		final JTextField jt = new JTextField("aaa", 20);
		final JButton jb = new JButton("清除");
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("触发事件");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("");
				jt.requestFocus();
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jt);
		c.add(jb);
		setTitle("这是一个练习TextField类的程序");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JTextFieldTest();
	}

}
