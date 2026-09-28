/**
 * public class.
 *
*/

public class Rectangle {
  private double width;

  private double height;

  /**
     * Description.
     *
     * @param h records height of rectangle.
     *
     * @param w records width of rectangle.
  */
  public Rectangle(double w, double h) {
    this.width = w;

    this.height = h;
  }

  /**
     * Description.
     *
  */

  public double area() {
    return width * height;
  }

  /**
     * Scales the rectangle.
     *
     * @param factor multiplies dimensions by the factor.
  */

  public void scale(double factor) {
    width = width * factor;

    height = height * factor;
  }

  /**
     * Description.
     *
     * @param other comparing another rectangle.
     *
  */

  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
