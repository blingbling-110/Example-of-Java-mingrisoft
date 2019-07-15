package c15_5;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class BufferedTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel wholePane = null;
	private JPanel buttonPane = null;
	private JScrollPane textPane = null;
	private JButton readButton = null;
	private JButton writeButton = null;
	private JTextArea textArea = null;
	private String filePath = "C:/Users/qinzijun/Desktop/BufferedTest.txt";

	public BufferedTest() {
		super();
		initialize();
	}

	private void initialize() {
		this.setContentPane(getWholePane());
		this.setTitle("练习Buffered IO的程序");
		this.setBounds(300, 300, 384, 216);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private JPanel getWholePane() {
		if(wholePane  == null) {
			wholePane = new JPanel(new BorderLayout());
			wholePane.add(getTextPane(), BorderLayout.CENTER);
			wholePane.add(getButtonPane(), BorderLayout.SOUTH);
		}
		return wholePane;
	}

	private JPanel getButtonPane() {
		if(buttonPane == null) {
			buttonPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
			buttonPane.add(getWriteButton());
			buttonPane.add(getReadButton());
		}
		return buttonPane;
	}

	private JButton getReadButton() {
		if(readButton == null) {
			readButton = new JButton("读取文件");
			readButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						FileReader reader = new FileReader(file);
						BufferedReader input = new BufferedReader(reader);
						String line = null;
						textArea.setText("");
						while((line = input.readLine()) != null) {
							textArea.append(line + '\n');
						}
						input.close();
						reader.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
		}
		return readButton;
	}

	private JButton getWriteButton() {
		if(writeButton == null) {
			writeButton = new JButton("写入文件");
			writeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(filePath);
					try {
						if(!file.exists()) {
							file.createNewFile();
						}
						FileWriter writer = new FileWriter(file);
						BufferedWriter output = new BufferedWriter(writer);
						output.write(textArea.getText());
						output.newLine();
						output.write("自动追加的文件结束行。");
						output.close();
						writer.close();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
				}
			});
		}
		return writeButton;
	}

	private JScrollPane getTextPane() {
		if(textPane == null) {
			textPane = new JScrollPane(getTextArea());
		}
		return textPane;
	}

	private JTextArea getTextArea() {
		if(textArea == null) {
			textArea = new JTextArea();
		}
		return textArea ;
	}

	public static void main(String[] args) {
		new BufferedTest();
	}

}
