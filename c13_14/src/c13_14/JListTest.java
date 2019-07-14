package c13_14;

import java.awt.*;
import javax.swing.*;

public class JListTest extends JFrame{
	public JListTest() {
		Container c = getContentPane();
		c.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());		//�˴�Ӧ����JDK 7��������
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		c.add(js);
		setTitle("����һ����ϰJList�ĳ���");
		setBounds(100, 100, 344, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JListTest();
	}

}

class MyListModel extends AbstractListModel<String> {		//�̳г�����AbstractListModel
	//�����б������
	private String[] contents = {"�б�1", "�б�2", "�б�3", "�б�4", "�б�5", "�б�6"};

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return contents.length;
	}

	@Override
	public String getElementAt(int index) {
		// TODO �Զ����ɵķ������
		if(index < contents.length)
			return contents[index++];
		else
			return null;
	}
	
}