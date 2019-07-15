package c13_10;

import java.awt.*;
import javax.swing.*;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		Container c = getContentPane();
		JTextArea ta = new JTextArea(20, 50);		//创建文本区域组件
		JScrollPane sp = new JScrollPane(ta);		//创建JScrollPane面板对象
		c.add(sp);
		setTitle("带滚动条的文字编译器");
		setBounds(200, 200, 300, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JScrollPaneTest();
	}

}
