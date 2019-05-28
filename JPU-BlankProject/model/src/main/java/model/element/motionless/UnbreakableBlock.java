package model.element.motionless;

import java.awt.Image;

import contract.IElement;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class UnbreakableBlock extends MotionlessElement implements IElement {

	private int x;
	private int y;
	
	private static Sprite sprite;
		
	public UnbreakableBlock(final int x, final int y, Level level) {
		super(x, y, sprite, level, Permeability.BLOCKING);
	}

}
