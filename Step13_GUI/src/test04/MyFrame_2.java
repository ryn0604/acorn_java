package test04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame_2 extends JFrame implements ActionListener{
	// 버튼의 참조값을 담을 필드
	JButton countBtn;
	JButton plusBtn;
	JButton minusBtn;
	JButton resetBtn;
	// 버튼을 누른 횟수를 저장할 필드
	int count;
	
	// 생성자
	public MyFrame_2() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		// 생성자 버튼의 참조값을 필드에 저장하면 객체 안에서 어디서든지 활용 가능
		countBtn = new JButton("0");
		add(countBtn);
		countBtn.addActionListener(this);
		
		this.plusBtn = new JButton("plus");
		add(plusBtn);
		plusBtn.addActionListener(this);
		
		this.minusBtn = new JButton("minus");
		add(minusBtn);
		minusBtn.addActionListener(this);
		
		this.resetBtn = new JButton("reset");
		add(resetBtn);
		resetBtn.addActionListener(this);
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new MyFrame_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == plusBtn) {
			count++;
		} else if(source == minusBtn){
			if(count>0) {
				count--;
			} else {
				JOptionPane.showMessageDialog(this, "0 미만 불가");
			}
		} else if(source == resetBtn) {
			count = 0;
			JOptionPane.showMessageDialog(this, "초기화했습니다!");
		}
		
		countBtn.setText(Integer.toString(count));
	}
}
