package br.com.fiap.pacman;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Ghost extends GameObject {
	private int direction;

	public Ghost() {
		this.setX(0);
		this.setY(0);
		this.setDirection(direction);
	}

	public Ghost(int x, int y, int direction) {
		this.setX(x);
		this.setY(y);
		this.direction = direction;
	}

	public boolean podeMover() {
		if (getDirection() == 0) {
			if (getX() > 0) {
				return true;
			} else {
				setDirection(2);
				return false;
			}
		} else if (getDirection() == 1) {
			if (getY() > 0) {
				return true;
			} else {
				setDirection(3);
				return false;
			}
		} else if (getDirection() == 2) {
			if (getX() < getScreenSize()) {
				return true;
			} else {
				setDirection(0);
				return false;
			}
		} else if (getDirection() == 3) {
			if (getY() < getScreenSize()) {
				return true;
			} else {
				setDirection(1);
				return false;
			}
		} else
			return false;
	}

	public void mover() {
		Timer tempo = new Timer();
		TimerTask mudarDirection = new TimerTask() {
			@Override
			public void run() {
				Random random = new Random();
				setDirection(random.nextInt(4));
			};
		};
		tempo.schedule(mudarDirection, 3000);
		if (podeMover()) {
			if (getDirection() == 0) {
				setX(getX() - 10);
			}
			if (getDirection() == 1) {
				setY(getY() - 10);
			}
			if (getDirection() == 2) {
				setX(getX() + 10);
			}
			if (getDirection() == 3) {
				setY(getY() + 10);
			}
		}
	};

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
