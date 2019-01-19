package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DiaryMain extends JFrame{
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.GREEN);
		//컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 시작화면");
		setSize(520, 420);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel img = new JLabel("");
		getContentPane().add(img);
		ImageIcon icon = new ImageIcon("일기장.PNG");
		img.setIcon(icon);
		
		JLabel lblNewLabel = new JLabel("아이디");
		getContentPane().add(lblNewLabel);
		
		id = new JTextField();
		getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		getContentPane().add(lblNewLabel_1);
		
		pw = new JTextField();
		getContentPane().add(pw);
		pw.setColumns(10);
		
		JButton login = new JButton("로그인");
		getContentPane().add(login);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234";
				String gId = id.getText();
				String gPW = pw.getText();
				
				if ((sId.equals(gId))&&(sPw.equals(gPW))) {
					JOptionPane.showMessageDialog(null,"로그인OK입니다.");
				MyDiary my = new MyDiary();
					
				}else {
					
					JOptionPane.showMessageDialog(null,"로그인NOT입니다.");
			}
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("초기화");
		getContentPane().add(btnNewButton_1);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		DiaryMain name=new DiaryMain();

	}

}
