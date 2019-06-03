package contract;

import java.awt.Image;
import java.io.IOException;


public interface ISprite {

	public Image getImage();

	public void setImage(Image image);

	public void loadImage() throws IOException;

	public String getImageName();

	public void setImageName(String imageName);

}
