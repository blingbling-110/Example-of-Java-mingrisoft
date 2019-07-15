package c18_5;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread t;
	
	public InterruptedSwing() {
		super();
		final JProgressBar pb = new JProgressBar();		//����������
		//�������������ڴ������λ��
		getContentPane().add(pb, BorderLayout.NORTH);
		pb.setStringPainted(true);						//���ý���������ʾ����
		t = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb.setValue(++count);				//���ý������ĵ�ǰֵ
					if(count == 50)
						t.interrupt();					//�ж��߳�
					try {
						Thread.sleep(100);				//ʹ�߳�����0.1��
						//��׽InterruptedException�쳣
					} catch (InterruptedException e) {
						System.out.println("��ǰ�߳����ж�");
						break;
					}
				}
			}
		});
		t.start();										//�����߳�
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(300, 200, width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new InterruptedSwing(), 344, 144);
	}

}
