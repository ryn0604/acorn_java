package test.main;

import test.auto.Car;

public class MainClass04 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "소나타";
		
		Car c2 = new Car();
		c2.name = "그랜저";
		
		c1.drive(); // 소나타가 달려요
		c2.drive(); // 그랜져가 달려요
	}
}
