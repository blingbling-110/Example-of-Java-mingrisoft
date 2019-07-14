package c13_14p;

import java.awt.*;
import javax.swing.*;

public class DefaultListModelTest extends JFrame{
	public DefaultListModelTest() {
		final String[] flavors = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};
		final DefaultListModel iltems = new DefaultListModel();
		final JList l = new JList(iltems);		//实例化JList对象
		for(int i = 0; i < 4; i++) {
			iltems.addElement(flavors[i]);		//为模型添加内容
		}
		Container c = getContentPane();
		c.add(l);
		setTitle("这是一个练习DefaultListModel的程序");
		setBounds(100, 100, 344, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new DefaultListModelTest();
	}

}
