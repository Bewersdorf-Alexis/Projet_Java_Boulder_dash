package contract;

import java.util.Observable;

public interface ILevelMap {

       
       public IElement getElement(int x, int y);
       
       public void setElement(int x, int y, IElement element);

       public IElement getPlayer();

       void removeElement(int x, int y);

       Observable getObservable();
       
}
