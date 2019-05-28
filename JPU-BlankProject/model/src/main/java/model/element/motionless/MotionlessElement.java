package model.element.motionless;

import entity.Level;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class MotionlessElement extends Element {

	private Level level;
	
	private int x;
	private int y;
	
	
	public MotionlessElement(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}
	
	public MotionlessElement(Sprite sprite, final Level level, Permeability permeability) {
		super(sprite, permeability);
		this.setLevel(level);
		// TODO Auto-generated constructor stub
	}
	
	public MotionlessElement(final int x, final int y, Sprite sprite, final Level level, Permeability permeability) {
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
		// TODO Auto-generated constructor stub
	}

	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
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

	
	
}
