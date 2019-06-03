package contract;

/**
 * The Interface IController
 *
 * @author Group 5
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 * @throws InterruptedException 
	 */
	public void orderPerform(ControllerOrder controllerOrder) ;
}
