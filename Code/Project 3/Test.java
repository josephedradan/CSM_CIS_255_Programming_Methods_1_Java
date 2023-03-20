public class Test {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 2);
        Square square1 = new Square(2);
        Square square2 = new Square(3);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(5);

        System.out.println("\nCreate object of type Cylinder but it is assigned to Shape so you have to cast (Upcasting)");
        Shape cylinder = new Cylinder(2, 4);
        System.out.println(((Cylinder) cylinder).getRadius());


        System.out.println("\nTesting Cube with Side (Square)");
        Cube cube1 = new Cube(2);

        System.out.println(cube1.isASide(square2));

        Rectangle rectangle3 = new Rectangle(2, 3);
        Rectangle rectangle4 = new Rectangle(3, 2);
        Rectangle rectangle5 = new Rectangle(2, 2);
        Rectangle rectangle6 = new Rectangle(2, 3);

        System.out.println("\nRectangle Testing");
        System.out.println(rectangle3.equals(rectangle4)); // SHOULD BE TRUE
        System.out.println(rectangle5.equals(rectangle6)); // SHOULD BE FALSE
        System.out.println(rectangle6.equals(rectangle4)); // SHOULD BE TRUE
        System.out.println(rectangle1.equals(rectangle3)); // SHOULD BE TRUE

        System.out.println("\nCircle Testing");
        System.out.println(circle2.equals(circle1)); // SHOULD BE TRUE

        System.out.println("\nSquare Testing");
        Rectangle square3 = new Square(2);
        Rectangle rectangle7 = new Rectangle(2, 2);
        Square square4 = new Square(2);

        System.out.println(square3);
        System.out.println(rectangle7.equals(square3)); // SHOULD BE TRUE

        System.out.println(square4.equals(rectangle7)); // SHOULD BE TRUE Square == Rectangle
        System.out.println(square4.equals(square3)); // SHOULD BE TRUE Square == Declared Square
        System.out.println(rectangle7.equals(square4)); // SHOULD BE TRUE Rectangle == Square

        System.out.println("\nSquare Size Change Testing");
        Square square5 = new Square(2);
        Square square6 = new Square(2);
        System.out.println(square5.equals(square6));
        square6.setLength(100);
        System.out.println(square5.equals(square6));
        square5.setLength(100);
        System.out.println(square5.equals(square6));

        System.out.println("\nCylinder Testing");
        Cylinder cylinder1 = new Cylinder(1.1,2.1);
        Cylinder cylinder2 = new Cylinder(2.1,3.1);
        Cube cube2 = new Cube (1);
        Cube cube3 = new Cube (3);

        System.out.println(cube2.canFitInside(cube3)); // Should be true
        System.out.println(cube2.canFitInside(cube2)); // Should be false

        System.out.println(cylinder1.canFitInside(cylinder1)); // Should be False
        System.out.println(cylinder1.canFitInside(cylinder2)); // Should be True
        System.out.println(cylinder1.canFitInside(cube3)); // Should be True
        System.out.println(cube3.canFitInside(cylinder2)); // Should be True
        System.out.println(cylinder2.canFitInside(cube3)); // Should be False











        /*
        boolean stat = test1.equals(test2);

        System.out.println(test4.getLength() + "x" + test4.getWidth());

        System.out.println(test1.getDescription());

        System.out.println(stat);

        System.out.println();

        System.out.println(test5.calculateArea());
        System.out.println(test5.calculatePerimeter());

        System.out.println(test1.toString());

        System.out.println(test5.toString());
        */
    }
}
