public class Circle extends TwoDimensional {

    /*
    Reason for double is that a Cylinder has a rectangle in it
    and one of its parameters uses pi for area (2*pi*r*L).
    Might as well have it for radius too.
     */

    private double radius;
    private final int DEFAULT_VALUE = 1;

    public Circle(int radius) {
        this((double) radius);
    }

    public Circle(double radius) {
        this.radius = validateRadius(radius);
    }

    public double validateRadius(double radius) {
        if (radius > 0) {
            return radius;
        } else {
            System.out.println("Invalid radius, Default radius ( 1 ) used instead!");
            return DEFAULT_VALUE;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = validateRadius(radius);
    }

    public void setRadius(int radius) {
        this.setRadius((double) radius);
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("%s | Circle: r = %.2f",
                super.toString(),
                radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;

            if (radius == otherCircle.getRadius()) {
                return true;
            }
        }
        return false;
    }
}
