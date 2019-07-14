package c19_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Receiver extends JFrame implements Runnable, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String iconPath = 
			"E:\\My Pictures\\壁纸\\小兰.jpg";
	private final JPanel pCenter = new JPanel();
	private final JPanel pNorth = new JPanel();
	private final JButton bStart = new JButton("开始接收");
	private final JButton bStop = new JButton("停止接收");
	private final JTextArea taCur = new JTextArea(10, 10);
	private final JTextArea taAll = new JTextArea(10, 10);
	private final JScrollPane sp = new JScrollPane();
	private int port;
	private InetAddress group;
	private MulticastSocket socket;
	private Thread thread;
	private boolean isStop;							//停止接收广播的标志位
	
	public Receiver() {
		add(pNorth, BorderLayout.NORTH);
		add(pCenter, BorderLayout.CENTER);
		pNorth.setLayout(new GridLayout(1, 10));
		pNorth.add(taCur);
		pNorth.add(sp);
		sp.setViewportView(taAll);
		pCenter.add(bStart);
		pCenter.add(bStop);
		taCur.setForeground(Color.blue);			//设置文本域中文字的颜色
		bStart.addActionListener(this);
		bStop.addActionListener(this);
		validate();									//刷新
		port = 9898;
		try {
			//指定接收地址
			group = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//实例化多点广播套接字对象
			socket.joinGroup(group);				//加入广播组
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Receiver r = new Receiver();
		r.setTitle("这是接收广播数据报的程序");
		r.setIconImage(new ImageIcon(iconPath).getImage());
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		r.setBounds(300, 300, 688, 300);
		r.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bStart) {				//单击“开始接收”按钮触发
			isStop = false;
			bStart.setBackground(Color.red);
			bStop.setBackground(Color.yellow);
			thread = new Thread(this);
			thread.start();
		}
		if(e.getSource() == bStop) {				//单击“停止接收”按钮触发
			isStop = true;
			bStart.setBackground(Color.yellow);
			bStop.setBackground(Color.red);
		}
	}

	@Override
	public void run() {
		while(true) {
			byte[] data = new byte[1024];			//创建字节数组
			//实例化DatagramPacket对象，以接收数据包
			DatagramPacket packet = new DatagramPacket(
					data, data.length, group, port);
			try {
				socket.receive(packet);				//接收数据包
				//获取数据包中的内容
				String msg = new String(packet.getData(), 
						0, packet.getLength());
				//将接收内容显示在文本域中
				taCur.setText("正在接收的内容：\n" + msg);
				taAll.append(msg + '\n');
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(isStop)
				break;
		}
	}

}
