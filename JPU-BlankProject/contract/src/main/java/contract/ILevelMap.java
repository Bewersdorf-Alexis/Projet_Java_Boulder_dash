package contract;

import java.util.Observable;

/**
 * The Interface ILevelMap.
 *
 * @author Group 5
 */
public interface ILevelMap {

       /**
        * Get the elements with coordinates
        * 
        * @param x
        * 		The x.
        * @param y
        * 		The y.
        * @return level array
        */
       public IElement getElement(int x, int y);
       
       /**
        * Set the elements with coordinates, and set the change and notify observer
        * 
        * @param x
        * 		The x.
        * @param y
        * 		The y.
        * @param element
        * 		The element.
        */
       public void setElement(int x, int y, IElement element);

       /**
        * Get the player
        * 
        * @return player element
        */
       public IElement getPlayer();

       /**
        * Remove element when player go on
        * 
        * @param x
        * 		The x.
        * @param y
        * 		The y.
        */
       void removeElement(int x, int y);

       /**
        * Get the observable
        * 
        * @return the element
        */
       Observable getObservable();

       /**
        * Set the Diamond
        * 
        * @param x
        * 		The x.
        * @param y
        * 		The y.
        */
	void popDiamond(int x, int y);
       
}
