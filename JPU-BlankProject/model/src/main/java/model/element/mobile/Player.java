package model.element.mobile;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ICharacter;
import contract.ISprite;
import contract.Permeability;

public class Player implements ICharacter {

	private ISprite sprite;
	
	private int xPlayer;
	private int yPlayer;

	private static Image image;
	
	private String imageNameUp = "JoueurMonteArret";
	private String imageNameDown = "JoueurDescendArret";
	private String imageNameRight = "JoueurDroiteArret";
	private String imageNameLeft = "JoueurGaucheArret";
	private String str = null;
	
	public Player(final int x, final int y) {
		this.xPlayer = x;
		this.yPlayer = y;
		this.doNothing();
		/*spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();*/
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
		return this.sprite;
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
		return this.image;
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSprite(ISprite sprite) {
		// TODO Auto-generated method stub
		this.sprite = sprite;
	}

	@Override
	public void setImage(Image image) {
		// TODO Auto-generated method stub
		this.image = image;
	}

	public void loadImage() {
		// TODO Auto-generated method stub
		try {
		this.setImage(ImageIO.read(new File("images/" + this.getImageName() + ".png")));
		} catch(Exception e) {}
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
