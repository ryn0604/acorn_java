package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * - 메소드 안에 클래스를 정의 가능
		 * - 메소드 안에서만 사용 가능
		 * - 지역 내부클래스(Local Inner Class)
		 * */
		class Cat{
			public void say() {
				System.out.println("냥");
			}
		}
		// Local Inner Class 로 객체 생성 가능
		Cat c = new Cat();
		c.say();
	}
}
