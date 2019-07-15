package c13_6;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("本窗体使用流布局管理器");
		Container c = getContentPane();
		//设置窗体使用流布局管理器，使组件右对齐，并且设置组件之间的水平间隔与垂直间隔
		setLayout(new FlowLayout(2, 10, 10));
		for(int i = 0; i < 10; i++) {		//在容器中循环添加10个按钮
			c.add(new JButton("button" + i));
		}
		setBounds(300, 300, 300, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new FlowLayoutPosition();
	}

}
