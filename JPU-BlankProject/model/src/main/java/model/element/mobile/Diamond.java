package model.element.mobile;

import java.awt.Image;

import contract.IElement;
import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import entity.Level;

public class Diamond implements IMobile {

	private static ISprite sprite;
	private int Score;
	private boolean stateRecup;
	
	public Diamond(final int x, final int y, Level level) {
		
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

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setImageName(String imageName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isImageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setImageLoaded(boolean isImageLoaded) {
		// TODO Auto-generated method stub
		
	}
	
	
}
