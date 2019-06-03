package contract;

import entity.Level;

/**
 * The Interface IModel.
 *
 * @author Carlu Florian
 */
public interface IModel {

	/**
	 * Gets the level.
	 *
	 * @return the level entity
	 */
	Level getLevel();

	/**
	 * Load the level.
	 *
	 * @param code
	 *          the code
	 */
	void loadLevel(int id);
	
	/**
	 * Gets the levelMap.
	 *
	 * @return the levelMap entity
	 */
	ILevelMap getLevelMap();
	
	/**
	 * Sets the level.
	 *
	 * @param the level entity
	 */
	void setLevelMap(ILevelMap levelMap);
	
	
}
