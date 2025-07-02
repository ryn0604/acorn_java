package myTest;

public class Missile {
	private int x;
	private int y;
	
	private double vx;
	private double vy;
	
	// 제거할 미사일인지 여부
	private boolean isRemove;
	// 기본값은 player
	private String owner = "player";
	
	// default 생성자
	public Missile() {}
	
	public Missile(int x, int y) {
		this(x, y, "player"); // 기본 생성자는 player 미사일
	}
	
	public Missile(int x, int y, String owner) {
        this.x = x;
        this.y = y;
        this.owner = owner;
    }
	
	// 필드에 저장할 값을 생성자로 전달받을 수 있는 생성자
	public Missile(int x, int y, double vx, double vy, String owner) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.owner = owner;
	}
	
	public void update() {
		x += vx;
		y += vy;
	}
	
	// 필드 접근 메소드 setter, getter
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

	public boolean isRemove() {
		return isRemove;
	}

	public void setRemove(boolean isRemove) {
		this.isRemove = isRemove;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}
}
