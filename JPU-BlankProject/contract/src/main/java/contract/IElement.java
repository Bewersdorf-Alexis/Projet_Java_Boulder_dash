package contract;

import java.awt.Image;

public interface IElement extends ISprite {


	public int getX();

	public void setX(int x);

	public int getY();

	public void setY(int y);
	
	public void moveUp();
	
	public void moveRight();
	
	public void moveLeft();
	
	public void moveDown();

	public void doNothing();

	public ElementType getElementType();
	
	public int getScore();
	
	public void setScore(int score);

	boolean isExist();

	void setExist(boolean exist);
	
	
}
