package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	// 필요한 필드 정의
	Image backImage, missImage;
	// dragon 의 좌표
	int unitX=0;
	int unitY=0;
	// 배경 1의 y 좌표
	int back1Y=0, back2Y=-800;
	//Missile 객체를 누적시킬 ArrayList 객체
	List<Missile> missList=new ArrayList<>();
	//드래곤 Image 객체를 저장할 배열 객체 미리 준비
	Image[] unitImgs = new Image[2];
	// 드래곤 이미지 인덱스 
	int unitIndex;
	// 메소드 호출 횟수를 누적할 필드
	int count;
	
	// 생성자
	public GamePanel() {
		// 무언가 준비 작업 ... 
		
		// Panel 크기 결정 width 500 height 800
		setPreferredSize(new Dimension(500, 800));
		
		// 이미지 아이콘 객체를 만들고 객체에서 이미지 생성자 호출
		//getClass().getResource("/images/unit1.png") << 이미지 		로딩할 URL 객체
		unitImgs[0]= new ImageIcon(getClass().getResource("/images/unit1.png")).getImage();
		unitImgs[1]= new ImageIcon(getClass().getResource("/images/unit2.png")).getImage();
		//배경 이미지
		backImage=new ImageIcon(getClass().getResource
				("/images/backbg.png")).getImage();
		missImage=new ImageIcon(getClass().getResource
				("/images/mi2.png")).getImage();
		
		
		MouseMotionAdapter adapter=new MouseMotionAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			// 마우스의 좌표
			int x=e.getX();
			int y=e.getY();
			// 마우스의 좌표를 unit 의 좌표에 반영하기
			unitX=x;
			unitY=y;
			}
		};
		
		// 마우스 움직임을 처리하기 위한 code>
		addMouseMotionListener(adapter);
		
		// Panel 이 포커스를 받을 수 있도록 (key event 처리를 위해)
		setFocusable(true); // 포커스를 받을 수 있게 해줌
		requestFocusInWindow(); // 현재 선택된 창이 포커스 받은 창
		
		// 키보드 입력 처리
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 만일 space 누르면 
				if(e.getKeyCode()==32) {
					// Missile 객체 생성해서 현재 unit 의 좌표 담고
					// List 에 누적 시키기
					Missile m=new Missile(unitX, unitY);
					missList.add(m);
				}
			}
		});
		
		// Panel 이 10/1000 초마다 다시 그려지게 하기 위한 타이머 설정
		// 이 함수는 1000분의 	10초마다 호출된다. 
		Timer timer=new Timer(10, (e)->{
			// Panel 객체의 repaint() 메소드를 호출
			// 결과적으로 PaintComponent() 메소드가 다시 호출된다.
			repaint();
		}); 
		
		timer.start();
	}
	
	
	// Panel 에 무언가를 그릴 때 호출되는 메소드. 유닛을 호출할거임
	// Panel 이 초기화 될 때 한 번 호출되고 그 다음에는 repaint() 메소드가 		호출될 때마다 다시 호출된다 (타이머로 인해 초당 100번 호출)
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		count++; 
		
		// 배경을 드래곤보다 먼저 그려야 한다. 
		g.drawImage(backImage, 0, back1Y, 500, 800, this);
		g.drawImage(backImage, 0, back2Y, 500, 800, this);
		// 반복문 돌면서 미사일 이미지 모두 그리기
		for(int i=0; i<missList.size(); i++) {
			// i 번째 미사일 객체
			Missile tmp=missList.get(i);
			g.drawImage(missImage, tmp.getX()-15, tmp.getY()-20, 30, 40, this);
		}
		
		// 메소드의 매개변수에 전달되는 Graphics 객체를 Panel 에 그림을 		그릴 수 있는 도구다.
		g.drawImage(unitImgs[unitIndex], unitX-50, unitY-50, 100, 100, this);
		
		// 텍스트로 미사일의 갯수 표시
		g.setColor(Color.yellow);
		g.drawString("count: "+count, 10, 20);
		
		// n번 카운트마다 바뀌도록
		if(count%25 == 0) {
		
		// 드래곤 유닛 인덱스 1 증가
		unitIndex++;
		// 만일 존재하지 않는 인덱스라면 
		if(unitIndex == 2) {
			// 인덱스를 다시 0으로 변경
			unitIndex=0;
		}
	}
		
		// 모든 미사일의 y 좌표를 감소 시켜서 미사일이 위로 이동하도록
		for(Missile tmp : missList) {
			// 현재 y 좌표에서 10 감소 시킨 값을 얻어내서
			int resultY = tmp.getY()-10;
			// 해당 객체에 다시넣어준다.
			tmp.setY(resultY);
			// 만일 화면을 벗어난 미사일이라면
			if(tmp.getY() <= -20) {
				// 제거 하도록 표시해 둔다.
				tmp.setRemove(true);
			}
		}
		
		// 반복문 돌면서 List 에서 제거할 Missile 객체는 제거한다. 
		for(int i=0; i<missList.size(); i++) {
			// i 번째 Missile 객체
			Missile tmp=missList.get(i);
			// 만일 i 번째 미사일 객체가 제거 할 객체라면
			if(tmp.isRemove()) {
				// List 에서 i 번째 item 을 제거한다
				missList.remove(i);
			}
		}
		
		
		back1Y += 2;
		back2Y += 2;
		// 만일 배경1이 아래쪽으로 벗어난다면
		if(back1Y >= 800) {
			// -800 좌표로 다시 보낸다.
			back1Y = -800;
		}
		// 배경 2도 아래로 벗어나면 -800좌표로 보내기
		if(back2Y >= 800) {
			// -800 좌표로 다시 보낸다.
			back2Y = -800;
		}
	}
}
