package c13_13;

import java.awt.*;
import javax.swing.*;

public class JComboBoxModelTest extends JFrame{
	JLabel jl = new JLabel("��ѡ��֤����");
	JComboBox<String> jc = new JComboBox<String>(new MyComboBox());		//�˴�Ӧ����JDK 7��������
	
	public JComboBoxModelTest() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jc);
		
		setTitle("��һ����ϰJComboBoxModel�ĳ���");
		setBounds(300, 300, 688, 288);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JComboBoxModelTest();
	}

}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	String selecteditem = null;
	String[] itemList = {"���֤", "����֤", "ѧ��֤", "����֤"};

	@Override
	public String getElementAt(int index) {				//������������ֵ
		// TODO �Զ����ɵķ������
		return itemList[index];
	}

	@Override
	public int getSize() {								//���������б������Ŀ����Ŀ
		// TODO �Զ����ɵķ������
		return itemList.length;
	}

	@Override
	public Object getSelectedItem() {					//��ȡ�����б���е���Ŀ
		// TODO �Զ����ɵķ������
		return selecteditem;
	}

	@Override
	public void setSelectedItem(Object anItem) {		//���������б����Ŀ
		// TODO �Զ����ɵķ������
		selecteditem = (String) anItem;
	}
	
}