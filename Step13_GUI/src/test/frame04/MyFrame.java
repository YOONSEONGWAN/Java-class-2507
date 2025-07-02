package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	// 버튼 누른 횟수를 담을 필드
	private int num = 0;
	// 버튼의 참조값을 담을 필드
	JButton countBtn;
	// 생성자
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저 객체 생성
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		// 생성한 버튼의 참조값을 필드에 저장하면 객체 안에서 활용 가능
		this.countBtn=new JButton("0");
		add(countBtn);
		
		
		countBtn.addActionListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼의 text 를 여기서 변경하려면 countBtn 참조값을 여기서
		// 사용할 수 있어야 한다. (지역변수를 가져와야 함)
		num++;
		countBtn.setText(Integer.toString(num));
	}
}
