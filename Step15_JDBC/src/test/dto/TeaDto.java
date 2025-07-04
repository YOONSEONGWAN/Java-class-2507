package test.dto;

public class TeaDto {
	private int num;
	private String name;
	private String color;
	private String scent; // 향
	private String tasteSummary; // 맛 총평
	private int tasteRichness; // 맛의 세기
	private int tasteWeight; // 맛의 무게감
	private String tasteDetail; // 세부 묘사
	private String evaluation; // 기타 기재사항
	
	public TeaDto() {}

	public TeaDto(int num, String name, String color, String scent, String tasteSummary, int tasteRichness,
			int tasteWeight, String tasteDetail, String evaluation) {
		super();
		this.num = num;
		this.name = name;
		this.color = color;
		this.scent = scent;
		this.tasteSummary = tasteSummary;
		this.tasteRichness = tasteRichness;
		this.tasteWeight = tasteWeight;
		this.tasteDetail = tasteDetail;
		this.evaluation = evaluation;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}

	public String getTasteSummary() {
		return tasteSummary;
	}

	public void setTasteSummary(String tasteSummary) {
		this.tasteSummary = tasteSummary;
	}

	public int getTasteRichness() {
		return tasteRichness;
	}

	public void setTasteRichness(int tasteRichness) {
		this.tasteRichness = tasteRichness;
	}

	public int getTasteWeight() {
		return tasteWeight;
	}

	public void setTasteWeight(int tasteWeight) {
		this.tasteWeight = tasteWeight;
	}

	public String getTasteDetail() {
		return tasteDetail;
	}

	public void setTasteDetail(String tasteDetail) {
		this.tasteDetail = tasteDetail;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
