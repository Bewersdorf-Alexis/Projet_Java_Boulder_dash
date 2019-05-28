package model.element.mobile;

import contract.IItem;
import contract.IModel;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile implements IItem {

	//mettre les sprites
	
	public Diamond(int x, int y, Level level) {
		super(x, y, sprite, level, permeability);

	}

	@Override
	public final void moveUp() {
		super.moveUp();
        //this.setSprite();		
	}
	
	@Override
	public final void moveDown() {
		super.moveDown();
        //this.setSprite();
	}
	
    @Override
    public final void moveLeft() {
        super.moveLeft();
        //this.setSprite();
    }

    @Override
    public final void moveRight() {
        super.moveRight();
        //this.setSprite();
    }


    @Override
    public final void doNothing() {
        super.doNothing();
        //this.setSprite();
    }

	@Override
	public void onBlock() {
		
	}

	@Override
	public void inTheAir() {
		
	}
	
}
