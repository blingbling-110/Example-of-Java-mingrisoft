package c13_16;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest extends JFrame{
	public JTextAreaTest() {
		JTextArea jt = new JTextArea("�ı���", 6, 6);
		jt.setLineWrap(true);		//�����Զ�����
		Container c = getContentPane();
		c.add(jt);
		setTitle("����һ����ϰJTextArea�ĳ���");
		setBounds(300, 300, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JTextAreaTest();
	}

}
