package c13_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("����һ����ϰJDialog��ĳ���");
		Container c = getContentPane();
		c.setLayout(null);								//ȡ�������Ĳ��ֹ�����
		c.setBackground(Color.white);					//���������ı�����ɫ
		
		JLabel jl = new JLabel("����һ��JFrame����");		//�ڴ��������ñ�ǩ
		//����ǩ���������ڱ�ǩ�м�λ��
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setBounds(50, 50, 300, 20);
		c.add(jl);
		
		JButton jb = new JButton("�����Ի���");			//����һ����ť
		jb.setBounds(100, 100, 100, 21);
		jb.addActionListener(new ActionListener() {		//Ϊ��ť�����굥���¼�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				//ʹMyJDialog����ɼ�
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		c.add(jb);
		
		//���ô���رշ�ʽ
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 1032, 432);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new MyFrame();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(MyFrame f) {
		//ʵ����һ��JDialog�����ָ���Ի���ĸ����塢������������
		super(f, "��һ��JDialog����", true);
		Container c = getContentPane();
		c.add(new JLabel("����һ���Ի���"));		//����������ӱ�ǩ
		setBounds(688, 288, 344, 144);
	}
}