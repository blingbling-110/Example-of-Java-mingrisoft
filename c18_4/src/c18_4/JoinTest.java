package c18_4;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread tA;									//定义两个线程
	private Thread tB;
	final JProgressBar pb1 = new JProgressBar();		//定义两个进度条组件
	final JProgressBar pb2 = new JProgressBar();
	
	public JoinTest() {
		super();
		//将进度条设置在窗体最北面
		getContentPane().add(pb1, BorderLayout.NORTH);
		//将进度条设置在窗体最南面
		getContentPane().add(pb2, BorderLayout.SOUTH);
		pb1.setStringPainted(true);						//设置进度条显示数字字符
		pb2.setStringPainted(true);
		//使用匿名内部类形式初始化Thread实例
		tA = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb1.setValue(++count);				//设置进度条的当前值
					try {
						Thread.sleep(100);				//使线程A休眠0.1秒
						tB.join();						//使线程B调用join()方法
						if(count == 50) {
							tB.start();					//启动线程B
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		tA.start();										//启动线程A
		tB = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {
				while(true) {
					pb2.setValue(++count);				//设置进度条的当前值
					try {
						Thread.sleep(50);				//使线程B休眠0.1秒
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
