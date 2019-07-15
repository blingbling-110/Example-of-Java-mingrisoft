package c19_2;

import java.net.*;
import java.io.*;

public class TCPServer {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader reader;
	
	void getServer() {
		try {
			server = new ServerSocket(8998);		//ʵ����ServerSocket����
			System.out.println("�������׽����Ѿ������ɹ�");
			while(true) {
				System.out.println("�ȴ��ͻ��˵�����");
				socket = server.accept();			//ʵ����Socket����
				//ʵ����BufferedReader����
				reader = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				getClientMessage();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void getClientMessage() {
		try {
			while(true) {							//����׽���������״̬
				//��ÿͻ�����Ϣ
				System.out.println("�ͻ��ˣ�" + reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			try {
				if(reader != null)
					reader.close();
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		TCPServer myServer = new TCPServer();
		myServer.getServer();
	}

}
