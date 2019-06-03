package entity;

/**
* The Class Level.
*
* @author Group 5
*/
public class Level extends Entity {

       /** The id. */
       private int        id;
       
       /** The Level. */
       private String[][] level = new String[40][22];

       /**
       * Instantiates a new Level.
       *
       * @param id
       *          the id
       * initializes the table
       */
       public Level(final int id) {
             this.setId(id);
       }

       /**
       * Instantiates a new Level.
       */
       public Level() {
             this(0);
       }

       /**
       * Builds the level table
       * 
        * @param x
       *                  the x position in table
       * 
        * @param y
       *                  the y position in table
       * 
        * @param map
       *                  the character of map level
       * 
        */
       public void constructLevel(int x, int y, String element) {
             
             this.level[x][y] = element;
       }
       
       /**
       * Gets the level.
       *
       * @return the level
       */
       public String getElement(int x, int y) {
             return this.level[x][y];
       }
       
       /**
       * Gets the id.
       *
       * @return the id
       */
       public int getId() {
             return this.id;
       }

       /**
       * Sets the id.
       *
       * @param id
       *          the new id
       */
       public void setId(final int id) {
             this.id = id;
       }

}
