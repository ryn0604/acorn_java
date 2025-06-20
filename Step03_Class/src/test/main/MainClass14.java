package test.main;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		new MemberDto();
		MemberDto dto = new MemberDto();
		
		MemberDto dto2 = new MemberDto(1, "정준하", "서래마을");
		
		MemberDto dto3 = new MemberDto();
		dto3.setNum(2);
		dto3.setName("유재석");
		dto3.setAddr("압구정");
	}
}
