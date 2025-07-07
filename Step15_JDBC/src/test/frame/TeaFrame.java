package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import test.dao.TeaDao;
import test.dto.TeaDto;

public class TeaFrame extends JFrame {
	// 필드 정의
	JTextField inputName, inputColor, inputScent, inputSummary, inputRichness, inputWeight;
	JTextArea inputDetail, inputEvaluation;

	JTable table;
	DefaultTableModel model;
	TeaDao dao = new TeaDao();

	public TeaFrame() {
		// 전체 프레임 레이아웃 설정
		setLayout(new BorderLayout());

		// ====== 입력 필드 준비 ======
		inputName = new JTextField(10);
		inputColor = new JTextField(10);
		inputScent = new JTextField(10);
		inputSummary = new JTextField(10);
		inputRichness = new JTextField(4);
		inputWeight = new JTextField(4);
		inputDetail = new JTextArea(3, 40);
		inputEvaluation = new JTextArea(3, 40);

		// ====== 버튼 ======
		JButton insertBtn = new JButton("저장");
		JButton deleteBtn = new JButton("삭제");
		JButton updateBtn = new JButton("수정");

		// ====== 상단 패널 구성 ======
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
		topPanel.setBackground(Color.GRAY);

		// 첫 줄: 짧은 텍스트 필드
		JPanel row1 = new JPanel();
		row1.add(new JLabel("이름"));
		row1.add(inputName);
		row1.add(new JLabel("색상"));
		row1.add(inputColor);
		row1.add(new JLabel("향기"));
		row1.add(inputScent);
		row1.add(new JLabel("맛_총점"));
		row1.add(inputSummary);
		row1.add(new JLabel("맛의강도"));
		row1.add(inputRichness);
		row1.add(new JLabel("무게감"));
		row1.add(inputWeight);

		// 둘째 줄: 세부묘사 TextArea
		JPanel row2 = new JPanel();
		row2.add(new JLabel("세부묘사"));
		JScrollPane detailScroll = new JScrollPane(inputDetail);
		row2.add(detailScroll);

		// 셋째 줄: 총평 TextArea
		JPanel row3 = new JPanel();
		row3.add(new JLabel("총평 및 추가기재"));
		JScrollPane evalScroll = new JScrollPane(inputEvaluation);
		row3.add(evalScroll);

		// 버튼 줄 따로!
		JPanel buttonRow = new JPanel();
		buttonRow.add(insertBtn);
		buttonRow.add(deleteBtn);
		buttonRow.add(updateBtn);

		// 상단에 구성요소들 모으기
		topPanel.add(row1);
		topPanel.add(row2);
		topPanel.add(row3);
		topPanel.add(buttonRow);

		// 프레임에 추가
		add(topPanel, BorderLayout.NORTH);

		// ====== 테이블 구성 ======
		table = new JTable();
		String[] colNames = { "번호", "이름", "색상", "향기", "맛_총점", "맛의강도", "무게감", "세부묘사", "총평 및 추가기재" };
		model = new DefaultTableModel();
		model.setColumnIdentifiers(colNames);
		table.setModel(model);

		// 중앙 정렬
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
		}

		// 스타일 지정
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18));
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16));
		table.setRowHeight(25);
		JScrollPane scroll = new JScrollPane(table);

		// 테이블 붙이기
		add(scroll, BorderLayout.CENTER);
	}

	// 테이블 새로고침 메서드
	public void printTea() {
		model.setRowCount(0);
		List<TeaDto> tealist = new TeaDao().selectAll();
		for (TeaDto tmp : tealist) {
			Object[] tearow = {
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
		TeaFrame f = new TeaFrame();
		f.setTitle("Tea Review");
		f.setBounds(100, 100, 1200, 600); // 크기 살짝 키움
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
