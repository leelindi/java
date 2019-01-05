package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener{

	static JButton b1;
	static JButton b2;
	static JLabel img;
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그래픽 프로그램");
		f.setSize(800, 800);
		
		JLabel l = new JLabel("나의 강아지.");
		JLabel m = new JLabel("귀여워요");
		JLabel n = new JLabel("이름은 몽이예요");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("dog.jpg");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);			
		img.setIcon(icon);
		b1 = new JButton("다른 강아지로.");
		b2 = new JButton("원래 강아지로.");
		
		f.add(l);
		f.add(img);
		f.add(m);
		f.add(n);
		f.add(b1);
		f.add(b2);
	
		
		MyPicture2 pic = new MyPicture2();
		b1.addActionListener(pic);
		b2.addActionListener(pic);
		
		
		f.setVisible(true);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("dog2.jpg");
			img.setIcon(icon2);
			
		}
		if (e.getSource() == b2) {
			ImageIcon icon = new ImageIcon("dog.jpg");
			img.setIcon(icon);
		}
    }
}