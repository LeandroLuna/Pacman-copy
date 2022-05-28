package br.com.fiap.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class Booster extends Item {
	private int turnos;

	public Booster() {
		this.setX(0);
		this.setY(0);
		this.turnos = 0;
		this.setVisivel(false);
	}

	public Booster(int x, int y, int turnos) {
		super(x, y);
		this.turnos = turnos;
	}

	public void godMode(Player player) {
		Timer rounds = new Timer();

		player.setInvencivel(true);
		System.out.println("Entering god mode.");
		TimerTask timed = new TimerTask() {
			@Override
			public void run() {
				player.setInvencivel(false);
				System.out.println("No longer invincible.");
			}
		};
		rounds.schedule(timed, turnos);
	}
}
