package classes.shapes;
 
/**
 * The class Shape is the abstract base class for all shapes
 * which allow an other classes who extending him to draw their object with use
 * coordinates.
 * class has all abstract methods for move shape on a monitor, getting perimeter
 * or zoom on a monitor.
 * also he has first point for all shapes that will be extending him.
 * 
 * @author  Vitalii Litvinov. 
 */
public abstract class Shape {

    /** The first point. */
    protected Point firstPoint;

    /**
     * Default constructor . 
     */
    public Shape() {
        super();
    }

    /**
     * Constructor with default first point for all child constructors.
     *
     * @param x first point for all child constructors 
     */
    public Shape(Point x) {
        super();
        this.firstPoint = x;
    }

    /**
     * Draws shape on monitor.
     */
    public abstract void draw();

    /**
     * Moves shape on the computer screen by iterate coordinate.
     */
    public abstract void move();

    /**
     * Zooms shape on the computer screen by multiplying coordinate.
     */
    public abstract void zoom();

    /** 
     * Returns perimeter.
     * @return  perimeter
     */
    public abstract double getPerimeter();
}
