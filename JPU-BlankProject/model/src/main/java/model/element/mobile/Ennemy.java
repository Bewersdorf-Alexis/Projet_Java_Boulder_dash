package model.element.mobile;

import contract.ICharacter;
import contract.IModel;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Ennemy extends Mobile implements ICharacter {

	//mettre les sprites
	
	public Ennemy(int x, int y, Level level) {
		super(x, y, sprite, level, permeability);

	}

	@Override
	public boolean isAlive() {
		
		return false;
	}

	@Override
	public void die() {
		
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

}
