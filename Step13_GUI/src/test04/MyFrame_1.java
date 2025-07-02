package test04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame_1 extends JFrame{
	// 생성자
	public MyFrame_1() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		JButton countBtn = new JButton("0");
		add(countBtn);
		
		countBtn.addActionListener((e)->{
			int count = Integer.parseInt(countBtn.getText());
			count++;
			countBtn.setText(String.format("%d", count));
		});		
        
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new MyFrame_1();
	}
}