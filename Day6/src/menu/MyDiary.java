package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class MyDiary extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 시작화면");
		setSize(289, 680);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel img = new JLabel("");
		getContentPane().add(img);
		ImageIcon icon = new ImageIcon("일기장.PNG");
		img.setIcon(icon);

		

		JLabel no = new JLabel("번호");
		getContentPane().add(no);

		noText = new JTextField();
		noText.setForeground(Color.RED);
		getContentPane().add(noText);
		noText.setColumns(20);

		JLabel lblNewLabel = new JLabel("제목");
		getContentPane().add(lblNewLabel);

		titleText = new JTextField();
		getContentPane().add(titleText);
		titleText.setColumns(20);

		JLabel label = new JLabel("내용");
		getContentPane().add(label);

		JTextArea contentText = new JTextArea();
		contentText.setColumns(12);
		contentText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		contentText.setTabSize(4);
		contentText.setRows(5);
		getContentPane().add(contentText);

		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();
				// 컨트롤+알트+화살표아래(복사:블록안잡고)
				// 컨트롤+c,컨트롤+v(복사:블록잡고)

				// 컨트롤+쉬프트+F(format)
				try {

					// URL url = new URL("http://www.kb.com");
					// IPAddress("210.125.88.7");

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n");
					f.write(titleT + "\r\n");
					f.write(contentT + "\r\n");
					f.flush();
					f.close();

					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					JOptionPane.showMessageDialog(null, "파일로 저장 성공!!!!");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "파일로 저장 실패!!!!");

				}

			}
		});
		save.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();

				try {
					FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();

					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					noText.setForeground(Color.RED);

					JOptionPane.showMessageDialog(null, "파일로 읽기 성공!!!!");

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "파일로 읽기 실패!!!!");

				}

			}
		});
		read.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));
		getContentPane().add(read);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();

	}

}
