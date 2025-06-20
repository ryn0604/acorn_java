package test.auto;
/*
 * class 의 역할
 *
 * 1. 객체의 설계도 역할
 *   - 객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면 된다.
 *   - class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼 수 있다.
 *   - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계할 수 있다.
 *   
 * 2. data type 활용
 * 
 * 3. static 필드와 메소를 포함하는 역할
 * */
public class Car {
	// 차의 이름을 저장할 필드 만들기 (필드는 지역변수가 아닌, 객체 고유의 저장소, 필드는 선언만 해도 기본값이 들어가면서 만들어진다)
	public String name; // 참조 데이터 type 의 기본값은 null
	// 차의 가격을 저장할 필드 만들기
	public int price; // 기본 데이터(int) type 의 기본값은 0
	// 달리는 기능(method) 만들기
	public void drive() {
		System.out.println(this.name +"이(가) 달려요!");
	}
}
