package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		
		Department d1=new Department("영업부", "대전");
		/*
		 *  위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서
		 *  그 참조값 3개를 배열에 순서대로 담아 보세요.
		 */
		Employee m1=new Employee("김구라", 1000, d1);
		Employee m2=new Employee("해골", 1000, d1);
		Employee m3=new Employee("원숭이", 1000, d1);
		
		Employee[] emp= {m1, m2, m3};
		
		Employee[] emp2=new Employee[3];
		emp2[0]=m1;
		emp2[1]=m2;
		emp2[2]=m3;
		
		for (int i=0; i<emp2.length; i++) {
			Employee emp3=emp2[i];
			emp3.printInfo();			
		}
		System.out.println("-------------------");
		for(Employee emp3 : emp2) {
			emp3.printInfo();
		}
	}
}
