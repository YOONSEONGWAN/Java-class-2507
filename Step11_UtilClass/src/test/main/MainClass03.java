package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		ArrayList<String> msgs=new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("문자열 입력: ");
			String line = scan.nextLine();
			msgs.add(line);
		}
		System.out.println("------------");
		for (String tmp : msgs) {
			System.out.println(tmp);
		}
	}
}
