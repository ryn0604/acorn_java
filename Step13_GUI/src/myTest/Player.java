package myTest;

import java.awt.Image;

public class Player {
    private int x, y;
    private int hp;
    private Image image;

    public Player(int x, int y, int hp, Image image) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.image = image;
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

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void decreaseHp(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
    }

    public boolean isDead() {
        return hp <= 0;
    }
}

