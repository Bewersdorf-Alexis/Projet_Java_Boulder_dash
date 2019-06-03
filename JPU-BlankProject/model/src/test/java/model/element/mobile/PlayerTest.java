package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import entity.Level;
import model.element.LevelMap;

public class PlayerTest {
	
	private Player player;
	private LevelMap levelMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Level level = new Level(1);
		levelMap = new LevelMap(level);
		this.player = new Player(1,1, levelMap);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public void testGetX() {
		final int expected = 1;
		assertEquals(expected, this.player.getX());
	
	}

	@Test
	public void testSetX() {
		final int expected = 2;
		this.player.setX(2);
		assertEquals(expected, this.player.getX());
	}

	@Test
	public void testGetY() {
		final int expected = 1;
		assertEquals(expected, this.player.getY());
	}

	@Test
	public void testSetY() {
		final int expected = 2;
		this.player.setY(2);
		assertEquals(expected, this.player.getY());
	}

	@Test
	public void testIsExist() {
		final boolean expected = true;
		assertEquals(expected, this.player.isExist());
	}

	@Test
	public void testSetExist() {
		final boolean expected = true;
		this.player.setExist(true);
		assertEquals(expected, this.player.isExist());
	}

	@Test
	public void testGetScore() {
		final int expected = 0;
		assertEquals(expected, this.player.getScore());
	}

	@Test
	public void testSetScore() {
		final int expected = 1;
		this.player.setScore(1);
		assertEquals(expected, this.player.getScore());
	}

	@Test
	public void testGetElementType() {
		final ElementType expected = ElementType.PLAYER;
		assertEquals(expected, this.player.getElementType());
	}

	@Test
	public void testSetElementType() {
		final ElementType expected = ElementType.PLAYER;
		this.player.setElementType(ElementType.PLAYER);
		assertEquals(expected, this.player.getElementType());
	}

}
