package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame {
	/* 	1. 버튼을 눌렀을 때 이름과 주소를 읽어와야 한다.
	 * 	2. 그 값을 Dto 에 저장해야함
	 *  3. Dto 값을 Dao 에 주기 
	 *  
	 */
	// 필요한 필드 정의하기
	JTextField inputName, inputAddr;
	
	
	// 생성자에서 초기화 작업
	public MemberFrame() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// JLabel 2개
		JLabel lable1=new JLabel("이름");
		JLabel lable2=new JLabel("주소");
		// JTextField 2개
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		
		// JButton 
		JButton insertBtn=new JButton("저장");
		
		
		
		insertBtn.addActionListener((e)->{
			// 1. MemberDto 객체에 이름과 주소 담기
			MemberDto dto=new MemberDto();
			// 2. 입력한 이름과 주소를 읽어와서 
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			
			// MemberDao 객체를 생성해 DB 에 담기
			MemberDao dao=new MemberDao();
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				// this 는 나의 참조값 MemberFrame 이다. 
				// 당연히 프레임에 띄워야지
				// MemberFrame 은 컴포넌트 타입이기도 하다 
				JOptionPane.showMessageDialog(this, "추가 했습니다.");
			}else {
				JOptionPane.showMessageDialog(this, "추가 실패다.");
			}
			});
		
		// 패널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(lable1);
		panel.add(inputName);
		panel.add(lable2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		// 패널의 배경색 설정
		panel.setBackground(Color.orange);
		// 패널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		
		
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보!");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
