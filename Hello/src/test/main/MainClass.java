package test.main;

// MainClass 라는 이름의 클래스 만들기
public class MainClass {
	// main 이라는 이름의 method 를 class 안에 만들기
	public static void main(String[] args) {
		// main() method 안에 있는 코드를 실행하려면 ▶ 버튼을 누르면 된다
		/* = javaScript 에서
		   function main(args){console.log("Hello, World!");}*/
		System.out.println("Hello, World!");
		System.out.println("김채린");
		
		// javaScript에서 let num = 10;
		int num = 10;
		num = 20;
		num = 30;
		// type이 맞지 않으면 안 만들어진다
		// num = 10.1;
		// num = true;
		// num = "abcd";
		double num2 = 10.1;
		num2 = 20.1;
		
		boolean isRun = true;
		isRun = false;
		
		String myName = "김구라";
		myName = "해골";
	}
}
