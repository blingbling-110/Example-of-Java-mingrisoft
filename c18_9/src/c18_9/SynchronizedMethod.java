package c18_9;

public class SynchronizedMethod implements Runnable {
	private int num = 10;

	public synchronized void doit() {		//定义同步方法
		while(true) {
			if(num > 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("余票：" + --num);
			}else
				break;
		}
	}

	@Override
	public void run() {
		doit();
	}

	public static void main(String[] args) {
		SynchronizedMethod sm = new SynchronizedMethod();
		Thread tA = new Thread(sm);
		Thread tB = new Thread(sm);
		Thread tC = new Thread(sm);
		Thread tD = new Thread(sm);
		tA.start();
		tB.start();
		tC.start();
		tD.start();
	}

}
