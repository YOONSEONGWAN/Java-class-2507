package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int[] 객체를 만들어 참조값을 지역변수 nums에 담기
		int[] nums= {0, 0, 0};
		//0번방부터 10 20 30 저장
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2 = new int[500];
		for(int i=0; i<500; i++) {
			nums2[i]=i+1;
			System.out.println(nums2[i]);
		};
	}
}
