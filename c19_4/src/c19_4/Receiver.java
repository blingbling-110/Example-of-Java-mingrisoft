package c19_4;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

public class Receiver extends JFrame implements Runnable, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "广播数据报接收器";
	private static final String ICON_PATH = "E:\\My Pictures\\root.jpg";
	private final JPanel pNorth = new JPanel();
	private final JPanel pCenter = new JPanel();
	private final JTextArea taCur = new JTextArea(10, 10);
	private final JScrollPane sp = new JScrollPane();
	private final JTextArea taAll = new JTextArea(10, 10);
	private final JButton bStart = new JButton("开始接收");
	private final JButton bStop = new JButton("停止接收");
	private int port;								//端口号
	private InetAddress iAddr;						//广播组
	private MulticastSocket socket;					//声明多点广播套接字对象
	private DatagramPacket packet;					//声明数据报包对象
	private Thread tReceive;						//用于接收广播的线程
	private boolean isStop;							//用于结束线程的标志位
	
	public Receiver() {
		add(pNorth, BorderLayout.NORTH);
		add(pCenter, BorderLayout.CENTER);
		pNorth.setLayout(new GridLayout(1, 2));
		pNorth.add(taCur);
		pNorth.add(sp);
		sp.setViewportView(taAll);
		pCenter.add(bStart);
		pCenter.add(bStop);
		bStart.addActionListener(this);
		bStop.addActionListener(this);
		taCur.setText("当前接收到的信息：\n");
		taAll.setText("历史信息：\n");
		validate();									//刷新窗口布局
		port = 9898;								//设置端口号
		try {
			//获取广播组
			iAddr = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//实例化多点广播套接字对象
			socket.joinGroup(iAddr);				//加入广播组
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bStart) {				//若动作事件来自bStart
			isStop = false;
			bStart.setBackground(Color.red);
			bStop.setBackground(Color.yellow);
			tReceive = new Thread(this);
			tReceive.start();
		}
		if(e.getSource() == bStop) {				//若动作事件来自bStop
			isStop = true;
			bStart.setBackground(Color.yellow);
			bStop.setBackground(Color.red);
		}
	}

	@Override
	public void run() {
		while(true) {
			if(isStop)
				break;
			byte[] data = new byte[1024];			//创建字节数组
			//实例化DatagramPacket对象，用于接收数据包
			packet = new DatagramPacket(data, data.length, iAddr, port);
			try {
				socket.receive(packet);				//接收数据包
				//获取数据包中的内容
				String msg = new String(packet.getData(), 
						0, packet.getLength());
				//将接收内容显示在文本域中
				taCur.setText("当前接收到的信息：\n" + msg);
				taAll.append(msg + '\n');
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Receiver r = new Receiver();
		r.setTitle(TITLE);
		r.setIconImage(new ImageIcon(ICON_PATH).getImage());
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		r.setBounds(300, 300, 688, 300);
		r.setVisible(true);
	}

}
