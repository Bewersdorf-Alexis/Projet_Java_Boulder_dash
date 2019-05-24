package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Block extends MotionlessElement {

	private static Sprite sprite = new Sprite("images/...");
	private boolean state = false;
	
	public Block(final int x, final int y) {
		super(x, y, sprite, permeability);
	}

	public void isDestroy() {
		this.state = true;
	}
	
	
}
