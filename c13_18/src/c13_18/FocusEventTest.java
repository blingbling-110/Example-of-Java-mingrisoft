package c13_18;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.event.*;

public class FocusEventTest extends JFrame{
	public FocusEventTest() {
		JTextField jt = new JTextField("请单击其他文本框", 10);		//创建一个文本框
		JTextField jt2 = new JTextField("请单击我", 10);				//创建另外一个文本框
		jt.addFocusListener(new FocusListener() {
			
			//组件失去焦点时调用的方法
			@Override
			public void focusLost(FocusEvent e) {
				// TODO 自动生成的方法存根
				JOptionPane.showMessageDialog(null, "文本框失去焦点");
			}
			
			//组件获取焦点时调用的方法
			@Override
			public void focusGained(FocusEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jt);
		c.add(jt2);
		setTitle("这是一个练习FocusEvent的程序");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new FocusEventTest();
	}

}
