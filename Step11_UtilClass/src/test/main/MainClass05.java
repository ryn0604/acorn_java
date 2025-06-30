package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		// MemberDto 객체를 저장할 수 있는 ArrayList 객체 생성
		// 참조값 List 인터페이스 type 으로 받아서 사용하는 경우가 많다
		List<MemberDto> list = new ArrayList<>();
		// 1번 회원의 정보
		MemberDto dto = new MemberDto();
		
		dto.setNum(1);
		dto.setName("유재석");
		dto.setAddr("압구정");
		
		// 2번 회원의 정보
		MemberDto dto2 = new MemberDto(2, "박명수", "이태원");
		
		// 3번 회원의 정보
		MemberDto dto3 = new MemberDto(3, "정준하", "서래마을");
		
		// 생성한 회원의 정보를 ArrayList 객체에 누적
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		
		// 확장 for문
		for(MemberDto tmp : list) {
			// 출력할 문자열을 String 클래스의 .format() 이라는 static 메소드를 이용해 구성하고
			String info = String.format("번호:%d 이름:%s 주소:%s", tmp.getNum(), tmp.getName(), tmp.getAddr());
			// 출력하기
			System.out.println(info);
		}
		
		System.out.println("forEach() 을 이용한다면");
		list.forEach(new Consumer<MemberDto>() {
			@Override
			public void accept(MemberDto t) {
				System.out.println(String.format("번호:%d 이름:%s 주소:%s", t.getNum(), t.getName(), t.getAddr()));
			}
		});
		
		list.forEach(t->{
			String info = String.format("번호:%d 이름:%s 주소:%s", t.getNum(), t.getName(), t.getAddr());
			System.out.println(info);
			
		});
	}
}
