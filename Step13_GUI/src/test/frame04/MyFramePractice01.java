package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFramePractice01 extends JFrame {

	int count=0;
	JButton countBtn;
	JLabel messageLabel;
	public MyFramePractice01() {
		setTitle("My Frame Practice 01");
		setBounds(150, 150, 300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		
		JButton countBtn=new JButton("0");
		messageLabel = new JLabel("아직 안 눌렀어요");
		add(countBtn);
		add(messageLabel);
		countBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				count++;
				countBtn.setText(Integer.toString(count));
				messageLabel.setText("버튼을 " + count + "번 눌렀어요! ✨");
				System.out.println("버튼이"+count+"번 눌렸어요");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFramePractice01();
	}
	
}
