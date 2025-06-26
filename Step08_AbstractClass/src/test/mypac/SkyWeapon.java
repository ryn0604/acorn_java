package test.mypac;
// 공중 공격을 담당하는 무기를 만든다고 가정
public class SkyWeapon extends Weapon{
	/*
	 * Weapon(추상 클래스로 셍상된 객체)가 제공해주는 기능을 활용하면서
	 * attack() 나의 상황에(용도, 프로젝트 요구사항) 맞게 구현할 수 있다 
	 * */
	@Override
	public void attack() {
		// 부모 객체가 제공해주는 기능도 사용 가능
		this.prepare(); // this. 생략 가능
		System.out.println("공중 공격을 해요!");
	}
}
