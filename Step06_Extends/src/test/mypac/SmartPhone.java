package test.mypac;

public class SmartPhone extends HandPhone {
	//생성자 
	public SmartPhone() {
		System.out.println("SnartPhone() 생성자 호출됨");
	}
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	}
	
	//부모가 가지고 있는 메소드를 재정의 할 일이 많다 ! 
	//메소드 Override (덮어쓰기)
	@Override //재정의한 메소드임을 표시하는 어노테이션, 생략은 가능
	public void takePicture() {
		//super.takePicture(); //필요시 부모의 메소드도 호출해야 한다.
		System.out.println("1억 화소 사진을 찍어요~");
	}
}
