package c19_1;

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class HostNameAndIPAddress extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String iconPath = "E:/My Pictures/root.jpg";
	private final JLabel jlName = new JLabel();
	private final JLabel jlIPAddress = new JLabel();
	
	public HostNameAndIPAddress() {
		InetAddress ip;											//创建InetAddress对象
		try {
			ip = InetAddress.getLocalHost();					//实例化对象
			String localName = ip.getHostName();				//获取本机名
			String localIPAddress = ip.getHostAddress();		//获取本机IP地址
			getContentPane().add(jlName, BorderLayout.NORTH);
			getContentPane().add(jlIPAddress, BorderLayout.CENTER);
			jlName.setText("本机名：" + localName);
			jlIPAddress.setText("本机IP地址：" + localIPAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		HostNameAndIPAddress hnaipa = new HostNameAndIPAddress();
		hnaipa.setTitle("获取本机名和本机IP地址");
		//给窗口设置自定义图标
		hnaipa.setIconImage(new ImageIcon(iconPath).getImage());
		hnaipa.setDefaultCloseOperation(EXIT_ON_CLOSE);
		hnaipa.setBounds(300, 300, 344, 144);
		hnaipa.setVisible(true);
	}

}
