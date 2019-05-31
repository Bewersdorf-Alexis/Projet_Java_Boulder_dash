package model.element.motionless;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import model.element.LevelMap;

public class Exit implements IElement {
	
	private int score = 0;
	
	private boolean exist = true;

	private ElementType elementType = ElementType.EXIT;
	
	private int x;
	private int y;

	private ILevelMap levelmap;

	private static Image image;	
	private String imageName = "trapdoor";
	
	public Exit(final int x, final int y, LevelMap levelMap) {
		this.setX(x);
		this.setY(y);
		this.setImageName(imageName);
		this.loadImage();
		this.setLevelmap(levelMap);

	}
	
	@Override
	public int getX() {

		return this.x;
	}

	@Override
	public void setX(int x) {

		this.x = x;
	}

	@Override
	public int getY() {

		return this.y;
	}

	@Override
	public void setY(int y) {

		this.y = y;
	}
	
	@Override
	public void moveUp() {
		
		this.setY(this.getY() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()+1);

	}
	
	public void moveDown() {
		this.setY(this.getY() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX(), getY()-1);
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()+1, getY());
	}
	
	public void moveRight() {
		this.setX(this.getX() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
		this.levelmap.removeElement(getX()-1, getY());
	}
	
	public void doNothing() {
		this.setY(this.getY());
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}

	@Override
	public Image getImage() {

		return Exit.image;
	}

	@Override
	public void setImage(Image image) {

		Exit.image = image;
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
	}

	@Override
	public String getImageName() {

		return this.imageName;
	}

	@Override
	public void setImageName(String imageName) {

		this.imageName = imageName;
	}


	@Override
	public boolean isExist() {

		return this.exist;
	}

	@Override
	public void setExist(boolean exist) {
		this.exist = exist;
	}


	public ILevelMap getLevelmap() {
		return levelmap;
	}

	public void setLevelmap(ILevelMap levelmap) {
		this.levelmap = levelmap;
	}

	@Override
	public int getScore() {
		return score;
	}

	@Override
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public ElementType getElementType() {
		return elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}
	
}
