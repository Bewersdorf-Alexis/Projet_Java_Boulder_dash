package model.element;

import java.awt.Image;

public interface IElement {


	public int getX();

	public void setX(int x);

	public int getY();

	public void setY(int y);

	public Sprite getSprite();

	public void setSprite(Sprite sprite);

	public Permeability getPermeability();

	public void setPermeability(Permeability permeability);
	
	public Image getImage();
	
}
