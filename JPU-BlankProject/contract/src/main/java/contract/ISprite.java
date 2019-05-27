package contract;

import java.awt.Image;

public interface ISprite {

	public Image getImage();
	
	public void setImage(final Image image);
	
	public void loadImage();
	
	public String getImageName();
	
	public void setImageName(final String imageName);
	
	public boolean isImageLoaded();
	
	public void setImageLoaded(final boolean isImageLoaded);
	
	
}
