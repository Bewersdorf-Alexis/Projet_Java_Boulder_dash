package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import contract.ICharacter;
import contract.ISprite;
import contract.Permeability;

public class Player implements ICharacter {

	private int xPlayer;
	private int yPlayer;
	
	private static ISprite sprite;
	private static ISprite spriteLeft;
	private static ISprite spriteRight;
	private static ISprite spriteUp;
	private static ISprite spriteDown;
	
	public Player(final int x, final int y) {
		this.xPlayer = x;
		this.yPlayer = y;
		/*spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();*/
	}
	
	public void moveUp() {
		this.setY(this.getY() - 16);
		this.setSprite(spriteUp);
		//System.out.println("Je monte");
	}
	
	public void moveDown() {
		this.setY(this.getY() + 16);
		this.setSprite(spriteDown);
		//System.out.println("Je descends");
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 16);
		this.setSprite(spriteLeft);
		//System.out.println("Je vais à gauche");
	}
	
	public void moveRight() {
		this.setX(this.getX() + 16);
		this.setSprite(spriteRight);
		//System.out.println("Je vais à droite");
	}
	
	public void doNothing() {
		this.setSprite(sprite);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.xPlayer;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.xPlayer = x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.yPlayer;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.yPlayer = y;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISprite getSprite() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void setSprite(ISprite sprite) {
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
