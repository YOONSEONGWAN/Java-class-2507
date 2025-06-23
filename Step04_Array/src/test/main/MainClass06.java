package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
		
		//위에서 생성한 MemberDto 객체 3개의 참조값을 순서대로 배열에 담아 보세요.
		
		//1. 일단 담는다.
		//{dto1, dto2, dto3}
		//2. 참조값을 담은 배열이 무슨 타입인지 생각한다. -> 배열타입이다.
		MemberDto[] dtos={dto1, dto2, dto3};
		MemberDto[] dtos2= {null, null, null};
		dtos2[0]=dto1;
		dtos2[1]=dto2;
		dtos2[2]=dto3;
		MemberDto[] dtos3=new MemberDto[3];
		dtos3[0]=dto1;
		dtos3[1]=dto2;
		dtos3[2]=dto3;
		
		
		//참조
		MemberDto[] d=dtos;
		MemberDto e=dtos[1];
		int a = dtos[1].getNum(); //최종적으로 int타입이 남는다. 
		String b=dtos[1].getName();
		String c=dtos[1].getAddr();
		
	}
}
