public abstract class Shape {

    public abstract double calculateArea();

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Shape";
    }
}
