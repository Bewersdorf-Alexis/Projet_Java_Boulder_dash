package contract;

import java.awt.Image;
import java.io.IOException;

public interface ISprite {

	public Image getImage();
	
	public void setImage(final Image image);
	
	public void loadImage() throws IOException;
	
	public String getImageName();
	
	public void setImageName(final String imageName);
	
	public boolean isImageLoaded();
	
	public void setImageLoaded(final boolean isImageLoaded);
	
	
}
