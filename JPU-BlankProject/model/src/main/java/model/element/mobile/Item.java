package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public abstract class Item extends Mobile {

	public Item(final int x, final int y, final Sprite sprite, final Permeability permeability) {
		super(x, y, sprite, permeability);
	}

	public void onBlock() {
		
	}
	
	public void inTheAir() {
		
	}
	
}
