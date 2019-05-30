package contract;

public interface IElement extends ISprite {


	public int getX();

	public void setX(int x);

	public int getY();

	public void setY(int y);
	
	public boolean isExist();
	
	public void moveUp();
	
	public void moveRight();
	
	public void moveLeft();
	
	public void moveDown();

	public void doNothing();

	public Permeability getPermeability();

	public ElementType getElementType();

	void destroy();
	
	public int getScore();
	
	public void setScore(int score);
	
	
}
