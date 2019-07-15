package c19_3;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;;

public class TCPClient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrintWriter writer;		//����PrintWriter����
	private Socket socket;			//����Socket����
	private final JScrollPane sp = new JScrollPane();
	private final JTextArea ta = new JTextArea();
	private final JTextField tf = new JTextField();

	public TCPClient() {
		Container c = getContentPane();
		c.add(sp, BorderLayout.CENTER);
		//���������ı߿���������Ϊ͹��б����
		sp.setBorder(new BevelBorder(BevelBorder.RAISED));
		sp.setViewportView(ta);		//����һ���ӿڲ�����������ͼ
		c.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ı����е���Ϣд����
				writer.println(tf.getText());
				ta.append(tf.getText() + '\n');
				//���ı���������ָ���Ľ���λ��
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");		//����ı���
			}
		});
	}
	
	private void connect() {		//�����׽��ֵķ���
		ta.append("��������\n");
		try {
			//ʵ����Socket����
			socket = new Socket("127.0.0.1", 8998);
			//ʵ����PrintWriter���󣬲�ʹ���Զ�ˢ����
			writer = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ta.append("�������\n");
	}
	
	public static void main(String[] args) {
		TCPClient myClient = new TCPClient();
		myClient.setTitle("���������������");
		myClient.setIconImage(new ImageIcon("E:/My Pictures/root.jpg").getImage());
		myClient.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myClient.setBounds(300, 300, 688, 288);
		myClient.setVisible(true);
		myClient.connect();
	}

}
