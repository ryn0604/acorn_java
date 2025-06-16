package test.main;
/*
 * 정수끼리 연산하면 결과는 정수만 나온다 (소수점 무시)
 * 정수와 실수를 연산하면 결과는 실수가 나온다 (소수점 무시X)
 * */
public class MainClass02 {
	public static void main(String[] args) {
		// 1. 콘솔차에 "main 메소드가 시작되었습니다." 를 출력해 보세요.
		System.out.println("main 메소드가 시작되었습니다.");
		// 2. 국어 점수 95를 kor 이라는 변수에 담아보세요.
		int kor = 95;
		// 3. 영어 점수 100을 eng 라는 변수에 담아보세요.
		int eng = 100;
		// 3. 만들어진 변수를 이용하여 국어 점수와 영어 점수의 평균을 구한 다음(연산자 활용) avg 라는 변수에 담아 보세요.
		double avg = (kor+eng)/2d;
		// 4. 콘솔창에 avg 변수 안에 담긴 내용을 출력해 보세요.
		System.out.println(avg);
		// 원하는 format 의 문자열 만들기
		String info = "평균:"+avg;
		String info2 = "국어:"+kor+" 영어:"+eng+" 평균:"+avg;
		System.out.println(info);
		System.out.println(info2);
	}
}
