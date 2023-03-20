public class Rectangle extends TwoDimensional {

    /*
    Reason for double is that a Cylinder has a rectangle in it
    and one of its parameters uses pi for area (2*pi*r*L).
     */

    private double length, width;
    private final int DEFAULT_VALUE = 1;

    public Rectangle(double length, double width) {
        this.length = validateDistance(length);
        this.width = validateDistance(width);

    }

    public Rectangle(int length, int width) {
        this((double) length, (double) width);
    }

    public double validateDistance(double distance) {
        if (distance > 0) {
            return distance;
        } else {
            System.out.println("Invalid distance, Default distance ( 1 ) used instead!");
            return DEFAULT_VALUE;
        }
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    public void setLength(double length) {
        this.length = validateDistance(length);
    }

    public void setLength(int length) {
        this.setLength((double) length);
    }

    public void setWidth(double width) {
        this.width = validateDistance(width);
    }

    public void setWidth(int width) {
        this.setWidth((double) width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    @Override
    public String toString() {
        return String.format("%s | Rectangle: L = %.2f, W = %.2f",
                super.toString(),
                length,
                width);
    }

    public boolean equals(Object obj) {

        /*
        If the object is a Rectangle or Square and it has the same Length and Width even if one of them is swapped
        then its considered to be the same.
        */

        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;

            if (length == rectangle.getLength() && width == rectangle.getWidth()) {
                return true;
            }

            if (width == rectangle.getLength() && length == rectangle.getWidth()) {
                return true;
            }
        }
        return false;
    }
}

