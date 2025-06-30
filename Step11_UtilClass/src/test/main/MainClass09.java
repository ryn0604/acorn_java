package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/*
 * HashSet 은 Set 인터페이스를 구현한 클래스 이다
 * 
 * - 순서가 없다
 * - key 값도 없다
 * - 중복을 허용하지 않는다
 * - 어떤 data 를 묶음(집합) 으로 관리하고자 할 때 사용한다
 * */
public class MainClass09 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역변수에 담기
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(10);
		set1.add(50);
		set1.add(20);
		set1.add(40);
		
		// 문자열을 저장할 수 있는 HashSet 객체
		Set<String> set2 = new HashSet<>();
		set2.add("유재석");
		set2.add("박명수");
		set2.add("정준하");
		set2.add("정형돈");
		set2.add("노홍철");
		set2.add("하하");
		set2.add("유재석");
		
		// Set 객체에 저장된 모든 아이쳄을 순서대로 보장할 수는 없지만 모두 참조해서 사용해 보기
		set1.forEach((item)->{
			// set1 은 Set<Integer> 이기 때문에 item 은 Integer type 이 된다
			Integer tmp = item;
			System.out.println(tmp);
		});
		
		set2.forEach((item)->{
			// set2 는 Set<String> 이기 때문에 item 은 String type 이 된다
			String tmp = item;
			System.out.println(tmp);
		});
		
		// 메소드 1개짜리 객체를 전달
		// 결국 forEach() 내부에서 Consumer type 의 객체의 메소드가 호출되는데
		// 그 메소드가 accept() 메소드가 확실한 상황
		/*set2.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
			
			
			}
		});*/
		
		// Iterator 를 사용하는 구조도 연습 (Set 의 generic 이 Iterator 의 generic 이 된다)
		Iterator<String> it = set2.iterator();
		/*
		 * 무한 루프를 구성하거나 정확한 반복횟수를 알 수 없을 때 while(){} 문을 사용
		 * */
		while(it.hasNext()) { // 다음 item 이 있는지 확인해서
			// 다음 item 을 얻어낸다 (item 의 type 은 Iterator 의 Generic type)
			String item = it.next();
			// 얻어낸 item 을 사용하고 또 다음 item 이 있는지 위에서 확인이 된다
			System.out.println(item);
		}
	}
}	
