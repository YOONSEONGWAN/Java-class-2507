package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

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
	// ㅌ1.표 형식으로 정보를 출력할 UI
	JTable table;
	// ㅌ2. JTable 에 출력할 data 를 공급해 줄 모델 객체
	// JTable -> model -> 출력
	DefaultTableModel model;
	// ㅌ10. dao 를 사용하니 미리 변수로 지정해두기. 필드에는 var 사용불가
	MemberDao dao=new MemberDao();
	
	
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
		JButton deleteBtn=new JButton("삭제");
		JButton updateBtn=new JButton("수정");
		
		
		// 버튼의 동작
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
			this.printMember();
			});
		
		// ㅅ1. 삭제버튼 눌렀을 때 실행할 함수 
		deleteBtn.addActionListener((e)->{
			// ㅅ2. 선택된 row 의 index 값을 읽어옴
			int selectedRow=table.getSelectedRow();
			// ㅅ3. 만일 선택된 row 가 없다면
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택해 주세요!"); 
				// true 값이면 return 시켜서 메소드 종료 시켜야함
				return;
			}
			// ㅅ4. 삭제할 회원의 Primary key 값(번호)를 읽어와서
			int num=(int)model.getValueAt(selectedRow, 0);
			// DB 에서 삭제한다
			boolean isSuccess=dao.deleteByNum(num);
			
			
			// ㅅ6. DB에서 회원 정보를 다시 읽어와서 출력 
			
			if(isSuccess) {
				// this 는 나의 참조값 MemberFrame 이다. 
				// 당연히 프레임에 띄워야지
				// MemberFrame 은 컴포넌트 타입이기도 하다 
				JOptionPane.showMessageDialog(this, "삭제 했습니다.");
				this.printMember();
			}else {
				JOptionPane.showMessageDialog(this, "삭제 실패다.");}
			
		});
		
		
		
		// ㅇ1. 업데이트 눌렀을 때 실행할 함수 
		updateBtn.addActionListener((e)->{
			
			int selectedRow=table.getSelectedRow();
			
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row 를 선택해 주세요!");
				// true 값이면 return 시켜서 메소드 종료 시켜야함
				return;
			}
			int num=(int)model.getValueAt(selectedRow, 0);
			MemberDto dto=dao.getByNum(num);
			//MemberDto dto=new MemberDto();
			// ㅇ2. 수정양식 UI 를 JPanel 로 구성한다.
			var inputName=new JTextField(10);
			var inputAddr=new JTextField(10);
			JPanel editPanel=new JPanel();
			editPanel.add(new JLabel("이름: "));
			editPanel.add(inputName);
			editPanel.add(new JLabel("주소: "));
			editPanel.add(inputAddr);
			// ㅇ4. MemberDto 에 있는 정보를 JTextField 에 출력
			inputName.setText(dto.getName());
			inputAddr.setText(dto.getAddr());
			
			
			// ㅇ3.JPanel 을 전달하면서 ConfirmDialog 를 따온다.
			int result=JOptionPane.showConfirmDialog(
					this, 
					editPanel, 
					num+" 번 회원 수정",
					JOptionPane.OK_CANCEL_OPTION
					);
			// ㅇ5. 리턴되는 숫자값을 텍스트로 콘솔창에 출력하기
			System.out.println(result); 
			//ㅇ5-1. 버튼마다 값이 있다.
			// ㅇ6. 만일 확인 버튼을 누르면 ... 
			// static final 상수를 이용하여 가독성 향상
			if(result == JOptionPane.OK_OPTION) {
				// ㅇ7. 입력한 이름과 주소를 읽어와서
				String name=inputName.getText();
				String addr=inputAddr.getText();
				// 수정, 반영한다.
				MemberDto newDto=new MemberDto();
				newDto.setNum(num);
				newDto.setName(name);
				newDto.setAddr(addr);
				boolean isSuccess=dao.update(newDto);
				if(isSuccess) {
				// this 는 나의 참조값 MemberFrame 이다. 
				// 당연히 프레임에 띄워야지
				// MemberFrame 은 컴포넌트 타입이기도 하다 
				JOptionPane.showMessageDialog(this, "수정 했습니다.");
				this.printMember();
			}else {
				JOptionPane.showMessageDialog(this, "수정 실패다.");
			}
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			dto.setNum(num);
			dao.update(dto);
			
			
			}
			
		});
		
		
		
		
		// 패널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(lable1);
		panel.add(inputName);
		panel.add(lable2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		
		// 패널의 배경색 설정
		panel.setBackground(Color.orange);
		// 패널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		// ㅌ3. 회원 목록을 출력할 테이블
		table=new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames= {"번호", "이름", "주소"};
		// 테이블에 연결 할 모델 객체
		model=new DefaultTableModel();
		// 모델에 칼럼 명을 전달한다.
		model.setColumnIdentifiers(colNames);
		model.setRowCount(0); // 처음에는 row 가 없도록 한다.
		// ㅌ6. 모델을 테이블에 연결
		table.setModel(model);
		
		// 셀 가운데 정렬용 렌더러 만들기
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);

		// 테이블 전체 열에 적용
		for (int i = 0; i < table.getColumnCount(); i++) {
		    table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}
		
		// ㅌ11. 테이블의 글차 크기와 행의 높이 조절
		table.getTableHeader().setFont(new Font("Sans-serif", 		Font.BOLD, 18)); 
		table.setFont(new Font("Sans-serif", Font.PLAIN, 		16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정
		
		// ㅌ4. row 가 많은 경우 스크롤도 할 수 있어야 한다.
		JScrollPane scroll = new JScrollPane(table);
		// ㅌ5. 테이블을 품고 있는 JScrollPane 을 프레임의 가운데에 		배치하기
		add(scroll, BorderLayout.CENTER);
		
		// ㅌ7. sample data 를 출력하기
		//Object[] row1= {0, "sample name", "sample addr"};
		//model.addRow(row1);
		// ㅌ8. MemberDao 객체를 이용해서 회원목록을 얻어온 다음
		// 실제 회원 목록을 table 에 반복문 돌면서 출력해보기 (생성자에서 		하면 딱 맞다) ㅇ
		
		
		List<MemberDto> memberlist=new MemberDao().selectAll();
		//selectAll은 배열타입을 리턴하지 않음 List<MemberDto> 리턴
		// 오브젝트 배열 얻어내기. Dto 객체 하나당 하나의 Object[] 을 		만들어서 모델에 추가
		for(MemberDto tmp : memberlist) {
			Object[] memrow= { // 무슨 타입이든 가능
					tmp.getNum(),
					tmp.getName(),
					tmp.getAddr()
			};
			model.addRow(memrow);
		}
		// ㅌ9. 방법2 
		/*
		 for(MemberDto tmp : memberlist) {
			
		
			model.addRow(new Object[] {
					tmp.getNum(),
					tmp.getName(),
					tmp.getAddr()
			});
		}
		*/
		
		
	}
	// 회원 목록을 출력하는 메소드
	public void printMember() {
		model.setRowCount(0);
		List<MemberDto> memberlist=new MemberDao().selectAll();
		//selectAll은 배열타입을 리턴하지 않음 List<MemberDto> 리턴
		// 오브젝트 배열 얻어내기. Dto 객체 하나당 하나의 Object[] 을 		만들어서 모델에 추가
		for(MemberDto tmp : memberlist) {
			Object[] memrow= { // 무슨 타입이든 가능
					tmp.getNum(),
					tmp.getName(),
					tmp.getAddr()
			};
			model.addRow(memrow);
		}
	}
	
	
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보!");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
