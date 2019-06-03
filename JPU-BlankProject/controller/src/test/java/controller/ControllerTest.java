package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IModel;
import contract.IView;

/**
 * The testClass Controller.
 * 
 * @author Group 5
 */
public class ControllerTest {

	/** The controller. */
	private Controller controller;
	
	/**
	 * Instantiates a new controller.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		IView view = null;
		IModel model = null;
		this.controller = new Controller(view, model);
	}

	/**
	 * Test the getStackOrder method. 
	 */
	@Test
	public void testgetStackOrder() {
		
		final ControllerOrder expected = ControllerOrder.Up;
		this.controller.setStackOrder(ControllerOrder.Up);
		assertEquals(expected, this.controller.getStackOrder());
	}

	/**
	 * Test the setStackOrder method. 
	 */
	@Test
	public void testsetStackOrder() {
		
		final ControllerOrder expected = ControllerOrder.Down;
		this.controller.setStackOrder(ControllerOrder.Down);
		assertEquals(expected, this.controller.getStackOrder());
	}

}
