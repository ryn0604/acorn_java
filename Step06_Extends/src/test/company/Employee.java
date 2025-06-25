package test.company;

public class Employee {
	// 사원 이름
	private String name;
	// 사원 급여
	private int salary;
	// 근무하는 부서의 정보
	private Department dept;
	
	// 필드에 저장할 정보를 생성자로 전달받아서 저장
	public Employee(String name, int salary, Department dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	// 테스트 메소드
	public void printInfo() {
		System.out.println("이름:"+name);
		System.out.println("급여:"+salary);
		dept.printInfo();
	}
	
}
