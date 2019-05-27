package model.element.motionless;

import java.awt.Image;

import contract.IElement;
import contract.ISprite;
import contract.Permeability;

public class Block implements IElement {

	private int x;
	private int y;
	
	private static ISprite sprite;
	private boolean state = false;
	
	public Block(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public void isDestroy() {
		this.state = true;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
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
		return null;
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
		return null;
	}

	@Override
	public void setImageName(String imageName) {
		// TODO Auto-generated method stub
		
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
	public ISprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSprite(ISprite sprite) {
		// TODO Auto-generated method stub
		
	}
	
	
}