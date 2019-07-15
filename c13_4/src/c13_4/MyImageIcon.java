package c13_4;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MyImageIcon extends JFrame{
	public MyImageIcon() {
		Container c = getContentPane();
		//��ȡͼƬ���ڵ�URL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);		//ʵ����Icon����
		
		//����һ����ǩ
		JLabel jl = new JLabel("����һ��JFrame����", icon, JLabel.CENTER);
		//�������ַ����ڱ�ǩ�м�
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);					//���ñ�ǩΪ��͸��״̬
		c.add(jl);
		
		setTitle("����һ����ϰImageIcon�ĳ���");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(200, 200, 688, 288);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new MyImageIcon();
	}

}
