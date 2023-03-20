public abstract class ThreeDimensional extends Shape {
    // Could have been an interface
    public abstract double calculateVolume();

    public abstract boolean canFitInside(ThreeDimensional shape);

    @Override
    public String toString() {
        return String.format("%s | Three Dimensional",
                super.toString());
    }
}
