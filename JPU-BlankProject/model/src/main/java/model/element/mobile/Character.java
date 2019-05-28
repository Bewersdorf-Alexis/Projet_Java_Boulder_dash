package model.element.mobile;

import contract.ICharacter;
import contract.IModel;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Character extends Mobile implements ICharacter {

	
	//mettre les sprites
	
    /** The Constant CharacterDescendsStop. */
    private static final Sprite CharacterDescendsStop          		= new Sprite("/Sprite_Character/JoueurDescendArret.png");
	
    /** The Constant CharacterDescendsRightFoot. */
    private static final Sprite CharacterDescendsRightFoot          = new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant CharacterDescendsLeftFoot. */
    private static final Sprite CharacterDescendsLeftFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
	
    /** The Constant RightCharacterStop. */
    private static final Sprite RightCharacterStop          		= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant RightCharacterRightFoot. */
    private static final Sprite RightCharacterRightFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant RightCharacterLeftFoot. */
    private static final Sprite RightCharacterLeftFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant LeftCharacterStop. */
    private static final Sprite LeftCharacterStop          			= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant LeftCharacterRightFoot. */
    private static final Sprite LeftCharacterRightFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant LeftCharacterLeftFoot. */
    private static final Sprite LeftCharacterLeftFoot          		= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant CharacterAscendsStop. */
    private static final Sprite CharacterAscendsStop          		= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant CharacterAscendsRightFoot. */
    private static final Sprite CharacterAscendsRightFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
    /** The Constant CharacterAscendsLeftFoot. */
    private static final Sprite CharacterAscendsLeftFoot          	= new Sprite("/Sprite_Character/JoueurDescendArret.png");
    
	
	public Character(int x, int y, Level level) {
		super(x, y, CharacterDescendsStop, level, Permeability.BLOCKING);

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
