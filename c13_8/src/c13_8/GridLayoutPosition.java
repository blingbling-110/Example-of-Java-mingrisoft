package c13_8;

import java.awt.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition() {
		Container c = getContentPane();
		//��������ʹ�����񲼾ֹ�����������7��3�е�����
		setLayout(new GridLayout(7, 3, 5, 5));
		for(int i = 0; i < 20; i++) {
			c.add(new JButton("button" + i));		//ѭ����Ӱ�ť
		}
		
		setTitle("����һ��ʹ�����񲼾ֹ������Ĵ���");
		setBounds(300, 300, 300, 300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new GridLayoutPosition();
	}

}
