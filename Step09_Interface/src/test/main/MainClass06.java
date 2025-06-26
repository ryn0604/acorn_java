package test.main;

import test.mypac.Warmer;

public class MainClass06 {
	public static void main(String[] args) {
		Warmer w1 = new Warmer() {
			@Override
			public void warm(String target) {
				System.out.println(target+"을 따뜻하게 해요");
			}
		};
		useWarm(w1);
		
		Warmer w2 = (String target)->{
			System.out.println(target+"을 뜨겁게 해요");
		};
		useWarm(w2);
		
		// 매개변수 type 생략 가능
		Warmer w3 = (e)->{
			System.out.println(e+"에 불을 붙여요");
		};
		useWarm(w3);
		
		useWarm((e)->{
			System.out.println(e+"이 불타고 있어요");
		});
	}
	
	public static void useWarm(Warmer w) {
		w.warm("손");
	}
}
