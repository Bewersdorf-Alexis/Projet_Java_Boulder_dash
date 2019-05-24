package entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LevelTest {

	private Level level;
	
	
	@Before
	public void setUp() throws Exception {
		this.level = new Level();
		this.level = new Level(1, "azerty");
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void constructLevel() {
		
		String expected = "azerty";
		
		for(int x=0; x<expected.length(); x++) {
			for(int y=0; y<expected.length(); y++) {
				
				
				this.level.constructLevel(x, y, expected.substring(x, x+1));
			}
		}
	}
	
	@Test
	public void getLevel() {
		
		fail("Not yet implemented");
	}
	
	@Test
	public void getId() {
		
		final int expected = 1;
		assertEquals(expected, level.getId());
	}

	@Test
	public void setId() {
		
		final int expected = 2;
		this.level.setId(expected);
		assertEquals(expected, level.getId());
	}

	@Test
	public void getMap() {
		
		final String expected = "azerty";
		assertEquals(expected, level.getMap());
	}

	@Test
	public void setMap() {
		
		final String expected = "azertyu";
		this.level.setMap(expected);
		assertEquals(expected, level.getMap());
	}
}
