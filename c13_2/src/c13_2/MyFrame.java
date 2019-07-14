package c13_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("����һ��JFrame����");		//�ڴ��������ñ�ǩ
		//����ǩ���������ڱ�ǩ�м�λ��
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb = new JButton("�����Ի���");			//����һ����ť
		jb.setBounds(10, 10, 100, 21);
		jb.addActionListener(new ActionListener() {		//Ϊ��ť�����굥���¼�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				//ʹMyJDialog����μ�
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(jb);
		container.setBackground(Color.white);
		setSize(1024, 768);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new MyFrame();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(MyFrame frame) {
		//ʵ����һ��JDialog�����ָ���Ի���ĸ����塢������������
		super(frame, "��һ��JDialog����", true);
		Container container = getContentPane();			//����һ������
		container.add(new JLabel("����һ���Ի���"));		//����������ӱ�ǩ
		setBounds(200, 200, 400, 300);					//���öԻ������С
	}
}