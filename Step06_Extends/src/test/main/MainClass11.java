package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
		// Item 객체 생성
		Item item = new Item();
		// 2. item. : 불가
		// 5. item.을 하면 name 은 없지만 setName 은 있다
		
		// 6. setter 메소드를 통해 필드에 값 전달
		item.setName("전자시계");
		// ㄴ> private 로 되어있는 필드에 값을 넣어주기 위해서
		
		// 7. Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용아려면?
		// 활용이란?
		// 1) 특정 변수에 담고 싶다
		// 2) 어딘가에 전달하고 싶다 (다른 클래스의 생성자나 다른 객체의 메소드에)
		// 3) 콘솔창에 출력하고 싶다... 등
			
		/* 8. 불가능
		 * String a = item.name;
		   System.out.println(item.name); ->*/
		// 9. item.name 대신에.. 
		String a = item.getName();
		System.out.println(item.getName());
	}
}
