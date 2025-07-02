package myTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	//필요한 필드 정의
	Image unitImage, backImage1, backImage2, backImage3, bossImage3, playMissImage, bossMissImage, bossImage1, bossImage2;
	// Player 객체
    Player player;
   
    //플레이어가 보스랑 충돌한 후 쿨타임
    int playerHitCoolTime;
    
	// 배경1의 y 좌표, 배경2의 y 좌표
	int back1Y, back2Y = -800;
	// 스테이지 번호 저장
	int stage = 1;
	
	// 메세지
	String stageMessage;
	int stageMessageTimer;

	// Missle 에 객체를 누적시킬 ArrayList 객체
	List<Missile> playMissList = new ArrayList<>();
	List<Missile> bossMissList = new ArrayList<>();
	
	// Boss 객체 필드
	Boss boss;
	// Move 객체 필드
	Move move;
	
	//생성자
	public GamePanel() {
		//무언가 준비 작업 ...
		
		// Panel 의 크기 설정 width:500, height:800
		setPreferredSize(new Dimension(500, 800));
		
		// src/images/unit1.png 파일의 위치를 URL 객체로 얻어내기 
		URL url = getClass().getResource("/images/unit1.png");
 		
		// src/images/unit1.png 파일을 로딩해서 Image 객체로 만들기
		unitImage = new ImageIcon(url).getImage();
		// 배경 이미지
		backImage1 = new ImageIcon(getClass().getResource("/images/backbg.png")).getImage();
		backImage2 = new ImageIcon(getClass().getResource("/images/backbg2.png")).getImage();
		backImage3 = new ImageIcon(getClass().getResource("/images/backbg3.png")).getImage();
		// 미사일 이미지
		playMissImage = new ImageIcon(getClass().getResource("/images/mi2.png")).getImage();
		bossMissImage = new ImageIcon(getClass().getResource("/images/mi3.png")).getImage();
		// 보스 이미지
		bossImage1 = new ImageIcon(getClass().getResource("/images/juck1.png")).getImage();
		bossImage2 = new ImageIcon(getClass().getResource("/images/juck2.png")).getImage();
		bossImage3 = new ImageIcon(getClass().getResource("/images/juck3.gif")).getImage();
		
		// Player 생성 (초기 위치, 체력 10, 이미지)
        player = new Player(250, 700, 10, unitImage);
        
		move = new Move();
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				move.keyPressed(e.getKeyCode());
				
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					Missile m = new Missile(player.getX(), player.getY()-50);
	                playMissList.add(m);
				}
			}
			
			@Override
	        public void keyReleased(KeyEvent e) {
	            move.keyReleased(e.getKeyCode());
	        }
		});
		
		// Panel 이 포커스를 받을 수 있도록 (key event 처리를 위해)
		setFocusable(true);
		requestFocusInWindow();
			
		// 보스 초기 위치 지정
		boss = new Boss(250,100);
		boss.setVisible(true);
		
		// Panel 이 10/1000 초 마다 다시 그려지게 하기 위한 타이머 설정
		Timer timer = new Timer(10, (e)->{
			// Move 객체를 통해 player 업데이트
			 int[] newPos = move.updatePosition(player.getX(), player.getY(), getWidth(), getHeight());
	         player.setX(newPos[0]);
	         player.setY(newPos[1]);
			
			// 보스 위치 업데이트
			updateBoss();
			
			// 충돌 쿨타임 감소
			if (playerHitCoolTime> 0) {
		        playerHitCoolTime--;
		    }
			
			// Panel 객체의 repaint() 메소드를 호출 (결과적으로 paintComponent() 메소드가 다시 호출된다)
			repaint();
		});
		timer.start();
		
		Timer bossFireTimer = new Timer(stage == 1 ? 300 : 100, e -> {
		    if (boss.isVisible()) {
		        int missileY = boss.getY() + 100;
		        int centerX = boss.getX() + 45;

		        if (stage == 1) {
		        	int offsetX = (int)(Math.random() * 40) - 20;
		        	bossMissList.add(new Missile(centerX + offsetX, missileY, 0, 7, "boss"));
		        } else if (stage == 2) {
		        	for (int i = 0; i < 1; i++) {
		        	    double angle = Math.toRadians(90 + (Math.random() * 60 - 30)); // 60~120도
		        	    double speed = 3 + Math.random() * 3; // 속도 3~6

		        	    double vx = Math.cos(angle) * speed;
		        	    double vy = Math.sin(angle) * speed;

		        	    bossMissList.add(new Missile(centerX, missileY, vx, vy, "boss"));
		        	}
		        } else if (stage == 3) {
		            for (int i = 0; i < 3; i++) {
		                // 약간의 랜덤 오차
		                int targetX = player.getX() + 50 + (int)(Math.random() * 40 - 20);
		                int targetY = player.getY() + 50 + (int)(Math.random() * 40 - 20);

		                double dx = targetX - centerX;
		                double dy = targetY - missileY;

		                double angle = Math.atan2(dy, dx);
		                double speed = 4 + Math.random() * 2;

		                double vx = Math.cos(angle) * speed;
		                double vy = Math.sin(angle) * speed;

		                bossMissList.add(new Missile(centerX, missileY, vx, vy, "boss"));
		            }
		        }
		    }
		});
		bossFireTimer.start();
		
		// 시작화면 메시지 표시 추가 
		stageMessage = "스테이지 1 시작!";
		stageMessageTimer = 200;
	}
	
	private int bossTargetY = 100;
	private int bossYUpdateCoolTime = 0;
	private double bossSpeedX = 5;
	private double bossWaveAngle;
	private int bossDirection = 1; // 1: 오른쪽, -1: 왼쪽
	private int bossChangeDirCoolTime;
	private final java.util.Random rand = new java.util.Random();

	private void updateBoss() {
	    if (!boss.isVisible()) return;

	    // 이동 방향 쿨타임 감소
	    if (bossChangeDirCoolTime > 0) {
	        bossChangeDirCoolTime--;
	    }
	    
	    // 일정 확률로 방향 바꾸기 (쿨타임이 0일 때만)
	    double changeDirChance = (stage == 2) ? 0.05 : 0.02; // 스테이지 2는 5% 확률
	    if (bossChangeDirCoolTime == 0 && rand.nextDouble() < changeDirChance) {
	        bossDirection *= -1; // 방향 바꾸기
	        bossChangeDirCoolTime = 100; // 쿨타임 설정
	    }

	    // 보스 X 위치 업데이트
	    int newX = boss.getX() + (int)(bossSpeedX * bossDirection);
	    int maxX = getWidth() - 100;

	    // 경계에서 튕기기
	    if (newX <= 0) {
	        newX = 0;
	        bossDirection = 1;
	        bossChangeDirCoolTime= 100;
	    } else if (newX >= maxX) {
	        newX = maxX;
	        bossDirection = -1;
	        bossChangeDirCoolTime= 100;
	    }

	    boss.setX(newX);

	    // 속도는 조금씩 자연스럽게 변화
	    double speedVariance = (stage == 2) ? 1.0 : 0.5;
	    double minSpeed = (stage == 2) ? 5 : 3;
	    double maxSpeed = (stage == 2) ? 10 : 8;

	    bossSpeedX += (rand.nextDouble() - 0.5) * speedVariance;
	    bossSpeedX = Math.max(minSpeed, Math.min(maxSpeed, bossSpeedX));

	 // 일정 주기로 새로운 목표 Y 좌표를 설정
	    if (bossYUpdateCoolTime <= 0) {
	        bossTargetY = 80 + rand.nextInt(120); // 80~200 사이 목표 Y
	        bossYUpdateCoolTime = 50 + rand.nextInt(50); // 다음 갱신까지 0.5~1초 정도
	    } else {
	        bossYUpdateCoolTime--;
	    }

	    // 현재 Y 위치를 목표 방향으로 조금씩 이동
	    int currentY = boss.getY();
	    int deltaY = bossTargetY - currentY;

	    // 이동량 제한해서 부드럽게 이동
	    if (Math.abs(deltaY) > 5) {
	        deltaY = (deltaY > 0) ? 5 : -5;
	    }
	    boss.setY(currentY + deltaY);
	}
	
	// Panel 에 무언가를 그릴때 호출되는 메소드 
	// Panel 이 초기화 될 때 한번 호출되고 그다음에는 repaint() 라는 메소드가 호출될 때 마다 다시 호출된다.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// 배경 그리기
		if (stage == 1) {
	        g.drawImage(backImage1, 0, back1Y, 500, 800, this);
	        g.drawImage(backImage1, 0, back2Y, 500, 800, this);
	    } else if (stage == 2) {
	        g.drawImage(backImage2, 0, back1Y, 500, 800, this);
	        g.drawImage(backImage2, 0, back2Y, 500, 800, this);
	    } else if (stage == 3) {
	        g.drawImage(backImage3, 0, back1Y, 500, 800, this);
	        g.drawImage(backImage3, 0, back2Y, 500, 800, this);
	    }
		
		// 반복문 돌면서 미사일 이미지 모두 그리기
		for(int i=0; i<playMissList.size(); i++) {
			// i 번째 미사일 객체
			Missile m = playMissList.get(i);
			g.drawImage(playMissImage, m.getX()-10, m.getY()-15, 20, 30, this);		
		}
		
		// 플레이어 그리기
        g.drawImage(player.getImage(), player.getX() - 50, player.getY() - 50, 100, 100, this);
		
		// 보스가 보이는 상태면 그리기
     // 보스가 보이는 상태면 그리기
        if (boss.isVisible()) {
            Image currentBossImage;
            if (stage == 1) {
                currentBossImage = bossImage1;
            } else if (stage == 2) {
                currentBossImage = bossImage2;
            } else {
                currentBossImage = bossImage3; // 스테이지 3 보스 이미지
            }
            g.drawImage(currentBossImage, boss.getX(), boss.getY(), 100, 100, this);
        }

		
		// 모든 미사일의 y 좌표를 감소시켜서 미사일이 위로 이동하도록 한다
		for (Missile tmp : playMissList) {
			// 현재 y 좌표에서 10 감소 시킨 값을 얻어내기
			int resultY = tmp.getY()-10;
			// 해당 객체에 다시 넣어준다
			tmp.setY(resultY);
			// 만일 위쪽으로 화면을 벗어난 미사일 객체라면
			if(tmp.getY() <= -20) {
				// 제거하도록 표시해 준다
				tmp.setRemove(true); // 초기값은 false 인데 true 로 변함
			}
		}
		
		for (Missile m : bossMissList) {
			m.update(); // 위치 업데이트 (vx, vy 기준)
		    
		    if (m.getY() >= getHeight() || m.getX() < -20 || m.getX() > getWidth() + 20) {
		        m.setRemove(true);
		    }

		    g.drawImage(bossMissImage, m.getX() - 10, m.getY(), 20, 20, this);

		    // 충돌 판정
		    if (playerHitCoolTime == 0) {
		        int px = player.getX();
		        int py = player.getY();
		        int mx = m.getX();
		        int my = m.getY();

		        if (mx > px && mx < px + 100 && my > py && my < py + 100) {
		            player.decreaseHp(1);
		            m.setRemove(true);
		            playerHitCoolTime = 60;

		            if (player.isDead()) {
		                javax.swing.SwingUtilities.invokeLater(() -> {
		                    javax.swing.JOptionPane.showMessageDialog(this, "💀 죽었습니다. 게임 오버!");
		                    System.exit(0);
		                });
		            }
		        }
		    }
		}
		
		// 보스와 충돌 처리
		if(boss.isVisible()) {	
			int px = player.getX();
			int py = player.getY();
			int bx = boss.getX();
			int by = boss.getY();
				
			// 충돌 조건 (간단한 사각형 충돌 판정)
			boolean collided = (px < bx + 100 && px + 100 > bx &&
	                   py < by + 120 && py + 100 > by);

			if (collided && playerHitCoolTime == 0) {
				player.decreaseHp(1);
				playerHitCoolTime = 60;

				if (player.isDead()) {
					javax.swing.SwingUtilities.invokeLater(() -> {
						javax.swing.JOptionPane.showMessageDialog(this, "💀 죽었습니다. 게임 오버!");
						System.exit(0);
			        });
				}
			}
			 
			boolean bossHitThisFrame = false;
			for(Missile m : playMissList) {
				int mx = m.getX();
				int my = m.getY();
			    	
				if (mx >= bx && mx <= bx + 100 && my >= by && my <= by + 100) {
					m.setRemove(true);
					boss.hit();
					bossHitThisFrame = true; // 중복 데미지 방지
				}
			}
			
			// 보스 체력 다 닳았을 때 처리
			// 보스가 죽었을 때 처리 부분
			if (!boss.isVisible()) {
			    if (stage == 1) {
			        stageMessage = "스테이지 2";
			        stageMessageTimer = 400;

			        Timer stageChangeTimer = new Timer(1500, (e) -> {
			            stage = 2;
			            boss = new Boss(250, 100);
			            boss.setHp(35);
			            boss.setVisible(true);
			            player.setHp(15);
			        });
			        stageChangeTimer.setRepeats(false);
			        stageChangeTimer.start();

			    } else if (stage == 2) {
			        stageMessage = "스테이지 3";
			        stageMessageTimer = 400;

			        Timer stageChangeTimer = new Timer(1500, (e) -> {
			            stage = 3;
			            boss = new Boss(250, 100);
			            boss.setHp(50);
			            boss.setVisible(true);
			            player.setHp(20);
			        });
			        stageChangeTimer.setRepeats(false);
			        stageChangeTimer.start();

			    } else {
			        stageMessage = "🎉 게임 클리어!";
			        stageMessageTimer = 200;

			        Timer exitTimer = new Timer(2000, (e) -> System.exit(0));
			        exitTimer.setRepeats(false);
			        exitTimer.start();
			    }
			}
		}
		
		// 스테이지 메시지 표시 (중앙 정렬)
		if (stageMessageTimer > 0 && stageMessage != null) {
		    g.setColor(Color.WHITE);
		    Font msgFont = new Font("Dialog", Font.BOLD, 32);  // 한글 호환 폰트
		    g.setFont(msgFont);
		    
		    // 가운데 정렬 계산
		    FontMetrics fm = g.getFontMetrics(msgFont);
		    int msgWidth = fm.stringWidth(stageMessage);
		    int msgX = (getWidth() - msgWidth) / 2;
		    int msgY = getHeight() / 2;

		    g.drawString(stageMessage, msgX, msgY);
		    stageMessageTimer--;
		}

		// player 미사일의 갯수 표시
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Missile:"+playMissList.size(), 10, 20);
		
		// boss 미사일의 갯수 표시
		g.setColor(Color.MAGENTA);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Missile:"+bossMissList.size(), 10, 40);
		
		// 보스 체력 표시
		if (boss.isVisible()) {
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.drawString("Boss HP: " + boss.getHp(), 10, 60);
		}
		
		// 플레이어 체력 표시
	    g.setColor(Color.CYAN);
	    g.setFont(new Font("Arial", Font.BOLD, 20));
	    g.drawString("Player HP: " + player.getHp(), 10, 80);
		
		// 반복문 돌면서 List 에서 제거할 Missile 객체는 제거한다
		for(int i=playMissList.size()-1; i >= 0; i--) {
			if(playMissList.get(i).isRemove()) {
				playMissList.remove(i);
			}
		}
		
		// 보스 미사일 제거
		for (int i = bossMissList.size() - 1; i >= 0; i--) {
		    if (bossMissList.get(i).isRemove()) {
		    	bossMissList.remove(i);
		    }
		}
				
		// y 좌표를 증가
		back1Y += 2;
		back2Y += 2;
		// 만일 배경1이 아래쪽으로 벗어난다면
		if(back1Y >= 800) {
			// -800 의 좌표로 다시 보낸다
			back1Y = -800;
		}
		// 만일 배경2가 아래쪽으로 벗어난다면
		if(back2Y >= 800) {
			// -800 의 좌표로 다시 보낸다
			back2Y = -800;
		}
	}

}