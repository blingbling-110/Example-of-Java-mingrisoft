package c18_4;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread tA;									//���������߳�
	private Thread tB;
	final JProgressBar pb1 = new JProgressBar();		//�����������������
	final JProgressBar pb2 = new JProgressBar();
	
	public JoinTest() {
		super();
		//�������������ڴ������
		getContentPane().add(pb1, BorderLayout.NORTH);
		//�������������ڴ���������
		getContentPane().add(pb2, BorderLayout.SOUTH);
		pb1.setStringPainted(true);						//���ý�������ʾ�����ַ�
		pb2.setStringPainted(true);
		//ʹ�������ڲ�����ʽ��ʼ��Threadʵ��
		tA = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb1.setValue(++count);				//���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);				//ʹ�߳�A����0.1��
						tB.join();						//ʹ�߳�B����join()����
						if(count == 50) {
							tB.start();					//�����߳�B
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		tA.start();										//�����߳�A
		tB = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb2.setValue(++count);				//���ý������ĵ�ǰֵ
					try {
						Thread.sleep(50);				//ʹ�߳�B����0.1��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count == 100)
						break;
				}
			}
		});
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(300, 200, width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new JoinTest(), 344, 144);
	}

}
