package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 여기서 아래에 정의된 useWeapon() 메소드를 호출하려면?
		 * */
		
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격중!");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격중!");
			}
		});
		
		useNum(1);
		useString("유재석");
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}
	
	public static void useNum(int num) {
		
	}
	
	public static void useString(String name) {
		
	}
}
