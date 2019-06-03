package model.element.motionless;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import model.element.LevelMap;

public class Block implements IElement {
	
	private int score = 0;
	
	private boolean exist = true;

	private ElementType elementType = ElementType.BLOCK;
	
	private int x;
	private int y;

	private ILevelMap levelmap;

	private static Image image;	
	private String imageName = "cobblestone";
	
	/**
     * constructor to build and place Block
     *
     * @param x
     * @param y
     * @param LevelMap
     *         
     */
	public Block(final int x, final int y, LevelMap levelMap) {
		this.setX(x);
		this.setY(y);
		this.setImageName(imageName);
		this.loadImage();
		this.setLevelmap(levelMap);

	}
	
	/**
     * Get x position of Block
     *
     * @return x
     * 
     * @See contract.IElement#getX
     */
	@Override
	public int getX() {

		return this.x;
	}

	/**
     * Set x position of Block
     *
     * @param x
     *  
     *  @See contract.IElement#setX
     */
	@Override
	public void setX(int x) {

		this.x = x;
	}

	/**
     * Get y position of Block
     *
     * @return y
     * 
     *  @See contract.IElement#getY
     */
	@Override
	public int getY() {

		return this.y;
	}

	/**
     * Set y position of Block
     *
     * @param y
     * 
     *  @See contract.IElement#setY
     */
	@Override
	public void setY(int y) {

		this.y = y;
	}
	
	/**
     * Move up the player when up key are pressed
     *     
     *  @See contract.IElement#moveUp
     */
	@Override
	public void moveUp() {
		
		this.setY(this.getY() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()+1);

	}
	
	/**
     * Move down the player when down key are pressed
     *
     *  @See contract.IElement#moveDown   
     */
	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()-1);
	}
	
	/**
     * Move left the player when left key are pressed
     * 
     *  @See contract.IElement#moveLeft
     */
	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()+1, getY());
	}
	
	/**
     * Move right the player when right key are pressed
     * 
     *  @See contract.IElement#moveRight
     */
	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()-1, getY());
	}
	
	/**
     * do nothing the player when player don't move
     * 
     *  @See contract.IElement#doNothing     
     */
	@Override
	public void doNothing() {
		this.setY(this.getY());
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}

	/**
     * Get image of Block
     *
     * @return image
     * 
     *  @See contract.IElement#getImage        
     */
	@Override
	public Image getImage() {

		return Block.image;
	}

	/**
     * Set image of Block
     *
     * @param image
     *  
     *  @See contract.IElement#setImage        
     */
	@Override
	public void setImage(Image image) {

		Block.image = image;
	}

	/**
     * Load image of Block
     * 
     *  @See contract.IElement#loadImage        
     */
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
	}

	/**
     * Set image name of Block
     *
     * @param imageName
     * 
     *  @See contract.IElement#setImageName        
     */
	@Override
	public String getImageName() {

		return this.imageName;
	}

	/**
     * check existing of Block
     *
     * @return exist
     * 
     *  @See contract.IElement#isExist
     */
	@Override
	public void setImageName(String imageName) {

		this.imageName = imageName;
	}

	/**
     * set exist verification of Block
     *
     * @param exist
     * 
     *  @See contract.IElement#setExist
     */
	@Override
	public boolean isExist() {

		return this.exist;
	}

	/**
     * set exist verification of Block
     *
     * @param exist
     * 
     *  @See contract.IElement#setExist
     */
	@Override
	public void setExist(boolean exist) {
		this.exist = exist;
	}

	/**
     * Get level
     *
     * @return level map
     * 
     *  @See contract.IElement#getLevelmap
     */
	public ILevelMap getLevelmap() {
		return levelmap;
	}

	/**
     * Set level
     *
     * @param levelMap
     * 
     *  @See contract.IElement#setLevelmap        
     */
	public void setLevelmap(ILevelMap levelmap) {
		this.levelmap = levelmap;
	}

	/**
     * Get score of collected diamond
     *
     * @return score
     * 
     * @See contract.IElement#getScore
     */
	@Override
	public int getScore() {
		return score;
	}

	/**
     * Set score of collected diamond
     *
     * @param score
     * 
     *  @See contract.IElement#setScore        
     */
	@Override
	public void setScore(int score) {
		this.score = score;
	}

	/**
     * Get element type of Block
     *
     * @return element type
     * 
     *  @See contract.IElement#getElementType       
     */
	@Override
	public ElementType getElementType() {
		return elementType;
	}

	/**
     * Set element type of diamond
     *
     * @param elementType
     * 
     *  @See contract.IElement#setElementType        
     */
	@Override
	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}
	
}
