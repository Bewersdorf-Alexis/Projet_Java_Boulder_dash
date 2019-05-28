package model.element.mobile;

import java.awt.Image;

import contract.IMobile;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Mobile implements IMobile {

	private int x;
	private int y;
	
	private static Sprite sprite = new Sprite("rocher.png");
	
	public Rock(final int x, final int y, Level level) {
		super(x, y, sprite, level, Permeability.BLOCKING);
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

}
