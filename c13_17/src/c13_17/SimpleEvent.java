package c13_17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleEvent extends JFrame{
	private JButton jb = new JButton("我是按钮，单击我");

	public SimpleEvent() {
		setLayout(null);
		Container c = getContentPane();
		c.add(jb);
		jb.setBounds(10, 10, 100, 30);
		//为按钮添加一个实现ActionListener接口的对象
		jb.addActionListener(new jbAction());
		setTitle("这是一个练习ActionListener的程序");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	//定义内部类实现ActionListener接口
	class jbAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			jb.setText("我被单击了");
		}
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new SimpleEvent();
	}

}
