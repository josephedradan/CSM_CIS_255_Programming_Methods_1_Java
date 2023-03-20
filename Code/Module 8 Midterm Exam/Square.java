import javafx.scene.shape.Circle;

public class Square{
    public static void main(String args[]) {
        // Question 61
        Square mySquare = new Square(3); // 61

        // Question 62
        System.out.println(mySquare.getArea());

        // Question 63
//        boolean canFit = squareFitsInCircle(mySquare,myCircle); // THIS IS WRONGE??
    }
    private int sideLength;

    public Square(int s)   {
        sideLength= s;
    }
    public double getArea()   {
        return Math.pow(sideLength, 2);
    }
//    public static boolean squareFitsInCircle(Square square, Circle circle)  {
//        return square.getArea() <= circle.getArea();
//    }
}