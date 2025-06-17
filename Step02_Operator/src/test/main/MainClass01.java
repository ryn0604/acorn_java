package test.main;
/*
 * [산술 연산자]
 * +, -, *, /, %
 * 
 * */
public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		// + 연산하기
		int sum = 10 +1;
		int sum2 = num1+num2;
		int sum3 = 10 + num2;
		// 정수끼리 연산하면 결과는 정수만 나온다.
		int result1 = 5/3;
		int result2 = num1/num2;
		// 연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		// double reuslt3 = 5/3.0;
		double result3 = 5/(double)3;
		// 10을 3으로 나눈 나머지 값을 변수에 담기
		int result4 = 10%3;
	
		byte a = 10;
		// a는 byte type인데 a에 저장된 값을 int type b에 대입하는 건 문제가 없을까?
		int b = a;
		// b는 int type 인데 b에 저장된 값을 byte type c에 대입하는 건 문제가 없을까?
		// 문제가 있을 수도 있고 없을 수도 있다.
		/*
		 * b 자체는 int type 이지만 (byte) 연산자로 casting 하면
		 * 대입연산자의 우측에는 byte type 이 있다고 간주되어서 문법이 성립한다.
		 * 대신 b 안에 들어 있는 값의 byte 범위 안에 들어 있다는 것이 확실할 때만
		 * casting 해야지 오류가 없다.
		 * */
		byte c = (byte)b;
		int d = 1000;
		// 잘못된 값이 들어간다
		byte e = (byte)d;
	}

}
