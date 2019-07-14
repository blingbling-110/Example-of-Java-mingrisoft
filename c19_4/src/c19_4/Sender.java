package c19_4;

import java.net.*;

public class Sender extends Thread {
	String msg = "大吉大利，今晚吃鸡！";
	int port = 9898;
	InetAddress iAddr;								//声明InetAddress对象
	MulticastSocket socket;							//声明多点广播套接字对象
	
	public Sender() {
		try {
			//实例化InetAddress对象，指定地址
			iAddr = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port);		//实例化多点广播套接字对象
			socket.setTimeToLive(1);				//指定发送范围是本地网络
			socket.joinGroup(iAddr);				//加入广播组
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(true) {
			byte[] data = msg.getBytes();			//获取字节数组
			//创建DatagramPackeet对象，将数据打包
			DatagramPacket packet = new DatagramPacket(
					data, data.length, iAddr, port);
			System.out.println(new String(data));
			try {
				socket.send(packet);				//发送数据
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
