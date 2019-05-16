package classes.shapes;

import java.util.Random;
 
/**
 * The Class RandomShapePrinter need for draw random shape and her perimeter
 * with use object of class Random.
 * 
 * @author  Vitalii Litvinov. 
 */
public class RandomShapePrinter {

    /**
     * Checks all methods for draw.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
        draw(createRandomShapes(10));

    }

    /**
     * Creates the random shapes.
     *
     * @param shapesNumber the shapes number
     * @return the shape[]
     */
    public static Shape[] createRandomShapes(int shapesNumber) {
        Random random = new Random();
        Shape[] shapes = new Shape[shapesNumber];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getShape(random.nextInt(2));
        }

        return shapes;

    }

    /**
     * Draws shape on monitor with perimeter.
     *
     * @param shapes the shapes
     */
    public static void draw(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + 1 + " " + shapes[i] + " perimeter="
                    + shapes[i].getPerimeter());
        }
    }

    /**
     * Gives the shape depending on key.
     *
     * @param key            binary number 1 or 0
     * @return the shape
     */
    public static Shape getShape(int key) {
        switch (key) {
            case 1:
                return new Triangle(new Point(1, 2), new Point(2, 2),
                    new Point(3, 3));
            default:
                return new Circle(new Point(1, 2), new Point(5, 7));
        }
    }
}
