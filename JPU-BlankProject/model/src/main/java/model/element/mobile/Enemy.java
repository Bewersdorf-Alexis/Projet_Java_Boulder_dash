package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import contract.Permeability;
import model.element.LevelMap;

public class Enemy implements IElement {

	private Permeability permeability = Permeability.BLOCKING;
	private ElementType elementType = ElementType.ENEMY;
	
	private int x;
	private int y;
	
	private ILevelMap levelmap;
	
	private String imageName;
	private static Image image;
	
	public Enemy(final int x, final int y, LevelMap levelMap) {		
		this.x = x;
		this.y = y;
		this.loadImage();
		this.levelmap = levelMap;
	}
	
	public void moveUp() {
		this.setY(this.getY() - 1);

		this.levelmap.setElement(this.getX(), this.getY(), this);

	}
	
	public void moveDown() {
		this.setY(this.getY() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void moveRight() {
		this.setX(this.getX() + 1);
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}
	
	public void doNothing() {
		this.setY(this.getY());
		
		this.levelmap.setElement(this.getX(), this.getY(), this);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y;
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
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/BatDescendArret.png"));
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
		return false;
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

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		
	}
	
}
