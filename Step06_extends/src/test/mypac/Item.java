package test.mypac;

// 어떤 상품의 정보를 담기 위해서 클래스 설계하기
public class Item {
	private String name; // 상품명
	private int price; // 가격
	private String madeBy; // 제조사

	// 필드에 대한 이헤
	// 1. 3개 정보를 한 번에 Item 객체에 담았다
	//    접근지정자 private 인 상태
	
	// 3. 그렇기에 다른 클래스에서 접근이 불가하여 setter 와 getter 가 필요
	//    표준에 맞게 만들어두면 객체의 참조값을 어디에 전달했을 때 자동으로 만들어주는 기능이 많다 = 자동화를 위해 필요
	
	// 4. name 의 setter 메소드 생성
	public void setName(String name) {
		this.name = name;
	}
	
	// 9. name의 getter 메소드 생성
	public String getName() {
		return name;
	}
}
