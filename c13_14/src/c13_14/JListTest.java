package c13_14;

import java.awt.*;
import javax.swing.*;

public class JListTest extends JFrame{
	public JListTest() {
		Container c = getContentPane();
		c.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());		//此处应用了JDK 7的新特性
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		c.add(js);
		setTitle("这是一个练习JList的程序");
		setBounds(100, 100, 344, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JListTest();
	}

}

class MyListModel extends AbstractListModel<String> {		//继承抽象类AbstractListModel
	//设置列表框内容
	private String[] contents = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return contents.length;
	}

	@Override
	public String getElementAt(int index) {
		// TODO 自动生成的方法存根
		if(index < contents.length)
			return contents[index++];
		else
			return null;
	}
	
}