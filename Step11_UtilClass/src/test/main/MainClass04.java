package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList<>();
		
		// greets 에 들어 있는 참조값을 이용해서 인사말 3개를 임의로 담아 보세요
		greets.add("hello");
		greets.add("bye");
		greets.add("good night");
		
		Consumer<String> con1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				// t 는 Consumer 객체를 사용하는 ArrayList 객체에 저장된 item 이 전달
				System.out.println(t);	
			}
		};
		/* .forEach() 메소드를 호출하면서 전달하 Consume 객체의 accept() 메소드가
		 * 배열에 저장된 item 의 갯수만큼 호출되고
		 * 메소드의 매개 변수에는 배열에 저장된 아이템이 순서대로 전달된다*/
		greets.forEach(con1);
		
		System.out.println("--------------");
		
		Consumer<String> con2 = (t)->{
			// t 는 String type
			System.out.println(t);
		};
		greets.forEach(con2);
		/*
		 * 매개변수의 갯수가 1개일 때는 매개변수를 둘러싸는 ()는 생략 가능
		 * 매개변수의 이름은 마음대로 정할 수 있다 (배열에 저장된 item 이라는 의미에서 item 으로 정함)
		 * 함수 안에서 실행할 code 가 1줄 이거나 또는 리턴할 값만 명시할 때는 {} 생략 가능
		 * */
		greets.forEach(t -> System.out.println(t));
		
		System.out.println("--------------");
		
		greets.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);	
			}
		});
	}
}
