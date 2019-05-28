package entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LevelTest {

	private Level level;
	
	
	@Before
	public void setUp() throws Exception {
		this.level = new Level();
		this.level = new Level(1);
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void TestconstructLevel() {
		
		final String expected = "a";
		//this.level.constructLevel(0, 0, expected);
		assertEquals(expected, level.getLevel(0, 0));
	}
	
	@Test
	public void TestgetLevel() {
		
		final String expected = "a";
		assertEquals(expected, this.level.getLevel(0, 0));
	}
	
	@Test
	public void TestgetId() {
		
		final int expected = 1;
		assertEquals(expected, this.level.getId());
	}

	@Test
	public void TestsetId() {
		
		final int expected = 2;
		this.level.setId(expected);
		assertEquals(expected, level.getId());
	}
}
