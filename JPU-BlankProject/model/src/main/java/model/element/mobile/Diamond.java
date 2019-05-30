package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.ILevelMap;
import contract.ISprite;
import contract.Permeability;
import model.element.LevelMap;

public class Diamond implements IElement {

	private Permeability permeability = Permeability.SEMIBLOKING;
	private ElementType elementType = ElementType.DIAMOND;
	
	private static ISprite sprite;
	
	private Image image;
	private String imageName;
	
	private ILevelMap levelmap;
	
	private int xDiamond;
	private int yDiamond;
	
	public Diamond(final int x, final int y, LevelMap levelMap) {
		this.setX(x);
		this.setY(y);
		this.loadImage();
		this.levelmap = levelMap;
		// TODO Auto-generated constructor stub
	}
	



	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.xDiamond;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.xDiamond = x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.yDiamond;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.yDiamond = y;
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
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/diamond.png"));
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
