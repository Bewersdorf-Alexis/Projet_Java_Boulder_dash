package model.element.mobile;

import contract.IMobile;
import entity.Level;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

abstract class Mobile extends Element implements IMobile {

	private Level level;
	
	private int x;
	
	private int y;
	
	
	public Mobile(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);

	}
	
	Mobile(final Sprite sprite, final Level level, final Permeability permeability) {
	    super(sprite, permeability);
	    this.setLevel(level);
	}


	Mobile(final int x, final int y, final Sprite sprite, final Level level, final Permeability permeability) {
	    this(sprite, level, permeability);
	    this.setX(x);
	    this.setY(y);
	}


	@Override
	public void moveUp() {
	    this.setY(this.getY() - 1);

	}


	@Override
	public void moveLeft() {
	    this.setX(this.getX() - 1);
	    //update level
	}


	@Override
	public void moveDown() {
	    this.setY(this.getY() + 1);
	    //update level
	}


	@Override
	public void moveRight() {
	    this.setX(this.getX() + 1);
	    //update level
	}


	@Override
	public void doNothing() {
	    //update level
	}



	@Override
	public int getX() {
	    return this.x;
	}

	@Override
	public void setX(final int x) {
	    this.x = x;
	}


	@Override
	public int getY() {
	    return this.y;
	}

	@Override
	public void setY(final int y) {
	    this.y = y;
	}


	public Level getLevel() {
	    return this.level;
	}


	private void setLevel(final Level level) {
	    this.level = level;
	}

}
