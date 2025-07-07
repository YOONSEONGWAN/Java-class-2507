package test.Frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoFrame extends JFrame {

	// 3. 필요한 필드 정의하기
	JTextArea ta=new JTextArea();
	// 7. 현재 열린 파일 객체를 저장할 필드( if 문 내에서 선언된 걸 사용하기 위해서
	File openedFile;
	
	// 1. 생성자만들기
	public MemoFrame(String title) {
		super(title);
		// 1-2.메뉴를 메뉴바에 추가하고, 아이템을 메뉴에 추가하고 메뉴바를 프레임에 추가한 모습.
		// 메뉴바
		JMenuBar mb=new JMenuBar();
		// 메뉴
		JMenu menu=new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem=new JMenuItem("New");
		JMenuItem openItem=new JMenuItem("Open");
		JMenuItem saveItem=new JMenuItem("Save");
		JMenuItem saveAsItem=new JMenuItem("Save As");
		
		// 8. 처음에 저장 기능은 disabled 상태가 맞다.
		saveItem.setEnabled(false);
		saveAsItem.setEnabled(false);
		
		// 메뉴에 있는 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		// 메뉴를 메뉴바에 추가
		mb.add(menu);
		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		// 3. 레이아웃 설정
		setLayout(new BorderLayout());
		// 3-1. 스크롤 패널
		JScrollPane scp =new JScrollPane(ta);
		// 3-2. 프레임의 가운데에 JScrollPane 배치하기
		add(scp, BorderLayout.CENTER);
		// 3-3. JTextArea 의 글자크기 조절하기
		Font font=new Font("setif", Font.PLAIN, 30);
		ta.setFont(font);
		ta.setVisible(false); // 처음에는 JTextArea 를 안 보이게 설정
	
		
		// 4. new 를 눌렀을때
		newItem.addActionListener((e)->{
			ta.setVisible(true);
			// frame e 의 제목 바꾸기
			setTitle(" 제목 없음 ");
			saveAsItem.setEnabled(true); //9.
		});
		
		// 5. Save As 를 눌렀을 때
		saveAsItem.addActionListener((e)->{
			// 파일 선택을 하게 해주는 객체 생성
			var fc=new JFileChooser();
			// 파일을 저장하게 하는 다이얼로그 
			int result=fc.showSaveDialog(this);
			// 만일 제대로 파일을 만들 준비를 했다면
			if(result == JFileChooser.APPROVE_OPTION) {
				//해당 file 객체를 얻어오기
				openedFile=fc.getSelectedFile();
				// 프레임의 title 로 파일명을 클릭
				setTitle(openedFile.getName());
				// 5-2. 실제로 해당 파일 만들기
				try {
					openedFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				// 6-1. 파일에 저장하는 메소드 호출
				saveToFile();
				
			}
		});
	}
	// 6. 현재까지 JTextArea에 입력한 내용을 읽어와서 openedFile 에 저장하는 메소드
	public void saveToFile() { //10.
		//JTextArea 에 입력한 문자열을 읽어와서
		String memo = ta.getText();
		// FileWriter 객체를 이용하여 openedFile 객체에 문자열이 저장되도록 한다.
		try (
			var fw=new FileWriter(openedFile);
		){
			fw.append(memo);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MemoFrame f=new MemoFrame("메모장");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
