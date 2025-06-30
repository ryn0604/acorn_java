package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// java 에서 배열은 용도가 한정되어 있다. Item 을 담을 수 있는 공간을 늘이거나 줄일 수 없다
		
		// 문자열(String) type 을 담을 수 있는 방 5개 짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "유재석";
		names[1] = "박명수";
		names[2] = "정준하";
		
		// 아이템을 갯수 상관없이 필요에 따라 마음대로 추가하거나 제거할 수 있는 배열 목록(ArrayList) 객체 생성
		ArrayList<String> friends = new ArrayList<>();
		
		// 유재석, 박명수, 정준하 를 순서대로 담아 보세요 (3줄 코딩)
		friends.add("유재석");
		friends.add("박명수");
		friends.add("정준하");
		
		// 2번방의 item 을 "정형돈" 으로 수정
		friends.set(2, "정형돈");
		
		// 0번 방의 아이템을 불러와서 item 이라는 변수에 담기
		String item = friends.get(0);
		
		// 1번 방의 아이템을 삭제
		friends.remove(1);
		
		// 저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담기
		int size = friends.size();
		
		// 0번 방에 "노홍철" 을 끼워넣기
		friends.add(0, "노홍철");
		
		// 저장된 모든 아이템 전체 삭제
		friends.clear();
	}
}
