package model.element.motionless;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import contract.ISprite;
import contract.Permeability;
import entity.Level;
import model.element.LevelMap;

public class Block implements IElement {

	private Permeability permeability = Permeability.PENETRABLE;
	private ElementType elementType = ElementType.PLAYER;
	
	private int x;
	private int y;
	
	private Image image;
	private String imageName;
	
	private boolean state = false;
	
	private ILevelMap levelmap;
	
	public Block(final int x, final int y, LevelMap levelMap) {
		this.x = x;
		this.y = y;
		this.loadImage();
	}

	public void isDestroy() {
		this.state = true;
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
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/cobblestone.png"));
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
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.y = y;
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
	public boolean isExist() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

	public ElementType getElementType() {
		return elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}

	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		this.levelmap.removeElement(this.getX(), this.getY());
		
	}

	
}
