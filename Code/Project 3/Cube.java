public class Cube extends ThreeDimensional {

    // Joseph: Could also make a Rectangular cuboid to extend from

    private Square cubeSquare;

    public Cube(double length) {
        cubeSquare = new Square(length);
    }

    public Cube(int length) {
        this((double) length);
    }

    public double getLength() {
        return cubeSquare.getLength();
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    public void setLength(double length) {
        this.cubeSquare.setLength(length);
    }

    public void setLength(int length) {
        this.setLength((double) length);
    }

    public double calculateSquareDiagonal() {
        return cubeSquare.calculateDiagonal();
    }

    @Override
    public double calculateVolume() {
        // V = a^3
        return Math.pow(cubeSquare.getLength(), 3);
    }

    @Override
    public double calculateArea() {
        // A = 6*a^2
        return 6 * Math.pow(cubeSquare.getLength(), 2);
    }

    @Override
    public boolean canFitInside(ThreeDimensional shape) {
        // Check for False

        // For Cube
        if (shape instanceof Cube) {
            Cube givenCube = (Cube) shape;

            if (getLength() >= givenCube.getLength()) {
                return false;
            }

            return true;
        }

        // For Cylinder
        if (shape instanceof Cylinder) {
            Cylinder givenCylinder = (Cylinder) shape;

            if (getLength() >= givenCylinder.getLength()) {
                return false;
            }

            if (getLength() >= givenCylinder.calculateCircleDiameter()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s | Cube: L = %.2f",
                super.toString(),
                cubeSquare.getLength());
    }

    public boolean isASide(Square square) {
        return cubeSquare.equals(square);
    }
}
