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
		InetAddress ip;											//����InetAddress����
		try {
			ip = InetAddress.getLocalHost();					//ʵ��������
			String localName = ip.getHostName();				//��ȡ������
			String localIPAddress = ip.getHostAddress();		//��ȡ����IP��ַ
			getContentPane().add(jlName, BorderLayout.NORTH);
			getContentPane().add(jlIPAddress, BorderLayout.CENTER);
			jlName.setText("��������" + localName);
			jlIPAddress.setText("����IP��ַ��" + localIPAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		HostNameAndIPAddress hnaipa = new HostNameAndIPAddress();
		hnaipa.setTitle("��ȡ�������ͱ���IP��ַ");
		//�����������Զ���ͼ��
		hnaipa.setIconImage(new ImageIcon(iconPath).getImage());
		hnaipa.setDefaultCloseOperation(EXIT_ON_CLOSE);
		hnaipa.setBounds(300, 300, 344, 144);
		hnaipa.setVisible(true);
	}

}
