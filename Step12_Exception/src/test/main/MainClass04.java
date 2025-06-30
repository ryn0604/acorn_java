package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		
		try {
			/*
			 * Thread.sleep() 메소드 내부에서는 RuntimeException 을 상속받지 않은
			 * InterruptedException 이 발생한다. RuntimeException 을 상속받지 않은 예외는
			 * 예외 처리를 의무적으로 해야 한다. 처리 방법은
			 * 1. throw
			 * 2. try-catch 로 묶어주기
			 * */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();		
		}
		System.out.println("main 메소드가 종료 되었습니다");
	}
}
