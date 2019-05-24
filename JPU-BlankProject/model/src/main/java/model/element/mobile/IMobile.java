package model.element.mobile;

import model.element.IElement;
import model.element.Permeability;
import model.element.Sprite;

public interface IMobile extends IElement {
	
	
	public void moveDown();
	
	public int getX();
	
	public void setX(int x);

	public int getY();

	public void setY(int y);	
	
}
