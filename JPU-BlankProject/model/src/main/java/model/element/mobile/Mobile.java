package model.element.mobile;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile extends Element {

	private int x;
	private int y;
	protected boolean state;
	
	public Mobile(final int x, final int y, final Sprite sprite, final Permeability permeability) {
		super(x, y, sprite, permeability);
	}
	
	public void moveUp() {
		
	}
	
	public void moveDown() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void moveRight() {
		
	}
	
	public void doNothing() {
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	
	protected void die() {
		
	}
	
}
