package contract;

import java.awt.Image;
import java.io.IOException;

/**
 * The Interface ISprite
 *
 * @author Group 5
 */
public interface ISprite {

	/**
	 * Get the Image of element
	 * 
	 * @return image 
	 * 			the image of block
	 */
	public Image getImage();

	/**
	 * Set the image of element
	 * 
	 * @param image
	 */
	public void setImage(Image image);

	/**
	 * Load the image of element with imageName
	 * 
	 * @throws IOException
	 */
	public void loadImage() throws IOException;

	/**
	 * Get the name of image
	 * 
	 * @return imageName
	 */
	public String getImageName();

	/**
	 * Set the name of image
	 * 
	 * @param imageName
	 */
	public void setImageName(String imageName);

}
