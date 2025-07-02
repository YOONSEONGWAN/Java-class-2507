package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 	Graphic User Interface 를 만들 수 있는 클래스 설계하기
 * 
 * 	1. JFrame 클래스를 상속받는다.
 * 	2. 생성자에서 필요한 초기화 작업을 한다.
 * 	3. main() 메소드에서 이클래스로 객체를 생성하면 Frame(window)이 생성됨.
 * 	3-1. 객체 자체가 프레임이 된다. (창 만들기)
 */

public class MyFrame extends JFrame implements ActionListener{
	// 생성자
	public MyFrame() {
		// 제목 설정
		this.setTitle("나의 프레임"); // 부모 객체는 같은 사물함이니 this
		// 프레임의 위치와 크기 설정 x y 위치에 w h 사이즈 창 생성
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼(x)을 눌렀을 때 프로세스 전체가 종료 되도록 한다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저 객체 생성 //물 흐르듯 창에 맞춰진다.
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		// JButton 객체 생성
		JButton btn1=new JButton("버튼1");
		JButton btn2=new JButton("버튼2");
		JButton btn3=new JButton("버튼3");
		JButton btn4=new JButton("버튼4");
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면
		// 프레임에 버튼이 배치된다.
		add(btn1); // this 가 생략됨
		add(btn2);
		add(btn3);
		add(btn4); 
		
		// 익명 인터페이스로 만들고
		// UI(컴포넌트)에 어떤 동작이 일어났을 때 호출 될 예정인 메소드를 		가지고 있는 ActionLsitener 객체
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1을 눌렀네요 ❣");
			}
		};
		ActionListener listener2 = (e) ->{
				System.out.println("버튼2를 눌렀네요 ♡");
		};
		// 첫 번째 버튼에 액션 리스너 등록하기
		btn1.addActionListener(listener);
		// 두 번째 버튼에 액션 리스너 등록하기
		btn2.addActionListener(listener2);
		// 세 번째 버튼에 액션 리스너 등록하기
		btn3.addActionListener((e)->{
			System.out.println("버튼3을 눌렀네요 💕");
		});
		// 1. this 는 MyFrame 객체의 참조값을 가리킨다. (생성자 내부기 때문)
		// 2. 다만 마이프레임은 타입이 액션리스너가 아니라 못 받는다
		// 3. 인터페이스를 구현하면 액션리스너가 된다. 
		btn4.addActionListener(this);
		
		/*
		btn1.addActionListener(e -> System.out.println("버튼1을 눌렀네요 ❣"));
		btn2.addActionListener(e -> System.out.println("버튼2를 눌렀네요 ♡"));
		btn3.addActionListener(e -> System.out.println("버튼3을 눌렀네요 💕"));
		*/
		
		// 화면상에 실제 보이도록.
		this.setVisible(true);
	}
	
	// main method 만들기
	public static void main(String[] args) {
		new MyFrame();
	}

	// 오버라이딩을 통해 액션 리스너 인터페이스를 구현하고, 
	// MyFrame 객체를 액션리스너 타입으로 만들면 된다.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼4를 눌렀네요 !");
	}
}
