package test.main;

import test.fruit.Apple;
import test.mypac.Pair;

public class MainClass03 {
	public static void main(String[] args) {
		Pair<String, Object> p1 = null;
		Pair<Integer, String> p2 = null;
		// 기본 data type은 Generic 클래스를 사용할 수 없다
		// Pair<int, String> p3 = null;
		
		// 객체 생성 시 Generic 클래스는 생략 가능
		Pair<String, Apple> p3 = new Pair<>("my", new Apple());
		String a = p3.getKey();
		Apple b = p3.getValue();
	}
}
