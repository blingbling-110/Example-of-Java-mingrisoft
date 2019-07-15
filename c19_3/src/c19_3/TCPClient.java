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
	private PrintWriter writer;		//声明PrintWriter对象
	private Socket socket;			//声明Socket对象
	private final JScrollPane sp = new JScrollPane();
	private final JTextArea ta = new JTextArea();
	private final JTextField tf = new JTextField();

	public TCPClient() {
		Container c = getContentPane();
		c.add(sp, BorderLayout.CENTER);
		//将滚动面板的边框类型设置为凸出斜角型
		sp.setBorder(new BevelBorder(BevelBorder.RAISED));
		sp.setViewportView(ta);		//创建一个视口并设置它的视图
		c.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//将文本框中的信息写入流
				writer.println(tf.getText());
				ta.append(tf.getText() + '\n');
				//在文本域中设置指定的结束位置
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");		//清空文本框
			}
		});
	}
	
	private void connect() {		//连接套接字的方法
		ta.append("尝试连接\n");
		try {
			//实例化Socket对象
			socket = new Socket("127.0.0.1", 8998);
			//实例化PrintWriter对象，并使其自动刷新流
			writer = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ta.append("完成连接\n");
	}
	
	public static void main(String[] args) {
		TCPClient myClient = new TCPClient();
		myClient.setTitle("向服务器发送数据");
		myClient.setIconImage(new ImageIcon("E:/My Pictures/root.jpg").getImage());
		myClient.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myClient.setBounds(300, 300, 688, 288);
		myClient.setVisible(true);
		myClient.connect();
	}

}
