package test.main;

import javax.swing.JFrame;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 창");
		f.setBounds(100, 100, 500, 500); // 초기위치 와 가로, 세로
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);
	}
}
