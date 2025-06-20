package test.main;

import test.mypac.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setNum(1);	
		dto.setName("정준하");
		dto.setAddr("서래마을");
		
		// dto 객체에 보관된 num, name, addr 를 참조하고 싶다면?
		// 회원의 번호를 콘솔창에 출력하고 싶다면?
		// 어떤 메소드를 호출한 이 위치는 어떤 값이 외돌아 온다 (return 값이 있다)
		System.out.println(dto.getNum());
		
		// 회원의 이름을 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getName());

		System.out.println(dto.getAddr());
		
		// dto 의 getter 메소드를 호출해서 리턴되는 값을 변수에 연습삼아 담아보기
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
		
		System.out.println("-------");
		System.out.println(num);
		System.out.println(name);
		System.out.println(addr);
		
	}
}
