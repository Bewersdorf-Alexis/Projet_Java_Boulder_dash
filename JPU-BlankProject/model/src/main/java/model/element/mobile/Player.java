package model.element.mobile;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.ICharacter;
import contract.IElement;
import contract.ILevelMap;
import contract.Permeability;
import entity.Level;
import model.element.LevelMap;

public class Player implements ICharacter {
	
	private int score = 0;
	
	private boolean exist = true;
	
	private Permeability permeability = Permeability.BLOCKING;
	private ElementType elementType = ElementType.PLAYER;
	
	private int xPlayer;
	private int yPlayer;

	private static Image image;
	
	private ILevelMap levelmap;

			
	private String imageNameUp = "JoueurMonteArret";
	private String imageNameDown = "JoueurDescendArret";
	private String imageNameRight = "JoueurDroiteArret";
	private String imageNameLeft = "JoueurGaucheArret";
	private String imageName;
	
	public Player(final int x, final int y, LevelMap levelMap) {
		this.xPlayer = x;
		this.yPlayer = y;
		this.loadImage();
		this.setLevelmap(levelMap);

	}
	
	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setImageName("images/" + imageNameUp + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.imageName));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		this.levelmap.setElement(this.getX(), this.getY(), this);

	}
	
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setImageName("images/" + imageNameDown + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.imageName));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setImageName("images/" + imageNameLeft + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.imageName));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setImageName("images/" + imageNameRight + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.imageName));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void doNothing() {
		this.setY(this.getY());
		this.setImageName("images/" + imageNameDown + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + imageNameDown + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}

	@Override
	public void die() {

		this.levelmap.removeElement(xPlayer, yPlayer);
		
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
		this.image = image;
	}

	@Override
	public void loadImage() {
		// TODO Auto-generated method stub
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + imageNameDown + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return this.imageName;
	}

	@Override
	public void setImageName(String imageName) {
		// TODO Auto-generated method stub
		this.imageName = imageName;
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

	@Override
	public boolean isExist() {
		// TODO Auto-generated method stub
		return this.exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	public ILevelMap getLevelmap() {
		return levelmap;
	}

	public void setLevelmap(ILevelMap levelmap) {
		this.levelmap = levelmap;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public ElementType getElementType() {
		return elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}
	
}
