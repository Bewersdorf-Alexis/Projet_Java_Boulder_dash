package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ICharacter;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile implements ICharacter {

	private int x;
	private int y;
	
	/*En attente d'ajout des images*/
	private static Sprite sprite = new Sprite("BatDescendArret.png");
	private static Sprite spriteLeft;
	private static Sprite spriteRight;
	private static Sprite spriteUp;
	private static Sprite spriteDown;
	
	private String str = null;
	private static Image image;
	
	public Enemy(final int x, final int y, Level level) {
		super(x, y, sprite, level, Permeability.BLOCKING);
		/*spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();*/
	}
	
	public void moveUp() {
		this.setY(this.getY() - 16);
		this.getSprite().setImageName("images/BatMonteArret.png");
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

	

	
	
}
