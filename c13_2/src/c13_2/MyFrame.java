package c13_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");		//在窗体中设置标签
		//将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb = new JButton("弹出对话框");			//定义一个按钮
		jb.setBounds(10, 10, 100, 21);
		jb.addActionListener(new ActionListener() {		//为按钮添加鼠标单击事件
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				//使MyJDialog窗体课件
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(jb);
		container.setBackground(Color.white);
		setSize(1024, 768);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyFrame();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(MyFrame frame) {
		//实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
		super(frame, "第一个JDialog窗体", true);
		Container container = getContentPane();			//创建一个容器
		container.add(new JLabel("这是一个对话框"));		//在容器中添加标签
		setBounds(200, 200, 400, 300);					//设置对话框窗体大小
	}
}