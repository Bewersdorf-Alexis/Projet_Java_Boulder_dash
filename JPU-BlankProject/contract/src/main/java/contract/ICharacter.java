package contract;

public interface ICharacter extends IMobile {

	public boolean isAlive();
	
	public void die();
	
	public void moveUp();
	
	public void moveRight();
	
	public void moveLeft();
	
	public void doNothing();
	
}
