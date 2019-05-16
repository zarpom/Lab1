package classes.shapes;

/**
 * The class Triangle extends abstract class Shape and have two new points and
 * use original point his parent. He allow view triangle like object who have
 * three point of class Point.
 * He have new methods for define length of vector to get perimeter of triangle.
 * 
 * @author Vitalii Litvinov.
 */
public class Triangle extends Shape {

    /** The second point. */
    private Point secondPoint;

    /** The third point. */
    private Point thirdPoint;

    /**
     * Constructor for create triangle with using three points.
     *
     * @param x
     *            fist point
     * @param y
     *            second point
     * @param z
     *            third point
     */
    public Triangle(Point x, Point y, Point z) {
        super(x);
        this.secondPoint = y;
        this.thirdPoint = z;
    }

    /**
     * Draws triangle on monitor.
     * 
     * @see Shape#draw
     */
    @Override
    public void draw() {
        System.out.println("x=" + super.firstPoint + "; y=" + secondPoint
                + "; z=" + thirdPoint);

    }

    /**
     * Moves triangle on the computer screen by iterate coordinate.
     * 
     * @see Shape#move
     */
    @Override
    public void move() {
        firstPoint.setX(firstPoint.getX() + 1);
        secondPoint.setX(secondPoint.getX() + 1);
        thirdPoint.setX(thirdPoint.getX() + 1);
    }

    /**
     * Zooms triangle on the computer screen by multiplying coordinate.
     * 
     * @see Shape#zoom
     */
    @Override
    public void zoom() {
        this.firstPoint.setX(this.firstPoint.getX() * 2);
        this.secondPoint.setX(this.secondPoint.getX() * 2);
        this.thirdPoint.setX(this.thirdPoint.getX() * 2);
    }

    /**
     * Makes textual representation of the triangle.
     *
     * @return textual representation of the triangle
     */
    @Override
    public String toString() {
        return String.format("%-5s",
                "Triangle [first point=" + firstPoint + ",second point="
                        + secondPoint + ",third=" + thirdPoint + "]");
    }

    /**
     * Returns perimeter.
     * 
     * @see Shape#getPerimeter
     */
    @Override
    public double getPerimeter() {

        double fistSide = getVectorLength(this.firstPoint, this.secondPoint);
        double secondSide = getVectorLength(this.secondPoint, this.thirdPoint);
        double thirdSide = getVectorLength(this.thirdPoint, this.firstPoint);

        return fistSide + secondSide + thirdSide;
    }

    /**
     * Calculate the vector length.
     *
     * @param fisrtPoint
     *            the first point
     * @param secondPoint
     *            the second point
     * @return the vector length
     */
    private double getVectorLength(Point fisrtPoint, Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.getX() - fisrtPoint.getX(), 2)
                + Math.pow(secondPoint.getY() - fisrtPoint.getY(), 2));
    }
}
