package model.element;

import java.awt.Image;

public class Element {
	
	protected  int x;
	protected  int y;
	private Sprite sprite;
	protected static Permeability permeability;
	
	public Element(final int x, final int y, final Sprite sprite, final Permeability permeability){
		this.setX(x);
		this.setY(y);
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}


	//*****GET & SET X******\\
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//*****GET & SET Y******\\
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}

	//*****GET & SET Sprite******\\
	public Sprite getSprite() {
		return this.sprite;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	//*****GET & SET Permeability******\\
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
