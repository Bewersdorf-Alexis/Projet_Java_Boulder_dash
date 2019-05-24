package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public abstract class Character extends Mobile {

	public Character(final int x, final int y, final Sprite sprite, final Permeability permeability) {
		super(x, y, sprite, permeability);
	}

	public boolean isAlive() {
		return this.state;
	}
	
}
