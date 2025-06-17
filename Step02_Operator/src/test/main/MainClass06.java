package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//boolean type 변수나 상수는 대화식으로 지으면 가독성이 좋아진다. 동사 넣어서 작성 
		boolean isPretty=true;
		boolean canEat=false;
		
		//만약 이쁘면.. 코드를 실행. 
		if(isPretty) {
			//여기는 이쁘면 실행된다.
		}
		
		//만약 이쁘지 않다면 ..
		if(!isPretty) {
			// 여기는 안 이쁘면 실행된다.
		}
		
		//만약 먹을 수 있다면 ..
		if(canEat) {
			//먹을 수 있으면 실행된다.
		}
		
		//만약 먹을 수 없다면..
		if(!canEat) {
			// 먹을 수 없으면 실행된다.
		}else {//먹을 수 없다가 아니라면. (먹을 수 있지 않다가 아니라면)
			//먹을 수 있으면 실행된다.
		}
		
		//만약 이쁘거나 먹을 수 있으면 ... 
		if(isPretty||canEat) {
			//이쁘거나 먹을 수 있거나 둘 중 하나 이상만 만족하면 된다.
		}
		
		// 만약 이쁘고 먹을 수 있다면
		if(isPretty&&canEat) {
			//이쁘기도 하고 먹을 수 있어야 실행된다.
		}
		
		//만약 이쁘고 먹을 수 없다면 
		if(isPretty&&!canEat) {
			//이쁘기도 하고 먹을 수도 없어야 실행된다.
		}
	}
}
