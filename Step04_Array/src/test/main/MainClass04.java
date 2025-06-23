package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
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
		
		// 위에 생성한 MemberInfo 객체의 참조값 3개를 배열에 순서대로 담아 보세요.
		MemberInfo[] members = {m1, m2, m3};
		
		// 아래와 같이 할 수도 있다
		MemberInfo[] members2 = {null, null, null};
		members2[0] = m1;
		members2[1] = m2;
		members2[2] = m3;
		
		MemberInfo[] members3 = new MemberInfo[3];
		members3[0] = m1;
		members3[1] = m2;
		members3[2] = m3;
	}
}
