package test.mypac;

public class MemberInfo {
	public int num;
	public String name;
	public String addr;
	
	//필드에 저장된 정보를 콘솔창에 이쁘게 출력해주는 메소드
	public void printData() {		
		String data = "번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr;
		System.out.println(data);
	}
}
