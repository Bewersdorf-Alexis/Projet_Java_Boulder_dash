package model.element.mobile;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ICharacter;
import contract.Permeability;
import entity.Level;

public class Player implements ICharacter {
	
	private int xPlayer;
	private int yPlayer;

	private static Image image;
	
	private String imageNameUp = "JoueurMonteArret";
	private String imageNameDown = "JoueurDescendArret";
	private String imageNameRight = "JoueurDroiteArret";
	private String imageNameLeft = "JoueurGaucheArret";
	private String str = null;
	
	public Player(final int x, final int y, Level level) {
		this.xPlayer = x;
		this.yPlayer = y;
		this.doNothing();
		//loadImage
	}
	
	public void moveUp() {
		this.setY(this.getY() - 16);
		this.setImageName("images/" + imageNameUp + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveDown() {
		this.setY(this.getY() + 16);
		this.setImageName("images/" + imageNameDown + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 16);
		this.setImageName("images/" + imageNameLeft + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveRight() {
		this.setX(this.getX() + 16);
		this.setImageName("images/" + imageNameRight + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doNothing() {
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + imageNameDown + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
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
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
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
