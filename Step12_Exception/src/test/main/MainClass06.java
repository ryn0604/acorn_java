package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.drow();
		
		// 해당 메소드를 호출하는 곳에서 예외 처리를 해줘야 한다
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
