package test.mypac;

public class Rect extends Shape{
	// 사각형의 변의 길이를 저장할 필드
	private int sideLength;
	
	public Rect(int x, int y, int sideLength) {
		super(x,y);
		this.sideLength = sideLength;
	}
	
	public void printArea() {
		// 사각형의 넓이
		double extent = sideLength*sideLength;
		System.out.println("사각형의 넓이:"+extent);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("한변의 길이:"+sideLength);
	}
	
	
	
}
