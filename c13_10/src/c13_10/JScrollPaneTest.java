package c13_10;

import java.awt.*;
import javax.swing.*;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		Container c = getContentPane();
		JTextArea ta = new JTextArea(20, 50);		//�����ı��������
		JScrollPane sp = new JScrollPane(ta);		//����JScrollPane������
		c.add(sp);
		setTitle("�������������ֱ�����");
		setBounds(200, 200, 300, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JScrollPaneTest();
	}

}
