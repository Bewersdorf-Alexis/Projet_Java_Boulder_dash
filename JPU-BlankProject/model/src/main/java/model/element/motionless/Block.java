package model.element.motionless;

import java.awt.Image;

import contract.IElement;
import entity.Level;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public class Block extends MotionlessElement implements IElement {

	private int x;
	private int y;
	
	private static Sprite sprite;
	private boolean state = false;
	
	public Block(final int x, final int y, Level level) {
		super(x, y, sprite, level, Permeability.PENETRABLE);
	}

	public void isDestroy() {
		this.state = true;
	}

	
}
