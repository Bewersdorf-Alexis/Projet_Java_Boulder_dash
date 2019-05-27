package model.element.mobile;

import contract.IMobile;
import contract.IModel;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

abstract class Mobile extends Element implements IMobile {

	private IModel level;
	
	private int x;
	
	private int y;
	
	
	public Mobile(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);

	}
	
	Mobile(final Sprite sprite, final IModel level, final Permeability permeability) {
	    super(sprite, permeability);
	    this.setLevel(level);
	}


	Mobile(final int x, final int y, final Sprite sprite, final IModel level, final Permeability permeability) {
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


	public IModel getLevel() {
	    return this.level;
	}


	private void setLevel(final IModel level) {
	    this.level = level;
	}

}
