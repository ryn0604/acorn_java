package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상 클래스도 data type 의 역할을 할 수 있다
		Weapon w1 = null;
		
		// 그렇다면 Weapon type 의 참조값으 어떻게 얻어내기?
		// Weapon w2 = new Weapon(); : 추상 클래스 단독으로 객체 생성 불가
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
