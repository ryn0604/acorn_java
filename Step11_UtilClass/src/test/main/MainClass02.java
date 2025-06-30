package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums 에 담기
		ArrayList<Integer> nums = new ArrayList<>();
		
		// ArrayList 객체에 10 20 30 숫자 3개를 담아 보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// ArrayList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 콘솔창에 출력해 보세요
		for (int num : nums) {
			System.out.println(num);
		}
		
		System.out.println("기본 for문을 이용하면------>");
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
}
