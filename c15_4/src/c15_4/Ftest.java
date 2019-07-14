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
	
	/*对窗体进行布局的代码*/
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
			openButton = new JButton("写入文件");
			openButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						//创建FileWriter对象
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
			closeButton = new JButton("读取文件");
			closeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						//创建FileReader对象
						FileReader in = new FileReader(file);
						char[] charArray = new char[1024];		//创建char型数组
						int length = in.read(charArray);		//将字符读入数组
						//设置文本域的显示信息
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
		this.setTitle("练习FileWriter和FileReader类的程序");
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
