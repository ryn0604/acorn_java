package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		// Person 객체를 생성ㅎ해서 Person type 으로 받으면
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develope();
		
		System.out.println("-----------");
		// Person 객체를 생성해서 Singer type 으로 받으면 sing() 메소드만 사용 가능
		Singer p2 = new Person();
		p2.sing();
		
		System.out.println("-----------");
		// Person 객체를 생성해서 Programmer type 으로 받으면 develope() 메소드만 사용 가능
		Programmer p3 = new Person();
		p3.develope();
	}
}
