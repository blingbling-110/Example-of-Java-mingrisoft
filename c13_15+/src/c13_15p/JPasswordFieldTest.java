package c13_15p;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordFieldTest extends JFrame{
	public JPasswordFieldTest() {
		final JPasswordField jp = new JPasswordField("aaa", 20);
		jp.setEchoChar('@');		//�ı������Ļ����ַ�
		final JButton jb = new JButton("���");
		jp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jp.setText("�����¼�");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jp.setText("");
				jp.requestFocus();
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jp);
		c.add(jb);
		setTitle("����һ����ϰTextField��ĳ���");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JPasswordFieldTest();
	}

}
