package c13_5;

import java.awt.*;
import javax.swing.*;

public class AbsolutePosition extends JFrame{
	public AbsolutePosition() {
		setTitle("������ʹ�þ��Բ���");
		setLayout(null);		//ʹ�ô���ȡ�����ֹ���������
		setBounds(300, 300, 1032, 432);
		Container c = getContentPane();
		
		JButton jb1 = new JButton("��ť1");
		JButton jb2 = new JButton("��ť2");
		jb1.setBounds(100, 200, 80, 30);
		jb2.setBounds(200, 100, 100, 20);
		c.add(jb1);
		c.add(jb2);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new AbsolutePosition();
	}

}
