package contract;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public interface ISprite {

	public Image getImage();

	public void setImage(Image image);

	public void loadImage() throws IOException;

	public String getImageName();

	public void setImageName(String imageName);

	public boolean isImageLoaded();

	public void setImageLoaded(boolean isImageLoaded);

}
