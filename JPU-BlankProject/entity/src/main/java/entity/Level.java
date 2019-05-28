package entity;

import contract.IElement;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class Level extends Entity implements IElement {

	/** The id. */
	private int				id;
	
	/** The Level. */
	private IElement[][]	level = new IElement[40][22];

	/**
	 * Instantiates a new Level.
	 *
	 * @param id
	 *          the id
	 * initializes the table
	 */
	public Level(final int id) {
		this.setId(id);
	}

	/**
	 * Instantiates a new Level.
	 */
	public Level() {
		this(0);
	}

	/**
	 * Builds the level table
	 * 
	 * @param x
	 * 			the x position in table
	 * 
	 * @param y
	 * 			the y position in table
	 * 
	 * @param map
	 * 			the character of map level
	 * 
	 */
	public void constructLevel(int x, int y, IElement element) {
		
		this.level[x][y] = element;
	}
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public IElement getElement(int x, int y) {
		return this.level[x][y];
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

}
