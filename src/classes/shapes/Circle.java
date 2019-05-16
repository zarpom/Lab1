package classes.shapes;

/**
 * The class Circle extends abstract class Shape and have one new point and
 * use original point his parent. 
 * He allow view circle like object who have two point of class Point.
 * He have new methods for define length of diameter to get perimeter of circle.
 *
 * @author  Vitalii Litvinov. 
 */
public class Circle extends Shape {

    /** 
     * The second point . 
     */
    private Point secondPoint;

    /**
     * Instantiates a new circle.
     *
     * @param x
     *            first point
     * @param y
     *            second point
     */
    public Circle(Point x, Point y) {
        super(x);
        this.secondPoint = y;
    }

    /**
     * Draws circle on monitor.
     * @see Shape#draw
     */
    @Override
    public void draw() {
        System.out.println("x=" + super.firstPoint + "; y=" + secondPoint);
    }

    /**
     *  Moves circle on the computer screen by iterate coordinate.
     * @see Shape#move()
     */
    @Override
    public void move() {
        this.firstPoint.setX(this.firstPoint.getX() + 1);
        this.secondPoint.setX(this.secondPoint.getX() + 1);

    }

    /**
     * Zooms circle on the computer screen by multiplying coordinate.
     * @see Shape#zoom
     */
    @Override
    public void zoom() {
        this.firstPoint.setX(this.firstPoint.getX() * 2);
        this.secondPoint.setX(this.secondPoint.getX() * 2);
    }

    /**
     * Makes textual representation of the Circle.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Circle   [first point=" + firstPoint + ",second point="
                + secondPoint + "]";
    }

    /**
     * Returns perimeter.
     * @see Shape#getPerimeter
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * (this.getDiameter() / 2);
    }

    /**
     * Calculates the diameter.
     *
     * @return the diameter
     */
    private double getDiameter() {
        return Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2)
                + Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
    }

}
