package model.element.mobile;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.IElement;
import contract.IMobile;
import contract.ISprite;
import contract.Permeability;
import entity.Level;
import model.element.LevelMap;

public class Diamond implements IElement {

	private static ISprite sprite;
	private int Score;
	private boolean stateRecup;
	
	private Image image;
	private String imageName;
	
	private int xDiamond;
	private int yDiamond;
	
	public Diamond(final int x, final int y, LevelMap levelMap) {
		this.xDiamond = x;
		this.yDiamond = y;
		this.loadImage();
		// TODO Auto-generated constructor stub
	}
	
	public void recup(final boolean isDiamondRecup) {
		this.stateRecup = isDiamondRecup;
	}
	
	public void score() {
		if(stateRecup == true)
			this.Score++;
	}
	
	public int getScore() {
		return this.Score;
	}
	
	public void setScore(int score) {
		this.Score = score;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		//this.setY(this.getY() + 16);
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/diamond.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
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
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}
	
	
}
