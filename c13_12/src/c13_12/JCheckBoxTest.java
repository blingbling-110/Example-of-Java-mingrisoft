package c13_12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxTest extends JFrame{
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JTextArea jt = new JTextArea(10, 30);
	private JCheckBox jc1 = new JCheckBox("1");
	private JCheckBox jc2 = new JCheckBox("2");
	private JCheckBox jc3 = new JCheckBox("3");
	
	public JCheckBoxTest() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH, p1);
		c.add(BorderLayout.SOUTH, p2);
		
		final JScrollPane sp = new JScrollPane(jt);
		p1.add(sp);
		
		jc1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(jc1.isSelected()) {
					jt.append("��ѡ��1��ѡ��\n");
				}
			}
		});
		p2.add(jc1);
		
		jc2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(jc2.isSelected()) {
					jt.append("��ѡ��2��ѡ��\n");
				}
			}
		});
		p2.add(jc2);
		
		jc3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(jc3.isSelected()) {
					jt.append("��ѡ��3��ѡ��\n");
				}
			}
		});
		p2.add(jc3);
		
		setTitle("����һ����ϰJCheckBox�ĳ���");
		setBounds(300, 300, 688, 288);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JCheckBoxTest();
	}

}
