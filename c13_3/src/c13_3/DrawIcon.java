package c13_3;

import java.awt.*;
import javax.swing.*;

public class DrawIcon implements Icon{
	private int width;		//����ͼ��Ŀ�
	private int height;		//����ͼ��ĳ�
	
	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		DrawIcon icon = new DrawIcon(15,  15);
		
		JFrame jf = new JFrame("����һ����ϰIcon�ӿڵĳ���");
		Container c = jf.getContentPane();
		
		//����һ����ǩ�������ñ�ǩ�ϵ������ڱ�ǩ���м�
		JLabel jl = new JLabel("����", icon, SwingConstants.CENTER);
		c.add(jl);
		
		jf.setBounds(300, 300, 344, 144);
		jf.setBackground(Color.white);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	@Override
	public int getIconHeight() {
		// TODO �Զ����ɵķ������
		return this.height;
	}

	@Override
	public int getIconWidth() {
		// TODO �Զ����ɵķ������
		return this.width;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO �Զ����ɵķ������
		c.setForeground(Color.red);
		g.fillOval(x, y, width, height);		//����һ��Բ��
	}

}
