package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class UnbreakableRock extends MotionlessElement {

	private static Sprite sprite = new Sprite("images/...");
	
	
	public UnbreakableRock(final int x, final int y) {
		super(x, y, sprite, permeability.BLOCKING);
	}

}
