package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// String type 의 기능(method) 사용해 보기
		String str = "abcd1234";
		// 문자열의 길이를 return 하는 length() 메소드 사용해 보기
		int length = str.length();
		// 문자열을 대문자로 변경해서 return 하는 사용해 보기
		String upper = str.toUpperCase();
		// 특정 문자열이 포함되어 있는지 여부를 return 하는 메소드 사용해 보기
		boolean contains = str.contains("cd");
	}
}
