package test.frame03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자
	public MyFrame() {
		setTitle("Thread test.");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton startBtn=new JButton("작업 시작");
		/*
		 * 	- type 추론이 가능하다면 지연변수의 type 선언 대신에 var 로 대신 		선언할 수 있다.
		 * 	- java 10 에서 추가된 문법, 아직도 실무에서는 1.8 쓰는 곳 조심
		 * 	- 지역변수에만 사용 가능, 필드는 X
		 * 	- 인터페이스 type 추론 불가
		 * 	- null 로 초기화 불가
		 */
		var startBtn2=new JButton("작업시작2");
		
		add(startBtn);
		add(startBtn2);
		
		startBtn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
			
				// 결과적으로 메인 스레드는 10초간 sleep 상태로 된다.
				Thread.sleep(1000*10);
			}catch(InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다.");	
		});
		
		startBtn2.addActionListener((e)->{
			// 메소드가 하나짜리기 때문에 가능
			// Runnable 인터페이스는 run 메소드 하나이기 때문에 함수 			모양으로 객체를 만들 수 있다.
			// new Runnable(){ public void run(); }; => ()->{}; 
			new Thread(()->{
				// 여기는 Runnable type 객체의 run() 메소드 내부이다
				// 누를 대마다 새로운 객체가 생성+쓰레드가 생성
				System.out.println("10초 걸리는 작업을 시작합니다.");
				try {				
					// 결과적으로 메인 스레드는 10초간 sleep 상태로 된다.
					Thread.sleep(1000*10);
				}catch(InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("작업이 종료 되었습니다.");	
			}).start(); 
		});
		
		setVisible(true);
	}
	// 메인 메소드
	public static void main(String[] args) {
		// 메인 스레드에서 MyFrame 객체를 생성하고 스레드는 사용자의 입력을 		처리하기 위해 어디선가 대기중
		new MyFrame();
	}
}
