public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public Square(int length) {
        this((double) length);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setLength(int length) {
        this.setLength((double) length);
    }

    // This is here because it would be complicated in Rectangle
    public double calculateDiagonal() {
        // c = sqrt(a^2 + b^2)
        double diagonal = Math.sqrt(Math.pow(getLength(), 2) + Math.pow(getLength(), 2));
        return diagonal;
    }

    @Override
    public String toString() {
        return String.format("%s | Square: L = %.2f",
                super.toString(),
                super.getLength());
    }
}
