package entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
* The Class Level.
*
* @author Group 5
*/
public class LevelTest {

	/** The level. */
	private Level level;
	
	@Before
	public void setUp() throws Exception {
		
		this.level = new Level(1);
	}
	
	/**
	 * Test the getId method.
	 */
	@Test
	public void testgetId() {

		final int expected = 1;
		assertEquals(expected, this.level.getId());
	}
	
	/**
	 * Test the setId method.
	 */
	@Test
	public void testsetId() {
		
		final int expected = 2;
		this.level.setId(expected);
		assertEquals(expected, this.level.getId());
	}

}
