package test.main;
/*
 * [Java 기본 데이터 Type]
 * 
 * 2. 논리형 (boolean)
 * 
 * - true, false 두가지 값 중 하나
 * - true, false 를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다
 * - 참과 거짓을 나타내는 데이터 type
 * */
public class MainClass03 {
	public static void main(String[] args) {
		// 논리형 변수 선언과 동시에 값 대입하기
		boolean isRun = true;
		
		if(isRun) {
			System.out.println("달려요");
		}
		// 비교 연산의 결과로 얻어지 boolean 값 담기
		boolean isGreater = 10>1;
		// 논리 연산의 결과로 얻어진 boolean 값 담기
		boolean result = true||false;
		// 한 번 선언한 변수는 다시 선언 불가능
		// boolean result = false;
		result = false; // 변수에 다른 값 대입 가능 (동일한 type인 경우)
	}
}
