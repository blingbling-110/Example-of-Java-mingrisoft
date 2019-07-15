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
		final JProgressBar pb = new JProgressBar();		//创建进度条
		//将进度条放置在窗体合适位置
		getContentPane().add(pb, BorderLayout.NORTH);
		pb.setStringPainted(true);						//设置进度条上显示数字
		t = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb.setValue(++count);				//设置进度条的当前值
					if(count == 50)
						t.interrupt();					//中断线程
					try {
						Thread.sleep(100);				//使线程休眠0.1秒
						//捕捉InterruptedException异常
					} catch (InterruptedException e) {
						System.out.println("当前线程序被中断");
						break;
					}
				}
			}
		});
		t.start();										//启动线程
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
