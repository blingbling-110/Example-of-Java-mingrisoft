package c13_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("这是一个练习JDialog类的程序");
		Container c = getContentPane();
		c.setLayout(null);								//取消容器的布局管理器
		c.setBackground(Color.white);					//设置容器的背景颜色
		
		JLabel jl = new JLabel("这是一个JFrame窗体");		//在窗体中设置标签
		//将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setBounds(50, 50, 300, 20);
		c.add(jl);
		
		JButton jb = new JButton("弹出对话框");			//定义一个按钮
		jb.setBounds(100, 100, 100, 21);
		jb.addActionListener(new ActionListener() {		//为按钮添加鼠标单击事件
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				//使MyJDialog窗体可见
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		c.add(jb);
		
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 1032, 432);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyFrame();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(MyFrame f) {
		//实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
		super(f, "第一个JDialog窗体", true);
		Container c = getContentPane();
		c.add(new JLabel("这是一个对话框"));		//在容器中添加标签
		setBounds(688, 288, 344, 144);
	}
}