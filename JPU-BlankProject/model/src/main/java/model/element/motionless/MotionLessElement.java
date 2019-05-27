package model.element.motionless;

import contract.IModel;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class MotionLessElement extends Element {

	private IModel level;
	
	private int x;
	
	private int y;
	
	public MotionLessElement(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
	
	
	MotionLessElement(final Sprite sprite, final IModel level, final Permeability permeability) {
		super(sprite, permeability);
		this.setLevel(level);
	}


	MotionLessElement(final int x, final int y, final Sprite sprite, final IModel level, final Permeability permeability) {
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
	}


	public IModel getLevel() {
		return level;
	}


	public void setLevel(IModel level) {
		this.level = level;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
}
