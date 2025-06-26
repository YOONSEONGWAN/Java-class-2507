package test.mypac;

// 함수 형대로 쓰기 위한 어노테이션 (메소드 1개가 강제된다)
// 함수 템플릿을 만들기 위함 (함수의 와꾸 통일)
@FunctionalInterface
public interface Warmer {
	public void warm(String target); //가상의 메소드
}
