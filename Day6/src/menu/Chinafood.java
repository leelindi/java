package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
//컨트롤+쉬프트+0(영문)

public class Chinafood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
    int count=0;
    final int price=5000;
    JLabel lblNewLabel_2;
    
	
   public Chinafood() {
   	getContentPane().setBackground(Color.YELLOW);
	setSize(700,500);
	setTitle("주문하세요....");
	
	ImageIcon icon=new ImageIcon("중국집.png");
	
	FlowLayout flow = new FlowLayout();
	getContentPane().setLayout(flow);
	
	JButton btnNewButton = new JButton("짜장면");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			textField.setText(count+"");
			textField_1.setText(count*price+"");
			
			ImageIcon icon1=new ImageIcon("짜장면.jpg");	
			lblNewLabel_2.setIcon(icon1);
		}
	});
	btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
	btnNewButton.setBackground(Color.ORANGE);
	btnNewButton.setForeground(Color.MAGENTA);
	btnNewButton.setToolTipText("짜장면 하나가 추가됨");
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("유린기");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			textField.setText(count+"");
			textField_1.setText(count*price+"");
			
			ImageIcon icon2=new ImageIcon("유린기.jpg");
			lblNewLabel_2.setIcon(icon2);
		}
	});	
	btnNewButton_1.setForeground(Color.RED);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("전가복");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			textField.setText(count+"");
			textField_1.setText(count*price+"");
			ImageIcon icon3=new ImageIcon("전가복.jpg");
			
			lblNewLabel_2.setIcon(icon3);
		}
	});		
	btnNewButton_2.setForeground(Color.BLUE);
	getContentPane().add(btnNewButton_2);
	
	JLabel lblNewLabel = new JLabel("개수");
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setFont(new Font("굴림", Font.BOLD, 20));
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("금액");
	getContentPane().add(lblNewLabel_1);
	
	textField_1 = new JTextField();
	textField_1.setFont(new Font("굴림", Font.BOLD, 20));
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	lblNewLabel_2 = new JLabel("");
	getContentPane().add(lblNewLabel_2);
	
	lblNewLabel_2.setIcon(icon);
	
	setVisible(true);
   }	
	
	
	public static void main(String[] args) {
		Chinafood china = new Chinafood();
		

	}
	
}
