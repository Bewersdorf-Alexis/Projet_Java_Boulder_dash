package model.element;

import java.awt.Image;

public abstract class Element {

	private int x;
	private int y;
	private Sprite sprite;
	protected static Permeability permeability;
	
	public Element (final int x, final int y, final Sprite sprite, final Permeability permeability) {
		this.setX(x);
		this.setY(y);
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Sprite getSprite() {
		return this.sprite;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Image getImage() {
		return this.getSprite().getImage();
	}
	
}
