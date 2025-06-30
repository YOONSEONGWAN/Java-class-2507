package test.mypac;

public class MemberDto {
	// field
	private int num;
	private String name;
	private String addr;
	
	
	// Mo Args Constructor
	public MemberDto() {}

	// All Args Constructor
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	// setter, getter method
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
