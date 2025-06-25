package test.main;

import test.mypac.ZzangGu;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 	ZzangGu 객체를 3개 생성해서 배열에 담은 다음 
		 * 	반복문 돌면서 배열에 담긴 ZzangGu 객체의 
		 * 	dance()메소드를 모두 호출해 보세요.
		 */
		
		ZzangGu z1=new ZzangGu();
		ZzangGu z2=new ZzangGu();
		ZzangGu z3=new ZzangGu();
		
		ZzangGu[] z10=new ZzangGu[3];
		z10[0]=z1;
		z10[1]=z2;
		z10[2]=z3;
		
		
		for(ZzangGu z50 : z10 ) {
			z50.dance();
		}
		System.out.println("-----------------");
		
		ZzangGu[] zs = {z1, z2, z3};
		
		for (int i=0; i<zs.length; i++) {
			ZzangGu tmp=zs[i];
			tmp.dance();
		}
	}
}
