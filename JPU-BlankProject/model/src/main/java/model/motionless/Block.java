package model.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Block extends MotionlessElement {

	//*****VARIABLES*****\\
	//Link of sprite for Block
	@SuppressWarnings("unused")
	private static Sprite sprite = new Sprite("");
	
	//State of Block
	@SuppressWarnings("unused")
	private boolean state = false;
	
	public Block(int x, int y, Sprite sprite, Permeability permeability) {
		super(x, y, sprite, permeability);
	}
	
	//State of block when they are destroy
	public void isDestroy() {
		this.state = true;
	}

}
