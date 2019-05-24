package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Item {

	private static Sprite sprite;
	private int Score;
	private boolean stateRecup;
	
	public Diamond(int x, int y) {
		super(x, y, sprite, permeability);
	}
	
	public void recup(final boolean isDiamondRecup) {
		this.stateRecup = isDiamondRecup;
	}
	
	public void score() {
		if(stateRecup == true)
			this.Score++;
	}
	
	public int getScore() {
		return this.Score;
	}
	
	public void setScore(int score) {
		this.Score = score;
	}
	
	
}
