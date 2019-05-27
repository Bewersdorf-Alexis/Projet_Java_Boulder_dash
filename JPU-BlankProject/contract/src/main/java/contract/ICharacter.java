package contract;

public interface ICharacter extends IMobile{

	
	   /**
	   * Move up.
	   */
@Override
	void moveUp();

	/**
	 * Move left.
	 */
@Override
	void moveLeft();

 /**
  * Move down.
  */
@Override
 	void moveDown();

 /**
  * Move right.
  */
@Override
 	void moveRight();

 /**
  * Do nothing.
  */
@Override
 	void doNothing();

 /**
  * Gets the x.
  *
  * @return the x
  */

@Override
 	int getX();

 /**
  * Gets the y.
  *
  * @return the y
  */

@Override
 	int getY();

/**
 * Gets the state.
 *
 * @return the state isAlive
 */
	boolean isAlive();
	
	void die();
	
	
}
