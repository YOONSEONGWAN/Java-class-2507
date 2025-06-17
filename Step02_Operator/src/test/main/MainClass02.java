package test.main;
/* 
 *	2. 증감 연산자 테스트 
 * 		변수에 있는 숫자 값을 1씩 증가 및 감소 시킬 때 사용
 *	++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++; // num은 최종적으로 3이 된다.
		
		int num2 = 0;
		num2--;
		num2--;
		num2--; // num2는 -3이 된다.
		
		int num3 = 0;
		int result1 = num3++; // 1. result1에 0 대입, 2. num3이 1 증가. 증감연산자의 경우 우선순위가 마지막이라 대입이 먼저다.
		int num4 = 0;
		int result2 = ++num4; // 1. num4가 1 증가하고 2. resul2에 대입. 이렇게 나오면 증감을 먼저 하고 대입한다.
	}
}
