package contract;

import java.awt.Image;

public interface IElement extends ISprite {


	public int getX();

	public void setX(int x);

	public int getY();

	public void setY(int y);

	public ISprite getSprite();

	public void setSprite(ISprite sprite);

	public Permeability getPermeability();

	public void setPermeability(Permeability permeability);
	
	public Image getImage();
	
}
