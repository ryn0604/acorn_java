package test.main;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		// c1 은 null
		Car c1 = MyUtil.car;
		// Car 객체를 생성해서 MyUtil 클래스의 car 라는 필드에 담기
		MyUtil.car = new Car();
		// c1은 위에서 생성한 Car 객체의 참조값이 들어 있다.
		Car c2 = MyUtil.car;
		c2.drive();
		// MyUtil 클래스의 car 라는 필드를 직접 참조해서 drive() 메소드를 호출할 수 있다.
		MyUtil.car.drive();
		// MyUtil = class
		// MyUtil.car = car type
		
		PrintStream p = System.out;
		p.println("hi");
		// System : class
		// System.out : PrintStream type
		// System.out.println() : 객체의 참조값의 기능 사용
		/* -> public class System{
		 * 	  	public static PrintStream out;
		 *   }
		 * */
	}
}
