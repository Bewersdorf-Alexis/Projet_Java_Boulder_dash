package model.element.mobile;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ICharacter;
import entity.Level;
import model.element.Permeability;
import model.element.Sprite;

public class Player extends Mobile implements ICharacter {

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
	
	private int xPlayer;
	private int yPlayer;

	private static Image image;
	
	private String imageNameUp = "JoueurMonteArret";
	private String imageNameDown = "JoueurDescendArret";
	private String imageNameRight = "JoueurDroiteArret";
	private String imageNameLeft = "JoueurGaucheArret";
	private String str = null;
	
	public Player(final int x, final int y, Level level) {
		super(x, y, CharacterDescendsStop, level, Permeability.BLOCKING);
		//loadImage
	}
	
	public void moveUp() {
		this.setY(this.getY() - 16);
		this.getSprite().setImageName("images/" + imageNameUp + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveDown() {
		this.setY(this.getY() + 16);
		this.getSprite().setImageName("images/" + imageNameDown + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveLeft() {
		this.setX(this.getX() - 16);
		this.getSprite().setImageName("images/" + imageNameLeft + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void moveRight() {
		this.setX(this.getX() + 16);
		this.getSprite().setImageName("images/" + imageNameRight + ".png");
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.str));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doNothing() {
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/" + imageNameDown + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
