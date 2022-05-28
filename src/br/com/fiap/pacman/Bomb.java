package br.com.fiap.pacman;

public class Bomb extends Item {
	public Bomb() {
		this.setX(0);
		this.setY(0);
		this.setVisivel(false);
	}

	public Bomb(int x, int y) {
		super(x, y);
	}
}
