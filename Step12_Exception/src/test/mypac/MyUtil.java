package test.mypac;

import java.util.Random;

public class MyUtil {
	// 0~9 사이의 랜덤한 정수를 콘솔이 출력하는 메소드인데 우연히 7이 나오면 WowException 이 발생하는 코드
	public static void generate() {
		Random ran = new Random();
		// 0~9 사이의 랜덤한 정수를 발생시켜서
		int ranNum = ran.nextInt(10);
		
		// 만일 우연히 7 이라는 숫자가 나오면
		if(ranNum == 7) {
			// throw 예약어와 함께 예외 객체 생성히면 Exception 발생한다
			throw new WowException("wow! 행운의 lucky 7!");
			
		}
		System.out.println(ranNum+"숫자 추첨 완료");
	}
	// 5초가 걸리는 가상의 그림을 그리는 메소드
	public static void drow(){
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	// 5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}
}
