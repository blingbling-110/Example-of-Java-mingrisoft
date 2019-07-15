package c18_3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread  t;
	//������ɫ����
	private static Color[] color = {
			Color.BLACK, Color.BLUE, Color.CYAN,
			Color.GREEN, Color.ORANGE, Color.YELLOW,
			Color.RED, Color.PINK, Color.LIGHT_GRAY
	};
	private static final Random rand = new Random();		//�����������
	
	private static Color getC() {							//��ȡ�����ɫֵ�ķ���
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest() {
		t = new Thread(new Runnable() {						//���������̶߳���
			int x = 30;										//�����ʼ����
			int y = 50;
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(200);					//�߳�����0.3��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//��ȡ�����ͼ�����Ķ���
					Graphics grapthics = getGraphics();
					grapthics.setColor(getC());				//���û�ͼ��ɫ
					//����ֱ�߲�������ֱ����
					grapthics.drawLine(x, y, 100, y++);
					if(y >= 80)
						y = 50;
				}
			}
		});
		t.start();											//�����߳�
	}
	
	//��ʼ���������ķ���
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(300, 200, width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new SleepMethodTest(), 344, 144);
	}

}
