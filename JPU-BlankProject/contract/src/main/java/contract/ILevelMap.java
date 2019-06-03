package contract;

import java.util.Observable;

/**
 * The Interface ILevelMap.
 *
 * @author Group 5
 */
public interface ILevelMap {

       /**
        * Get the elements with coordonates
        * 
        * @param x
        * @param y
        * @return level array
        */
       public IElement getElement(int x, int y);
       
       /**
        * Set the elements with coordonates, and set the change et notigy observer
        * 
        * @param x
        * @param y
        * @param element
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
        * @param y
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
        * @param y
        */
	void popDiamond(int x, int y);
       
}
