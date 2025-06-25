package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해 보세요
		// 실행했을 때 Exception 이 발생하지 않아야 한다
		
		// Messenger type 객체의 sendPost() 메소드를 호출하기 위해서는
		// Messenger 객페를 생성
		Messenger msg = new Messenger();
		
		msg.sendPost(new Post(1, "제목1", "작성자1"));
	}
}
