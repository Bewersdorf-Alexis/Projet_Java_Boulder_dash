package model.element.mobile;

import java.awt.Image;

import contract.IElement;
import contract.IMobile;
import entity.Level;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile implements IMobile {

	private static Sprite sprite;
	private int Score;
	private boolean stateRecup;
	
	public Diamond(final int x, final int y, Level level) {
		super(x, y, sprite, level, Permeability.BLOCKING);
		// TODO Auto-generated constructor stub
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

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.setY(this.getY() + 16);
	}
	
	
}
