package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("유재석");
		dto1.setAddr("압구정");
		
		MemberDto dto2 = new MemberDto(2, "박명수", "이태원");
		MemberDto dto3 = new MemberDto(3, "정준하", "서래마을");
		
		// 위에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 배열에 담아 보세요
		MemberDto[] members = {dto1, dto2, dto3};
		
		MemberDto[] a = members;
		MemberDto b = members[1];
		
		int num = members[1].getNum(); // 2
		String name = members[1].getName(); // 박명수
		String addr = members[1].getAddr(); // 이태원
				
		
		
	}
}
