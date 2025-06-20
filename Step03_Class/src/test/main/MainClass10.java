package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 1. MemberInfo 객체를 3개 생성해서 m1, m2, m3 라는 변수에 각각 담아 보세요.
		 * 
		 * 2. m1, m2, m3 에 들어있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아 보세요.
		 * 
		 * 3. 각각의 객체가 가지고 있는 printData() 메소드를 호출해 보세요. 
		 * */
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();
		
		m1.num = 1;
		m1.name = "유재석";
		m1.addr = "압구정";
		
		m2.num = 2;
		m2.name = "박명수";
		m2.addr = "이태원";
		
		m3.num = 3;
		m3.name = "정준하";
		m3.addr = "서래마을";
		
		m1.printData();
		m2.printData();
		m3.printData();
	}
}
