package test.main;
/*
 * run 버튼을 눌렀을 때 Java Virtual Machine 이 main() 메소드를 호출하면서 메인 스레드가 시작된다
 * 
 *  따라서 여기서 발생하는 예외를 우리가 처리하지 않으면 JVM 이 대신 처리 해준다
 * */
public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 메소드가 시작 되었습니다");
		
		// Exception 을 try catch 로 묶지 않으면 예외처리의 주체는 메소드를 호출한 곳에서 처리한다
		Thread.sleep(5000);

		System.out.println("main 메소드가 종료 되었습니다");
	}
}
