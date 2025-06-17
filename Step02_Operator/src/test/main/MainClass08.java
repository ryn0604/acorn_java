package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * for 문을 이용해
		 * 1 + 2 + 3 + 4 + .... + 99 + 100
		 * 
		 * 의 총합을 콘솔창에 출력하는 프로그래밍을 해 보세요.
		 * hint : += 연산자를 활용해 보세요.
		 * */
		int sum = 0;
		for(int i=0; i<100; i++){
			// sum = sum+i+1
			// i는 0,1,2,3,...98,99 로 변한다
			// sum에 대입되는 값은 1,2,3,4..99,100을 더한 값이 대입
			sum += i+1; // i에 1을 더한 값을 sum이라는 변수에 누적 
		}
		System.out.println("1~100 까지의 총합:"+sum);
		
		// sum은 0으로 다시 초기화
		sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i; // i값을 sum이라는 변수에 누적
		}
		System.out.println("1~100 까지의 총합:"+sum);
	}
}
