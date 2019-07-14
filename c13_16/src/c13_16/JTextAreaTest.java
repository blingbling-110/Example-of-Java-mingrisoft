package c13_16;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest extends JFrame{
	public JTextAreaTest() {
		JTextArea jt = new JTextArea("文本域", 6, 6);
		jt.setLineWrap(true);		//可以自动换行
		Container c = getContentPane();
		c.add(jt);
		setTitle("这是一个练习JTextArea的程序");
		setBounds(300, 300, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JTextAreaTest();
	}

}
