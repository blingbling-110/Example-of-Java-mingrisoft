package c13_17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleEvent extends JFrame{
	private JButton jb = new JButton("���ǰ�ť��������");

	public SimpleEvent() {
		setLayout(null);
		Container c = getContentPane();
		c.add(jb);
		jb.setBounds(10, 10, 100, 30);
		//Ϊ��ť���һ��ʵ��ActionListener�ӿڵĶ���
		jb.addActionListener(new jbAction());
		setTitle("����һ����ϰActionListener�ĳ���");
		setBounds(100, 100, 344, 144);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	//�����ڲ���ʵ��ActionListener�ӿ�
	class jbAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			jb.setText("�ұ�������");
		}
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new SimpleEvent();
	}

}
