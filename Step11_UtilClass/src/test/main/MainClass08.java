package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap<key type, value type>
		 * 
		 * key type 은 일반적으로 String type 을 가장 많이 사용
		 * value type 은 담고 싶은 데이터의 type 을 고려해서 지정하면 된다
		 * value type 을 Object 로 지정하면 어떤 data type 이던지 다 담을 수 있다
		 * 순서가 없는 데이터를 다룰 때 사용하면 된다
		 * dto 클래스 대신에 사용하기도 한다
		 * */
		// HashMap 클래스는 Map 인터페이스를 구현했다
		Map<String, Object> map = new HashMap<>();
		// 데이터를 담을 때는 .put(key, value) 메소드를 이용해서 참고
		map.put("num", 1);
		map.put("name", "유재석");
		map.put("isMan", true);
		
		// 데이터를 참조할 때는 .get(key) 메소드를 이용
		// value 의 Generic 이 Object 이기 때문에 원래 type 으로 casting 이 필요
		int num = (int)map.get("num");
		String name = (String)map.get("name");
		Boolean isMan = (Boolean)map.get("isMan");
		
		// 동일한 key 값으로 다시 담으면 수정
		map.put("name", "박명수");
		// 특정 key 값으로 담긴 내용 삭제
		map.remove("inMan");
		// 모두 삭제
		map.clear();
		
		// Map 인터페이스의 of() 라는 static 메소드로 read only Map 객체로 만들어 낼 수 있다
		Map<String, Object> map2 = Map.of(
			"num", 2 , 
			"name","정준하", 
			"isMan", false
		);
	}
}
