package model.element.motionless;

import contract.IModel;
import model.element.Permeability;
import model.element.Sprite;

public class UnbreackableRock extends MotionLessElement {

	//mettre les sprites
	
	UnbreackableRock(int x, int y, Sprite sprite, IModel level, Permeability permeability) {
		super(x, y, sprite, level, permeability);

	}

}
