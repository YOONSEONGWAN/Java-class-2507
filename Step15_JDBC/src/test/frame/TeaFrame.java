package test.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.TeaDao;

public class TeaFrame extends JFrame {
	//NUM, NAME, COLOR, SCENT, TASTE_SUMMARY, TASTE_RICHNESS, TASTE_WEIGHT, TASTE_DETAIL, EVALUATION
	// 1. 필드 정의
	JTextField inputName, inputColor, inputScent, inputSummary, inputRichness, inputWeight, inputDetail, inputEvaluation;
	
	JTable table;
	DefaultTableModel model;
	TeaDao dao=new TeaDao();
	
	
	public TeaFrame() {
		// 2. 레이아웃 만들기
		setLayout(new BorderLayout());
		
		inputName = new JTextField(10);
        inputColor = new JTextField(10);
        inputScent = new JTextField(10);
        inputSummary = new JTextField(10);
        inputRichness = new JTextField(5);
        inputWeight = new JTextField(5);
        inputDetail = new JTextField(50);
		inputEvaluation = new JTextField(100);
		// JButton 
 		JButton insertBtn=new JButton("저장");
 		JButton deleteBtn=new JButton("삭제");
 		JButton updateBtn=new JButton("수정");
 		
		// 3. UI 만들기
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("이름"));
		topPanel.add(inputName);
		topPanel.add(new JLabel("색상"));
		topPanel.add(inputColor);
		topPanel.add(new JLabel("향기"));
		topPanel.add(inputScent);
		topPanel.add(new JLabel("맛_총점"));
		topPanel.add(inputSummary);
		topPanel.add(new JLabel("맛의강도"));
		topPanel.add(inputRichness);
		topPanel.add(new JLabel("무게감"));
		topPanel.add(inputWeight);
		topPanel.add(new JLabel("세부묘사"));
		topPanel.add(inputDetail);
		topPanel.add(new JLabel("총평 및 추가기재"));
		topPanel.add(inputEvaluation);
		topPanel.add(insertBtn);
		topPanel.add(deleteBtn);
		topPanel.add(updateBtn);
		
        
 		
 		
 		// 3. 수정하기
	}
	public void printTea() {
		
	}
	
	
	public static void main(String[] args) {
		TeaFrame f=new TeaFrame();
		f.setTitle("Tea Review");
		f.setBounds(100, 100, 1000, 600);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
