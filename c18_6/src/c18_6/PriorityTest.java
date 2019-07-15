package c18_6;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread tA;
	private Thread tB;
	private Thread tC;
	private Thread tD;
	
	//定义设置线程的名称、优先级的方法
	public static void setPriority(String threadName, int priority, Thread t) {
		t.setName(threadName);			//设置线程的名称
		t.setPriority(priority);		//设置线程的优先级
		t.start();						//启动线程
	}
	
	//定义一个实现Runnable接口的类
	private final class MyThread implements Runnable {
		private final JProgressBar pb;
		int count = 0;
		
		private MyThread(JProgressBar pb) {
			this.pb = pb;
		}

		@Override
		public void run() {
			while(true) {
				pb.setValue(count += 10);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("当前线程被中断");
				}
			}
		}
		
	}
	
	public PriorityTest() {
		super();
		final JProgressBar pb1 = new JProgressBar();
		final JProgressBar pb2 = new JProgressBar();
		final JProgressBar pb3 = new JProgressBar();
		final JProgressBar pb4 = new JProgressBar();
		pb1.setStringPainted(true);
		pb2.setStringPainted(true);
		pb3.setStringPainted(true);
		pb4.setStringPainted(true);
		getContentPane().setLayout(new GridLayout(4, 1));
		getContentPane().add(pb1);
		getContentPane().add(pb2);
		getContentPane().add(pb3);
		getContentPane().add(pb4);
		tA = new Thread(new MyThread(pb1));
		tB = new Thread(new MyThread(pb2));
		tC = new Thread(new MyThread(pb3));
		tD = new Thread(new MyThread(pb4));
		setPriority("线程A", 5, tA);
		setPriority("线程B", 5, tB);
		setPriority("线程C", 4, tC);
		setPriority("线程D", 3, tD);
	}

	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(300, 300, width, height);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		init(new PriorityTest(), 344, 144);
	}

}
