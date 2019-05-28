package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ICharacter;
import contract.ISprite;
import contract.Permeability;
import entity.Level;

public class Enemy implements ICharacter {

	private int x;
	private int y;
	
	/*En attente d'ajout des images*/
	private static ISprite sprite;
	private static ISprite spriteLeft;
	private static ISprite spriteRight;
	private static ISprite spriteUp;
	private static ISprite spriteDown;
	
	private String str = null;
	private static Image image;
	
	public Enemy(final int x, final int y, Level level) {
		
		/*spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();*/
	}
	
	public void moveUp() {
		this.setY(this.getY() - 16);
		this.setImageName("images/BatMonteArret.png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveDown() {
		//Voir Player
	}
	
	public void moveLeft() {
		
	}
	
	public void moveRight() {
		
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
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
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
		return this.str;
	}

	@Override
	public void setImageName(String imageName) {
		// TODO Auto-generated method stub
		this.str = imageName;
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
