package test.main;

import test.mypac.MemberInfo;

public class MainClass05 {
	public static void main(String[] args) {
		MemberInfo m1 =  new MemberInfo();
		m1.num = 1;
		m1.name = "유재석";
		m1.addr = "압구정";
		
		MemberInfo m2 = new MemberInfo();
		m2.num = 2;
		m2.name = "박명수";
		m2.addr = "이태원";
		
		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "정준하";
		m3.addr = "서래마을";
		
		MemberInfo[] members = {m1, m2, m3};
		
		MemberInfo[] a = members; // 배열
		MemberInfo b = members[0]; // 배열의 0번방 MemberInfo 객체
		int c = members[0].num; // 회원의 번호 1
		String d = members[0].name; // 회원의 이름 "유재셕"
		String e = members[0].addr; // 회원의 주소 "압구정"
		members[0].printData(); // 메소드 호출
		
		
	}
}
