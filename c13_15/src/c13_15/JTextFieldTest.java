package c13_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldTest extends JFrame{
	public JTextFieldTest() {
		final JTextField jt = new JTextField("aaa", 20);
		final JButton jb = new JButton("���");
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("�����¼�");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("");
				jt.requestFocus();
			}
		});
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jt);
		c.add(jb);
		setTitle("����һ����ϰTextField��ĳ���");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JTextFieldTest();
	}

}
