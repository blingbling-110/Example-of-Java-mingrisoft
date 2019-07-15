package c13_13;

import java.awt.*;
import javax.swing.*;

public class JComboBoxModelTest extends JFrame{
	JLabel jl = new JLabel("请选择证件：");
	JComboBox<String> jc = new JComboBox<String>(new MyComboBox());		//此处应用了JDK 7的新特性
	
	public JComboBoxModelTest() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jc);
		
		setTitle("这一个练习JComboBoxModel的程序");
		setBounds(300, 300, 688, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JComboBoxModelTest();
	}

}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	String selecteditem = null;
	String[] itemList = {"身份证", "军人证", "学生证", "工作证"};

	@Override
	public String getElementAt(int index) {				//根据索引返回值
		// TODO 自动生成的方法存根
		return itemList[index];
	}

	@Override
	public int getSize() {								//返回下拉列表框中项目的数目
		// TODO 自动生成的方法存根
		return itemList.length;
	}

	@Override
	public Object getSelectedItem() {					//获取下拉列表框中的项目
		// TODO 自动生成的方法存根
		return selecteditem;
	}

	@Override
	public void setSelectedItem(Object anItem) {		//设置下拉列表框项目
		// TODO 自动生成的方法存根
		selecteditem = (String) anItem;
	}
	
}