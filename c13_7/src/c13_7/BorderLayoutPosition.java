package c13_7;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPosition extends JFrame{
	//��������ڷ�λ�õ�����
	String[] border = {BorderLayout.CENTER, BorderLayout.NORTH,
			BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
	String[] buttonName = {"center button", "north button",
			"south button", "west button", "east button"};
	
	public BorderLayoutPosition() {
		setTitle("�������ʹ�ñ߽粼�ֹ�����");
		Container c = getContentPane();
		setLayout(new BorderLayout());		//��������Ϊ�߽粼�ֹ�����
		for(int i = 0; i < border.length; i++) {
			//����������Ӱ�ť�������ð�ť����
			c.add(border[i], new JButton(buttonName[i]));
		}
		
		setBounds(300, 300, 350, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new BorderLayoutPosition();
	}

}
