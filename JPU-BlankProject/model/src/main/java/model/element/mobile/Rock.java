package model.element.mobile;

import contract.IItem;
import contract.IModel;
import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Mobile implements IItem {

	//mettre les sprites
	
	Rock(int x, int y, IModel level) {
		super(x, y, sprite, level, permeability);

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
