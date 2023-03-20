public class Cylinder extends ThreeDimensional {

    private Circle cylinderCircle;
    private Rectangle cylinderRectangle;

    public Cylinder(double radius, double length) {
        this.cylinderCircle = new Circle(radius);

        // Need cylinderCircle radius to validate
        this.cylinderRectangle = new Rectangle(length, radiusToWidth(cylinderCircle.getRadius()));
    }

    public Cylinder(int radius, int length) {
        this((double) radius, (double) length);
    }

    public double getWidth() {
        return cylinderRectangle.getWidth();
    }

    public double getRadius() {
        return cylinderCircle.getRadius();
    }

    public double getLength() {
        return cylinderRectangle.getLength();
    }

    public void setLength(double length) {
        this.cylinderRectangle.setLength(length);
    }

    public void setLength(int length) {
        this.setLength((double) length);
    }

    // Is private because it is dependent on radius.
    private double radiusToWidth(double radius) {
        // 2*pi*r = the width of the curved part of the cylinder.
        double width = 2 * Math.PI * radius;
        return width;
    }

    public void setRadius(double radius) {
        this.cylinderCircle.setRadius(radius);
        this.cylinderRectangle.setWidth(radiusToWidth(cylinderCircle.getRadius()));
    }

    public void setRadius(int radius) {
        this.setRadius((double) radius);
    }

    // Enforces Encapsulation
    public double calculateCircleDiameter() {
        return cylinderCircle.calculateDiameter();
    }

    @Override
    public double calculateVolume() {
        // V = pi*r^2*L
        double volume = cylinderCircle.calculateArea() * cylinderRectangle.getLength();
        return volume;
    }

    @Override
    public double calculateArea() {
        // A = 2*pi*r*L + 2*pi*r^2
        double surfaceArea = cylinderRectangle.calculateArea() + 2 * cylinderCircle.calculateArea();
        return surfaceArea;
    }

    @Override
    public boolean canFitInside(ThreeDimensional shape) {
        // Check for False

        // For Cylinder
        if (shape instanceof Cylinder) {
            Cylinder givenCylinder = (Cylinder) shape;

            if (getLength() >= givenCylinder.getLength()) {
                return false;
            }

            if (calculateCircleDiameter() >= givenCylinder.calculateCircleDiameter()) {
                return false;
            }
            return true;
        }

        // For Cube
        if (shape instanceof Cube) {
            Cube givenCube = (Cube) shape;

            if (getLength() >= givenCube.getLength()) {
                return false;
            }

            if (calculateCircleDiameter() >= givenCube.calculateSquareDiagonal()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("%s | Cylinder: r = %.2f, L = %.2f",
                super.toString(),
                getRadius(),
                getLength());
    }

    public boolean isTopOrBottom(Circle circle) {
        return cylinderCircle.equals(circle);
    }
}
