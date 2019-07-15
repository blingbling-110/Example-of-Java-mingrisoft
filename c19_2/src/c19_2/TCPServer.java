package c19_2;

import java.net.*;
import java.io.*;

public class TCPServer {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader reader;
	
	void getServer() {
		try {
			server = new ServerSocket(8998);		//实例化ServerSocket对象
			System.out.println("服务器套接字已经创建成功");
			while(true) {
				System.out.println("等待客户端的连接");
				socket = server.accept();			//实例化Socket对象
				//实例化BufferedReader对象
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
			while(true) {							//如果套接字是连接状态
				//获得客户端信息
				System.out.println("客户端：" + reader.readLine());
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
