package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1. 한 명의 회원정보를 MemberInfo 객체에 담아 보세요
		 * ( 번호, 이름, 주소 는 본인 마음대로 설정)
		 * 
		 * */
		MemberInfo mem = new MemberInfo();
		
		mem.num = 7;
		mem.name = "박명수";
		mem.addr = "이태원";
		
		// 2. 위에서 생성한 객체(MemberInfo) 의 prinData() 메소드를 호출해 보세요.
		mem.printData();
	}
}
