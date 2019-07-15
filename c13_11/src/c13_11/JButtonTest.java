package c13_11;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class JButtonTest extends JFrame{
	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));			//设置网格布局管理器
		Container c = getContentPane();					//获取容器
		for(int i = 0; i < 5; i++) {
			//创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button" + i, icon);
			c.add(J);									//在容器中添加按钮
			if(i % 2 == 0) {
				J.setEnabled(false);					//设置其中一些按钮不可用
			}
		}
		JButton jb = new JButton();						//实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(96, 96));		//设置按钮与图片相同大小
		jb.setIcon(icon);								//为按钮设置图标
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");					//设置按钮提示为文字
		jb.setBorderPainted(false);						//设置按钮边界不显示
		jb.addActionListener(new ActionListener() {		//为按钮添加监听事件
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				//弹出确认对话框
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		c.add(jb);										//将按钮添加到容器中
		
		setTitle("这是一个练习JButton的程序");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(300, 300, 688, 288);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JButtonTest();
	}

}
