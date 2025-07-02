package myTest;

public class Boss {
	private int x;
	private int y;
	private boolean isVisible;
	// 보스 체력
	private int hp = 20;
	
	public Boss() {}

	public Boss(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.isVisible = true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void hit() {
		hp--;
		if(hp <= 0) {
			isVisible = false;
		}
	}
}
