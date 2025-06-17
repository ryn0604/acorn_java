package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 숫자 중에서 짝수의 총합을 구해서 출력하는 프로그래밍을 해 보세요.
		 * */
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			// i는 1,2,3,...99,100
			// 만일 i를 2로 나눈 나머지가 0이라면 (i가 짝수라면)
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
		
		// sum 초기화
		sum = 0;
		// i를 2,4,6,..98,100으로 변하게 for문을 구성할 수 있을까?
		for(int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
	}
}
