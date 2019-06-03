package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import model.element.LevelMap;

public class Rock implements IElement {
	
	private int score = 0;
	
	private boolean exist = true;

	private ElementType elementType = ElementType.ROCK;
	
	private int x;
	private int y;

	private ILevelMap levelmap;

	private static Image image;	
	private String imageName = "Rocher";
	
	public Rock(final int x, final int y, LevelMap levelMap) {
		this.setX(x);
		this.setY(y);
		this.setImageName(imageName);
		this.loadImage();
		this.setLevelmap(levelMap);
		/**
	       * constructor to build and place rock
	       *
	       * @param image
	       *         
	       */

	}
	
	@Override
	public int getX() {

		return this.x;
		/**
	       * Get x position of rock
	       *
	       * @param x
	       *         
	       */
	}

	@Override
	public void setX(int x) {

		this.x = x;
		/**
	       * Set x position of rock
	       *
	       * @param x
	       *         
	       */
	}

	@Override
	public int getY() {

		return this.y;
		/**
	       * Get y position of rock
	       *
	       * @param y
	       *         
	       */
	}

	@Override
	public void setY(int y) {

		this.y = y;
		/**
	       * Set y position of rock
	       *
	       * @param y
	       *         
	       */
	}
	
	@Override
	public void moveUp() {
		
		this.setY(this.getY() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()+1);
		/**
	       * Move up the player when up key are pressed
	       *
	       * @param x
	       * @param y 
	       *       
	       */

	}
	
	public void moveDown() {
		this.setY(this.getY() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()-1);
		/**
	       * Move down the player when down key are pressed
	       *
	       * @param x
	       * @param y 
	       *       
	       */
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()+1, getY());
		/**
	       * Move left the player when left key are pressed
	       *
	       * @param x
	       * @param y 
	       *       
	       */
	}
	
	public void moveRight() {
		this.setX(this.getX() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()-1, getY());
		/**
	       * Move right the player when right key are pressed
	       *
	       * @param x
	       * @param y 
	       *       
	       */
	}
	
	public void doNothing() {
		this.setY(this.getY());
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		/**
	       * do nothing the player when player don't
	       *
	       * @param x
	       * @param y 
	       *       
	       */
	}

	@Override
	public Image getImage() {

		return Rock.image;
		/**
	       * Get image of rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public void setImage(Image image) {

		Rock.image = image;
		/**
	       * Set image of rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public void loadImage() {

		Image img = null;
		try {
			img = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + this.getImageName() + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		this.setImage(img);
		/**
	       * Load image of rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public String getImageName() {

		return this.imageName;
		/**
	       * Get image name of rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public void setImageName(String imageName) {

		this.imageName = imageName;
		/**
	       * Set image name of rock
	       *
	       * @param image
	       *         
	       */
	}


	@Override
	public boolean isExist() {

		return this.exist;
		/**
	       * check existing of rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public void setExist(boolean exist) {
		this.exist = exist;
		/**
	       * set exist verification of rock
	       *
	       * @param image
	       *         
	       */
	}


	public ILevelMap getLevelmap() {
		return levelmap;
		/**
	       * Get level
	       *
	       * @param image
	       *         
	       */
	}

	public void setLevelmap(ILevelMap levelmap) {
		this.levelmap = levelmap;
		/**
	       * Set level
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public int getScore() {
		return score;
		/**
	       * Get score of collected rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public void setScore(int score) {
		this.score = score;
		/**
	       * Set score of collected rock
	       *
	       * @param image
	       *         
	       */
	}

	@Override
	public ElementType getElementType() {
		return elementType;
		/**
	       * Get element type of rock
	       *
	       * @param image
	       *         
	       */
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
		/**
	       * Set element type of rock
	       *
	       * @param image
	       *         
	       */
	}
	
}
