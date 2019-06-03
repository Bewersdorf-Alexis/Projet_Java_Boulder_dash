package contract;

/**
 * The Interface ILevelMap.
 *
 * @author Group 5
 * 
 */
public interface IElement extends ISprite {


	/**
	 * Get the X of element
	 * 
	 * @return x
	 */
	public int getX();

	/**
	 * Set the X of element
	 * 
	 * @param x
	 */
	public void setX(int x);

	/**
	 * Get the Y of element
	 * 
	 * @return y
	 */
	public int getY();

	/**
	 * Set the Y of element
	 * 
	 * @param y
	 */
	public void setY(int y);
	
	/**
	 * Move element Up
	 */
	public void moveUp();
	
	/**
	 * Move element Right
	 */
	public void moveRight();
	
	/**
	 * Move element Left
	 */
	public void moveLeft();
	
	/**
	 * Move element Down
	 */
	public void moveDown();

	/**
	 * Element do Nothing
	 */
	public void doNothing();

	/**
	 * Get the type of element
	 * 
	 * @return Element Type
	 */
	public ElementType getElementType();
	
	/**
	 * Set the type of element
	 * 
	 * @param elementType
	 */
	public void setElementType(ElementType elementType);
	
	/**
	 * Get the Score
	 * 
	 * @return score
	 */
	public int getScore();
	
	/**
	 * Set the Score 
	 * 
	 * @param score
	 */
	public void setScore(int score);

	/**
	 *Know if elements exist or they alive
	 * 
	 * @return exist
	 */
	boolean isExist();

	/**
	 * Set element if they are destroy, or took
	 * 
	 * @param exist
	 */
	void setExist(boolean exist);
	
	
}
