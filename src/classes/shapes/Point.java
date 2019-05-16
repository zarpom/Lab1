package classes.shapes;
 
/**
 * The Class Point for determinate dots coordinate.
 * 
 * @author  Vitalii Litvinov. 
 */
public class Point {
    
    /** The first coordinate. */
    private int firstCoordinate;
    
    /** The second coordinate. */
    private int secondCoordinate;

    /**
     * Instantiates a new point.
     *
     * @param x the x
     * @param y the y
     */
    public Point(int x, int y) {
        super();
        this.firstCoordinate = x;
        this.secondCoordinate = y;
    }

    /**
     * Returns the x.
     *
     * @return the x
     */
    public int getX() {
        return firstCoordinate;
    }

    /**
     * Sets the x.
     *
     * @param x the new x
     */
    public void setX(int x) {
        this.firstCoordinate = x;
    }

    /**
     * Returns the "y" coordinate.
     *
     * @return the y
     */
    public int getY() {
        return secondCoordinate;
    }

    /**
     * Sets the y coordinate.
     *
     * @param y the new y
     */
    public void setY(int y) {
        this.secondCoordinate = y;
    }

    /**
     * Makes textual representation of the point.
     *
     * @return textual representation of the point
     */
    @Override
    public String toString() {
        return "[x=" + firstCoordinate
                + ", y=" + secondCoordinate + "]";
    }
    
}
