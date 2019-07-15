package c13_11;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class JButtonTest extends JFrame{
	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));			//�������񲼾ֹ�����
		Container c = getContentPane();					//��ȡ����
		for(int i = 0; i < 5; i++) {
			//������ť��ͬʱ���ð�ť������ͼ��
			JButton J = new JButton("button" + i, icon);
			c.add(J);									//����������Ӱ�ť
			if(i % 2 == 0) {
				J.setEnabled(false);					//��������һЩ��ť������
			}
		}
		JButton jb = new JButton();						//ʵ����һ��û��������ͼƬ�İ�ť
		jb.setMaximumSize(new Dimension(96, 96));		//���ð�ť��ͼƬ��ͬ��С
		jb.setIcon(icon);								//Ϊ��ť����ͼ��
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť");					//���ð�ť��ʾΪ����
		jb.setBorderPainted(false);						//���ð�ť�߽粻��ʾ
		jb.addActionListener(new ActionListener() {		//Ϊ��ť��Ӽ����¼�
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				//����ȷ�϶Ի���
				JOptionPane.showMessageDialog(null, "�����Ի���");
			}
		});
		c.add(jb);										//����ť��ӵ�������
		
		setTitle("����һ����ϰJButton�ĳ���");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(300, 300, 688, 288);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JButtonTest();
	}

}
