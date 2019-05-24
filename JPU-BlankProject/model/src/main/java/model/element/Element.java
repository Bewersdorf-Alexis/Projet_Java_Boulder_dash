package model.element;

import java.awt.Image;

public class Element {
	
	private int x;
	private int y;
	private Sprite sprite;
	private Permeability permeability;
	
	public Element(final Sprite sprite, final Permeability permeability){
	
	}
	
	//*****GET & SET X******\\
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//*****GET & SET Y******\\
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	//*****GET & SET Sprite******\\
	public Sprite getSprite() {
		return sprite;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	//*****GET & SET Permeability******\\
	public Permeability getPermeability() {
		return permeability;
	}

	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public Image getImage() {
		return null;
		
	}
	

}
