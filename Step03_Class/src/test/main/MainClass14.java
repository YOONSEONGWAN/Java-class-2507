package test.main;

import java.util.ArrayList;

import test.auto.Car;
import test.mypac.MemberDto;
import test.mypac.PostDto;

public class MainClass14 {
	public static void main(String[] args) {
		
		new MemberDto(); //변수에 안 담았으니 그냥 버리게 된 것
		MemberDto dto=new MemberDto();
		
		MemberDto dto2=new MemberDto(1, "김구라", "노량진");
		
		MemberDto dto3=new MemberDto();
		dto3.setNum(2);
		dto3.setName("해골");
		dto3.setAddr("행신동");
		
		Car c1= new Car(); 
		c1.name = "911";
		c1.price = 25000000;
		 
		ArrayList<PostDto> postList = new ArrayList<>();
		
		new PostDto();
		PostDto pd1=new PostDto();
		pd1.setId(1);
		pd1.setContent("오늘 저녁은 뭘 먹을까요");
		pd1.setAuthor(dto2.getName());
		pd1.setCar1(c1);
		
		PostDto pd2=new PostDto(2, "내일 저녁 뭘로먹지", dto3.getName(), c1);
		
		postList.add(pd1);
        postList.add(pd2);
        for (PostDto post : postList) {
            System.out.println("게시글 번호: " + post.getId());
            System.out.println("내용: " + post.getContent());
            System.out.println("작성자: " + post.getAuthor());
            System.out.println("관련 자동차: " + post.getCar1().name);
            System.out.println("----------------------");
        }
	}
}
