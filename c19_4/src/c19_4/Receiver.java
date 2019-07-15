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
	private static final String TITLE = "�㲥���ݱ�������";
	private static final String ICON_PATH = "E:\\My Pictures\\root.jpg";
	private final JPanel pNorth = new JPanel();
	private final JPanel pCenter = new JPanel();
	private final JTextArea taCur = new JTextArea(10, 10);
	private final JScrollPane sp = new JScrollPane();
	private final JTextArea taAll = new JTextArea(10, 10);
	private final JButton bStart = new JButton("��ʼ����");
	private final JButton bStop = new JButton("ֹͣ����");
	private int port;								//�˿ں�
	private InetAddress iAddr;						//�㲥��
	private MulticastSocket socket;					//�������㲥�׽��ֶ���
	private DatagramPacket packet;					//�������ݱ�������
	private Thread tReceive;						//���ڽ��չ㲥���߳�
	private boolean isStop;							//���ڽ����̵߳ı�־λ
	
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
		taCur.setText("��ǰ���յ�����Ϣ��\n");
		taAll.setText("��ʷ��Ϣ��\n");
		validate();									//ˢ�´��ڲ���
		port = 9898;								//���ö˿ں�
		try {
			//��ȡ�㲥��
			iAddr = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//ʵ�������㲥�׽��ֶ���
			socket.joinGroup(iAddr);				//����㲥��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bStart) {				//�������¼�����bStart
			isStop = false;
			bStart.setBackground(Color.red);
			bStop.setBackground(Color.yellow);
			tReceive = new Thread(this);
			tReceive.start();
		}
		if(e.getSource() == bStop) {				//�������¼�����bStop
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
			byte[] data = new byte[1024];			//�����ֽ�����
			//ʵ����DatagramPacket�������ڽ������ݰ�
			packet = new DatagramPacket(data, data.length, iAddr, port);
			try {
				socket.receive(packet);				//�������ݰ�
				//��ȡ���ݰ��е�����
				String msg = new String(packet.getData(), 
						0, packet.getLength());
				//������������ʾ���ı�����
				taCur.setText("��ǰ���յ�����Ϣ��\n" + msg);
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
