package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import model.element.Permeability;
import model.element.Sprite;

public class Enemy implements ICharacter {

	private int x;
	private int y;
	
	/*En attente d'ajout des images*/
	private static Sprite sprite = new Sprite("images/...");
	private static Sprite spriteLeft;
	private static Sprite spriteRight;
	private static Sprite spriteUp;
	private static Sprite spriteDown;
	
	public Enemy(final int x, final int y) throws IOException {
		this.x = x;
		this.y = y;
		spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();
	}
	
	public void moveUp() {
		this.setSprite(spriteUp);
	}
	
	public void moveDown() {
		this.setSprite(spriteDown);
	}
	
	public void moveLeft() {
		this.setSprite(spriteLeft);
	}
	
	public void moveRight() {
		this.setSprite(spriteRight);
	}

	@Override
	public void doNothing() {
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
	public void die() {
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

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
