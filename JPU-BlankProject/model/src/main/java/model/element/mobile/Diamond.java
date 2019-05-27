package model.element.mobile;

import java.awt.Image;

import contract.IElement;
import contract.IItem;
import contract.ISprite;
import contract.Permeability;

public class Diamond implements IItem {

	private static ISprite sprite;
	private int Score;
	private boolean stateRecup;
	
	public Diamond(int x, int y) {
		
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
	public ISprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSprite(ISprite sprite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPermeability(Permeability permeability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onBlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inTheAir() {
		// TODO Auto-generated method stub
		
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