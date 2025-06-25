package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		Department d1 = new Department("영업부", "대전");
		/*
		 * 위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서 그 참조값 3개를
		 * 배열에 순서대로 담아 보세요
		 * */
				
		Employee e1 = new Employee("유재석", 3000, d1);
		Employee e2 = new Employee("박명수", 2000, d1);
		Employee e3 = new Employee("정준하", 1000, d1);
		// Employee[] emp = {e1,e2,e3};
		
		Employee[] emp = new Employee[3];
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		
		// for문을 이용해서 Employee[] 에 담긴 Employee 객체의 .printInfo() 메소드를 순서대로 호출
		for(int i=0; i<emp.length; i++) {
			// 1번째 뱡에 담긴 Employee 객체의 참조값 얻어내기
			Employee tmp = emp[i];
			// 메소드 호출
			tmp.printInfo();
			// emp[i].printInfo();
		}
		
		System.out.println("-------------");
		
		for (Employee e : emp) {
			e.printInfo();
		}
	}
}
