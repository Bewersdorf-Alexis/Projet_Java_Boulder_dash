package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import contract.ICharacter;
import contract.ISprite;
import contract.Permeability;

public class Enemy implements ICharacter {

	private int x;
	private int y;
	
	/*En attente d'ajout des images*/
	private static ISprite sprite;
	private static ISprite spriteLeft;
	private static ISprite spriteRight;
	private static ISprite spriteUp;
	private static ISprite spriteDown;
	
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
	public ISprite getSprite() {
		// TODO Auto-generated method stub
		return null;
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