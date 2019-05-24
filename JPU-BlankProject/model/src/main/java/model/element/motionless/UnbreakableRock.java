package model.element.motionless;

import java.awt.Image;

import model.element.IElement;
import model.element.Permeability;
import model.element.Sprite;

public class UnbreakableRock implements IElement {

	private int x;
	private int y;
	
	private static Sprite sprite = new Sprite("images/...");
		
	public UnbreakableRock(final int x, final int y) {
		this.x = x;
		this.y = y;
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
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSprite(Sprite sprite) {
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

}
