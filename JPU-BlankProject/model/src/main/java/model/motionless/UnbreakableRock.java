package model.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class UnbreakableRock extends MotionlessElement{

	//Link of sprite for UnbreakableRock
	private static Sprite sprite = new Sprite("");
	
	//*****CONSTRUCTOR*****\\
	public UnbreakableRock(final int x, final int y) {
		super(x, y, sprite, Permeability.BLOCKING);
		
	}
	

}
