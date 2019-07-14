package c19_4;

import java.net.*;

public class Sender extends Thread {
	String msg = "�󼪴���������Լ���";
	int port = 9898;
	InetAddress iAddr;								//����InetAddress����
	MulticastSocket socket;							//�������㲥�׽��ֶ���
	
	public Sender() {
		try {
			//ʵ����InetAddress����ָ����ַ
			iAddr = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//ʵ�������㲥�׽��ֶ���
			socket.setTimeToLive(1);				//ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iAddr);				//����㲥��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(true) {
			byte[] data = msg.getBytes();			//��ȡ�ֽ�����
			//����DatagramPackeet���󣬽����ݴ��
			DatagramPacket packet = new DatagramPacket(
					data, data.length, iAddr, port);
			System.out.println(new String(data));
			try {
				socket.send(packet);				//��������
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Sender s = new Sender();
		s.start();
	}

}
