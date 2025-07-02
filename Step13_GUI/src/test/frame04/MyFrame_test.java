package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame_test extends JFrame implements ActionListener {
	private int count = 0;
	private JButton clickBtn;
	private JLabel messageLabel;

	public MyFrame_test() {
		setTitle("클릭 카운터 🌟");
		setBounds(100, 100, 300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		clickBtn = new JButton("클릭!");
		messageLabel = new JLabel("아직 안 눌렀어요");

		clickBtn.addActionListener(this);

		add(clickBtn);
		add(messageLabel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		messageLabel.setText("버튼을 " + count + "번 눌렀어요! ✨");
	}

	public static void main(String[] args) {
		new MyFrame_test();
	}
}
