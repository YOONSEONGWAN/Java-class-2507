package test.mypac;

public class MemberDto {
	//필드 정의하기 (접근지정자가 퍼블릭이 아닌 private로 되어 있으면 외부(다른 객체)에서 접근 불가능)
	//동일 객체 내부에서만 접근가능 
	private int num;
	private String name;
	private String addr;
	
	//생성자 (Constructor)
	//클래스명과 동일하고 return type 이 명시되어 있지 않음
	//객체를 new 하는 시점에 한 번 호출된다.
	//객체를 new 하는 시점에 무언가 초기화 작업을 할 게 있으면 여기서 하면 된다.
	public MemberDto() {
		System.out.println("MemberDto 클래스의 생성자가 호출됨 !");
	}
	// 생성자는 필요에 따라서 다른 모양으로 여러 개 정의할 수도 있다. 
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
		
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
