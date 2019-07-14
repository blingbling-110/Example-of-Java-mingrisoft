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
			"E:\\My Pictures\\��ֽ\\С��.jpg";
	private final JPanel pCenter = new JPanel();
	private final JPanel pNorth = new JPanel();
	private final JButton bStart = new JButton("��ʼ����");
	private final JButton bStop = new JButton("ֹͣ����");
	private final JTextArea taCur = new JTextArea(10, 10);
	private final JTextArea taAll = new JTextArea(10, 10);
	private final JScrollPane sp = new JScrollPane();
	private int port;
	private InetAddress group;
	private MulticastSocket socket;
	private Thread thread;
	private boolean isStop;							//ֹͣ���չ㲥�ı�־λ
	
	public Receiver() {
		add(pNorth, BorderLayout.NORTH);
		add(pCenter, BorderLayout.CENTER);
		pNorth.setLayout(new GridLayout(1, 10));
		pNorth.add(taCur);
		pNorth.add(sp);
		sp.setViewportView(taAll);
		pCenter.add(bStart);
		pCenter.add(bStop);
		taCur.setForeground(Color.blue);			//�����ı��������ֵ���ɫ
		bStart.addActionListener(this);
		bStop.addActionListener(this);
		validate();									//ˢ��
		port = 9898;
		try {
			//ָ�����յ�ַ
			group = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//ʵ�������㲥�׽��ֶ���
			socket.joinGroup(group);				//����㲥��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Receiver r = new Receiver();
		r.setTitle("���ǽ��չ㲥���ݱ��ĳ���");
		r.setIconImage(new ImageIcon(iconPath).getImage());
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		r.setBounds(300, 300, 688, 300);
		r.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bStart) {				//��������ʼ���ա���ť����
			isStop = false;
			bStart.setBackground(Color.red);
			bStop.setBackground(Color.yellow);
			thread = new Thread(this);
			thread.start();
		}
		if(e.getSource() == bStop) {				//������ֹͣ���ա���ť����
			isStop = true;
			bStart.setBackground(Color.yellow);
			bStop.setBackground(Color.red);
		}
	}

	@Override
	public void run() {
		while(true) {
			byte[] data = new byte[1024];			//�����ֽ�����
			//ʵ����DatagramPacket�����Խ������ݰ�
			DatagramPacket packet = new DatagramPacket(
					data, data.length, group, port);
			try {
				socket.receive(packet);				//�������ݰ�
				//��ȡ���ݰ��е�����
				String msg = new String(packet.getData(), 
						0, packet.getLength());
				//������������ʾ���ı�����
				taCur.setText("���ڽ��յ����ݣ�\n" + msg);
				taAll.append(msg + '\n');
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(isStop)
				break;
		}
	}

}
