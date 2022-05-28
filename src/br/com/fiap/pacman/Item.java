package br.com.fiap.pacman;

public class Item extends GameObject {
	private boolean visivel;

	Item() {
		this.setX(0);
		this.setY(0);
		this.visivel = false;
	}

	Item(int x, int y) {
		setX(x);
		setY(y);
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

}
