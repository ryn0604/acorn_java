package test.mypac;

public class Person implements Singer, Programmer{
	public void work() {
		System.out.println("일을 해요!");
	}

	@Override
	public void develope() {
		System.out.println("노래를 불러요!");
	}

	@Override
	public void sing() {
		System.out.println("App을 개발해요!");
	}
	
}
