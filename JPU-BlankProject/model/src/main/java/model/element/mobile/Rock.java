package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Item {

	private static Sprite sprite;
	
	public Rock(int x, int y) {
		super(x, y, sprite, permeability.BLOCKING);
	}

}
