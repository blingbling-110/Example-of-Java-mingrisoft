package c13_4;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MyImageIcon extends JFrame{
	public MyImageIcon() {
		Container c = getContentPane();
		//获取图片所在的URL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);		//实例化Icon对象
		
		//创建一个标签
		JLabel jl = new JLabel("这是一个JFrame窗体", icon, JLabel.CENTER);
		//设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);					//设置标签为不透明状态
		c.add(jl);
		
		setTitle("这是一个练习ImageIcon的程序");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(200, 200, 688, 288);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyImageIcon();
	}

}
