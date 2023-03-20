public abstract class TwoDimensional extends Shape {
    // Could have been an interface
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return String.format("%s | Two Dimensional",
                super.toString());
    }
}
