 

/**
 * Class for work with matrix.
 * He allow multiply two matrix and do transpose one matrix in one time.
 * During multiplying number of rows and columns of two
 * matrix must be equals otherwise expected exeption of class Exeption.
 *
 * @author  Vitalii Litvinov. 
 */
public class Matrix {

    /** The points of matrix. */
    private double[][] points;

    /**
     * Constructor for create matrix with using multidimensional array.
     *
     * @param points
     *            of matrix
     */
    public Matrix(double[][] points) {
        super();
        this.points = points;
    }

    /**
     * Constructor for create matrix with using number of rows and columns.
     *
     * @param row
     *            number of rows
     * @param column
     *            number of columns
     */
    public Matrix(int row, int column) {
        super();
        this.points = new double[row][column];
    }

    /**
     * Returns the element of matrix.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the el
     */
    public double getEl(int x, int y) {
        return points[x][y];
    }

    /**
     * Sets the element of matrix.
     *
     * @param x
     *            row coordinate
     * @param y
     *            column coordinate
     * @param el
     *            element
     *            for insert
     * 
     */
    public void setEl(int x, int y, double el) {
        this.points[x][y] = el;
    }

    /**
     * Gets number of column.
     * 
     * @return number of column.
     */
    private int getColumn() {
        return this.points.length;

    }

    /**
     * Returns number of column.
     * 
     * @return number of row.
     */
    private int getRow() {
        return this.points[0].length;
    }

    /**
     * Multiplies two matrices.
     * 
     *
     * @param secondMatrix
     *            matrix for multiplies
     * @return new matrix after multiplying
     * @throws exception
     *             if row and column does not equals
     */
    public Matrix multiplyTo(Matrix secondMatrix) throws java.lang.Exception {

        if (this.getColumn() != secondMatrix.getRow()) {
            throw new Exception("row and column does not equals");
        }
        Matrix resultMatrix = new Matrix(this.getRow(),
                secondMatrix.getColumn());

        for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < secondMatrix.getColumn(); j++) {
                for (int k = 0; k < this.getColumn(); k++) {
                    resultMatrix.setEl(i, j, resultMatrix.getEl(i, j)
                            + (this.getEl(i, k) * secondMatrix.getEl(k, j)));

                }
            }
        }
        return resultMatrix;
    }

    /**
     * Transposes this matrix.
     */
    public void transpose() {
        for (int i = 0; i < this.getRow(); i++) {
            for (int j = i + 1; j < this.getColumn(); j++) {
                double temp = this.getEl(i, j);
                this.setEl(i, j, this.getEl(j, i));
                this.setEl(j, i, temp);
            }
        }

    }

    /**
     * Makes textual representation of the matrix.
     *
     * @return textual representation of the matrix
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < this.getRow(); row++) {
            for (int col = 0; col < this.getColumn(); col++) {
                builder.append(String.format("%-7.3f", this.getEl(row, col)));
            }
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }

    /**
     * Checks all other methods.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new double[][] { { 1, 2 }, { 3, 4 } });
        Matrix secondMatrix = new Matrix(new double[][] { { 1, 2 }, { 3, 4 } });

        try {
            System.out.println(matrix.multiplyTo(secondMatrix));
            matrix.transpose();
            System.out.println(matrix);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
