package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public interface ICharacter extends IMobile {

	public boolean isAlive();
	
	public void die();
	
	public void moveUp();
	
	public void moveRight();
	
	public void moveLeft();
	
	public void doNothing();
	
}
