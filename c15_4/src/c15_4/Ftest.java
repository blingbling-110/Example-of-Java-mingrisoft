package c15_4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Ftest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel jContentPane = null;
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	private String filePath = "C:/Users/blingbling_inwin/Desktop/Ftest.txt";
	
	/*�Դ�����в��ֵĴ���*/
	private JTextArea getJTextArea() {
		if(jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JPanel getControlPanel() {
		if(controlPanel == null) {
			controlPanel = new JPanel(new FlowLayout());
			controlPanel.add(getOpenButton());
			controlPanel.add(getCloseButton());
		}
		return controlPanel;
	}
	
	private JButton getOpenButton() {
		if(openButton == null) {
			openButton = new JButton("д���ļ�");
			openButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						//����FileWriter����
						FileWriter out = new FileWriter(file);
						String content = jTextArea.getText();
						out.write(content);
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if(closeButton == null) {
			closeButton = new JButton("��ȡ�ļ�");
			closeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						//����FileReader����
						FileReader in = new FileReader(file);
						char[] charArray = new char[1024];		//����char������
						int length = in.read(charArray);		//���ַ���������
						//�����ı������ʾ��Ϣ
						jTextArea.setText(new String(charArray, 0, length));
						in.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
		}
		return closeButton;
	}
	
	public Ftest() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(400, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("��ϰFileWriter��FileReader��ĳ���");
	}

	private JPanel getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new JPanel(new BorderLayout());
			jContentPane.add(getJTextArea(), BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	
	public static void main(String[] args) {
		Ftest thisClass = new Ftest();
		thisClass.setDefaultCloseOperation(EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}
}
