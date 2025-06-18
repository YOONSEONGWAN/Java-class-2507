package main.test;

public class MainClass01 {
	public static void main(String[] args) {
		boolean result1 = 10==10;
		boolean result2 = 10!=10;
		
		boolean result10 = false||false ;
		boolean result20 = false||true;
		boolean result30 = true&&true;
		boolean result40 = true&&false;
		
		long sum=1;
		for(long i=1; i<=25; i++) {
			sum/=i;
		}
		System.out.println("숫자의 곱:"+sum);
	}
}
