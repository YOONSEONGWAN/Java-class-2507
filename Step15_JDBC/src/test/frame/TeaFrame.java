package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dao.TeaDao;
import test.dto.MemberDto;
import test.dto.TeaDto;

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
		
		topPanel.setBackground(Color.gray);
		add(topPanel, BorderLayout.NORTH);
		table=new JTable();
		String[] colNames= {"이름", "색상", "향기", "맛_총점", "맛의강도", "무게감", "세부묘사", "총평 및 추가기재"};
		model=new DefaultTableModel();
		model.setColumnIdentifiers(colNames);
		model.setRowCount(0);
		table.setModel(model);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
	table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);}
		
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18)); 
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
 		
 		// 3. 수정하기
	}
	public void printTea() {
		model.setRowCount(0);
		List<TeaDto> tealist=new TeaDao().selectAll();
		for(TeaDto tmp : tealist) {
			Object[] tearow= {
					tmp.getNum(),
					tmp.getName(),
					tmp.getColor(),
					tmp.getScent(),
					tmp.getTasteSummary(),
					tmp.getTasteRichness(),
					tmp.getTasteWeight(),
					tmp.getTasteDetail(),
					tmp.getEvaluation()
				};
				model.addRow(tearow);
			}
	}
	
	
	public static void main(String[] args) {
		TeaFrame f=new TeaFrame();
		f.setTitle("Tea Review");
		f.setBounds(100, 100, 1000, 600);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
