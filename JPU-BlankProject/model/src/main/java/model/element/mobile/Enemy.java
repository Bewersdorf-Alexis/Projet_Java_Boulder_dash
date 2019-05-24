package model.element.mobile;

import java.io.IOException;

import model.element.Sprite;

public class Enemy extends Character {

	/*En attente d'ajout des images*/
	private static Sprite sprite = new Sprite("images/...");
	private static Sprite spriteLeft;
	private static Sprite spriteRight;
	private static Sprite spriteUp;
	private static Sprite spriteDown;
	
	public Enemy(final int x, final int y) throws IOException {
		super(x, y, sprite, permeability.BLOCKING);
		spriteLeft.loadImage();
		spriteRight.loadImage();
		spriteUp.loadImage();
		spriteDown.loadImage();
	}
	
	public void moveUp() {
		super.moveUp();
		this.setSprite(spriteUp);
	}
	
	public void moveDown() {
		super.moveDown();
		this.setSprite(spriteDown);
	}
	
	public void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteLeft);
	}
	
	public void moveRight() {
		super.moveRight();
		this.setSprite(spriteRight);
	}
	
}
