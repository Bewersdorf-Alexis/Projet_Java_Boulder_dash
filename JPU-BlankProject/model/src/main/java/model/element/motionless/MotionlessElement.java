package model.element.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class MotionlessElement extends Element {

	public MotionlessElement(final int x, final int y, final Sprite sprite, final Permeability permeability) {
		super(x, y, sprite, permeability);
	}

	
	
}
