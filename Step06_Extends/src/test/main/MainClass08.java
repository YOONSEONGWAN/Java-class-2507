package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 	사원 이름: 김구라
		 * 	급여: 1000
		 * 	부서명: 교육부
		 * 	부서의 위치: 역삼동
		 * 
		 * 	위 정보를 가지는 Employee 객체 만들어서 emp1에 담기
		 * 	Department, Employee 클래스 수정 X
		 * 
		 */
		Department dept1=new Department("교육부", "역삼동");
		Employee emp1=new Employee("김구라", 1000, dept1);
		emp1.printInfo();
		
		/*
		 *  위에서 생성한 부서와 동일한 부서에서 근무하는 사원 객체를 하나 			더 생성해보세요
		 *  사원이름: 원숭이
		 *  급여: 2000
		 */
		System.out.println("-----------------");
		
		Employee emp2=new Employee("원숭이", 2000, dept1);
		emp2.printInfo();
		
		System.out.println("-----------------");
		
		/*
		 * 	사원이름: 주뎅이
		 * 	급여: 3000
		 * 	부서이름: SALES
		 * 	부서위치: LA
		 * 	위의 정보를 가지는 Employee 객체를 생성하되 1줄코딩으로.
		 */
		Employee emp3=new Employee("주뎅이", 3000, new Department("SALES", "LA")); //한 번만 사용할 거라면 굳이 변수를 만들어서 전달하지 않아도 된다.
		emp3.printInfo();
	}
}
