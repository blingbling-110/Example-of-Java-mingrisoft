package c13_6;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("������ʹ�������ֹ�����");
		Container c = getContentPane();
		//���ô���ʹ�������ֹ�������ʹ����Ҷ��룬�����������֮���ˮƽ����봹ֱ���
		setLayout(new FlowLayout(2, 10, 10));
		for(int i = 0; i < 10; i++) {		//��������ѭ�����10����ť
			c.add(new JButton("button" + i));
		}
		setBounds(300, 300, 300, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new FlowLayoutPosition();
	}

}
