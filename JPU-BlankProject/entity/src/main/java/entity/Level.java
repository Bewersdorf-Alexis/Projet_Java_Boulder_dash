package entity;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class Level extends Entity {

	/** The id. */
	private int			id;

	/** The Map */
	private String Map;
	
	/** The Level. */
	private String[][]	level;

	/**
	 * Instantiates a new Level.
	 *
	 * @param id
	 *          the id

	 * @param message
	 *          the message
	 */
	public Level(final int id, final String map) {
		this.setId(id);
		this.setMap(map);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public Level() {
		this(0, "");
	}

	public void constructLevel(int x, int y, String map) {
		

	}
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel(int x, int y) {
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

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public String getMap() {
		return Map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map
	 *          the new map
	 */
	public void setMap(String map) {
		this.Map = map;
	}

}
