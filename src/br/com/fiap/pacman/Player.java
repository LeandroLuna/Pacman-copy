package br.com.fiap.pacman;

public class Player extends GameObject {
	private int direction;
	private int life;
	private boolean invencivel;

	public Player() {
		this.setX(0);
		this.setY(0);
		this.invencivel = false;
	}

	public Player(int x, int y, int direction) {
		this.setX(x);
		this.setY(y);
		this.direction = direction;
		this.invencivel = false;
	}

	public boolean podeMover() {
		int x = getX();
		int y = getY();
		int d = getDirection();
		int t = getScreenSize();

		if (x + 10 < t && d == 90) {
			return true;
		}
		if (x - 10 > 0 && d == 270) {
			return true;
		}
		if (y + 10 > 0 && d == 0) {
			return true;
		}
		if (y - 10 < t && d == 180) {
			return true;
		}
		return false;
	}

	public void move() {
		if (podeMover() == true) {

			switch (direction) {
				case 0:
					this.setY(getY() - 10);
					break;
				case 90:
					this.setX(getX() + 10);
					break;
				case 180:
					this.setY(getY() + 10);
					break;
				case 270:
					this.setX(getX() - 10);
					break;
			}
		}
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}
}
