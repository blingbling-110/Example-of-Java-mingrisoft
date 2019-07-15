package c13_18;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.event.*;

public class FocusEventTest extends JFrame{
	public FocusEventTest() {
		JTextField jt = new JTextField("�뵥�������ı���", 10);		//����һ���ı���
		JTextField jt2 = new JTextField("�뵥����", 10);				//��������һ���ı���
		jt.addFocusListener(new FocusListener() {
			
			//���ʧȥ����ʱ���õķ���
			@Override
			public void focusLost(FocusEvent e) {
				// TODO �Զ����ɵķ������
				JOptionPane.showMessageDialog(null, "�ı���ʧȥ����");
			}
			
			//�����ȡ����ʱ���õķ���
			@Override
			public void focusGained(FocusEvent e) {
				// TODO �Զ����ɵķ������
				
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jt);
		c.add(jt2);
		setTitle("����һ����ϰFocusEvent�ĳ���");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new FocusEventTest();
	}

}
