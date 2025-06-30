package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass02_01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// 1. Scanner 객체로 반복문 돌며 문자열 5번 입력받고
		// 2. 입력 받을 때마다 ArrayList<String> 객체에 add() 하고
		// 3. 다 입력 받으면 다시 반복문 돌면서 
		// 	ArrayList<String> 객체에 저장된 문자열 5개를
		// 4. 순서대로 콘솔창에 출력하는 프로그래밍
		ArrayList<String> names=new ArrayList</*String*/>();
		
		for (int i=0; i<5; i++) {
			System.out.print("문자열을 입력하세요: ");
			String name = scan.nextLine();
			names.add(name);
		}
		System.out.println("---------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=0; i<5; i++) {
			System.out.println("숫자를 여기에 입력: ");
			int num = scan.nextInt();
			nums.add(num);
		}
		int sum=0;
		for (int i=0; i<nums.size(); i++) {
			sum += nums.get(i);
		}
		double avg = sum / 5.0;
		
		System.out.println("입력한 숫자들: "+nums);
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		
	}
}
