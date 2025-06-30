package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		int i = 0;
		while(i<5) {
			System.out.println(i+"반복 시작");
			i++;
		}
		
		System.out.println("------------");
		
		int j = 0;
		// 무한 루프는 실행하다가 break 문을 만나면 탈출 가능
		while(true) {
			System.out.println(j+"반복 시작");
			j++;
			if(j == 5) {
				break; // 반복문 탈출
			}
		}
	}
}
