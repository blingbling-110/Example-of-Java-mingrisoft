package c13_14p;

import java.awt.*;
import javax.swing.*;

public class DefaultListModelTest extends JFrame{
	public DefaultListModelTest() {
		final String[] flavors = {"�б�1", "�б�2", "�б�3", "�б�4", "�б�5", "�б�6"};
		final DefaultListModel iltems = new DefaultListModel();
		final JList l = new JList(iltems);		//ʵ����JList����
		for(int i = 0; i < 4; i++) {
			iltems.addElement(flavors[i]);		//Ϊģ���������
		}
		Container c = getContentPane();
		c.add(l);
		setTitle("����һ����ϰDefaultListModel�ĳ���");
		setBounds(100, 100, 344, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new DefaultListModelTest();
	}

}
