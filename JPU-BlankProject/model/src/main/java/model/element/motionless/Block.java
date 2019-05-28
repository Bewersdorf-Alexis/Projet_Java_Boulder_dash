package model.element.motionless;

import contract.IModel;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Block extends MotionLessElement {

	//mettre sprite
	
	public Block(int x, int y, Level level) {
		super(x, y, sprite, level, permeability);

	}

}
