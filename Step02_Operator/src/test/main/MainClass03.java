package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * i 라는 변수를 만들고 초기값 0 대입
		 * i가 10보다 작은 동안에 반복 (작으면 for문 블럭을 실행)
		 * i를 1씩 증가 시키면서
		 * i는 for문 안에서 만들어진 지역변수 (for문이 종료되면 i는 사라짐)
		 * */
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
			
		System.out.println("------------");
			
		// 콘솔 창에 9부터 0까지 순서대로 출력되도록 for문을 구성해 보세요.
		/*
		 * i라는 변수를 만들고 9에 대입
		 * i가 -1보다 큰 동안에 반복
		 * i를 1씩 감소 시키면서
		 * */
		for(int i=9; i>-1; i--) {
			System.out.println(i);
		}
	}
}
