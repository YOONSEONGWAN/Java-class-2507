package test.main;

import test.mypac.MemberInfo;

public class MainClass04_1 {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=30;
		
		int[] nums={num1, num2, num3};
		
		String name1="kim";
		String name2="lee";
		String name3="park";
		
		String[] names={name1, name2, name3};
		
		MemberInfo m1=new MemberInfo();
		MemberInfo m2=new MemberInfo();
		MemberInfo m3=new MemberInfo();
		
		MemberInfo[] members= {m1, m2, m3};
	}
}
