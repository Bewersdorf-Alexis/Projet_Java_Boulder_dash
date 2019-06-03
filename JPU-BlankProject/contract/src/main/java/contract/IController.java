package contract;

/**
 * The Interface IController.
 *
 * @author Carlu Florian
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
