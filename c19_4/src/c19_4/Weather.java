package c19_4;

import java.net.*;

public class Weather extends Thread {
	private String str = "�󼪴���������Լ���";
	private int port = 9898;
	private InetAddress iAddress;					//����InetAddress����
	private MulticastSocket socket;					//�������㲥�׽��ֶ���

	public Weather() {
		try {
			//ʵ����InetAddress����ָ����ַ
			iAddress = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//ʵ�������㲥�׽��ֶ���
			socket.setTimeToLive(1);				//ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iAddress);				//����㲥��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(true) {
			byte[] data = str.getBytes();			//��ȡ�ֽ�����
			//����DatagramPacket�������ݴ��
			DatagramPacket packet = new DatagramPacket(
					data, data.length, iAddress, port);
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
		Weather w = new Weather();
		w.start();
	}

}
