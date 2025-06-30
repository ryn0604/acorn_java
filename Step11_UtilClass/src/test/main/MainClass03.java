package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		// 콘솔팡으로 부터 입력 받을 수 있는 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 문자열을 순서대로 저장할 수 있는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		/*위에서 생성한 Scanner 객체로 반복문 돌면서 문자열 5번 입력받아
		 * 입력할 때마다 ArraayList<String> 객체에 add() 하고
		 * 다 입력받으면 다시 한 번 반복문 돌면서 ArrayList<String> 객체에 저장된 문자열 5개를
		 * 순서대로 콘솔창에 출력하는 프로그래밍을 해 보세요
		 * */
		
		for(int i=0; i<5; i++) {
			System.out.print("문자열 입력 : ");
			// Scanner 객체를 이용해서 여기서 문자열 입력 받기
			String line = scan.nextLine();
			// 입력받은 문자열을 ArrayList 에 저장
			list.add(line);
		}

		System.out.println("----------출력 결과----------");
		for (String item : list) {
			System.out.println(item);
		}	
	}
}
