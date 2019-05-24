package model.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class MotionlessElement extends Element{

	public MotionlessElement(final int x, final int  y, Sprite sprite, Permeability permeability) {
		super(x, y, sprite, Permeability.BLOCKING);
		
	}

}
