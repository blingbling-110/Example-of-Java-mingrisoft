package c13_3;

import java.awt.*;
import javax.swing.*;

public class DrawIcon implements Icon{
	private int width;		//声明图标的宽
	private int height;		//声明图标的长
	
	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DrawIcon icon = new DrawIcon(15,  15);
		
		JFrame jf = new JFrame("这是一个练习Icon接口的程序");
		Container c = jf.getContentPane();
		
		//创建一个标签，并设置标签上的文字在标签正中间
		JLabel jl = new JLabel("测试", icon, SwingConstants.CENTER);
		c.add(jl);
		
		jf.setBounds(300, 300, 344, 144);
		jf.setBackground(Color.white);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	@Override
	public int getIconHeight() {
		// TODO 自动生成的方法存根
		return this.height;
	}

	@Override
	public int getIconWidth() {
		// TODO 自动生成的方法存根
		return this.width;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO 自动生成的方法存根
		c.setForeground(Color.red);
		g.fillOval(x, y, width, height);		//绘制一个圆形
	}

}
