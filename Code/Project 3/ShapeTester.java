
/*
Project 3: Shapes (Inheritance and Polymorphism)

CIS-255-OLH-(CS1) Programming Methods:Java-CRN 88669

Programmed by:
John Exequiel Javier San Jose
Joseph Edradan

*/

import java.util.*;

public class ShapeTester {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(4, 3);
        Rectangle rectangle3 = new Rectangle(5, 6);
        Square square1 = new Square(2);
        Square square2 = new Square(4);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(4, 6);
        Cube cube1 = new Cube(2);
        Cube cube2 = new Cube(3);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle1);
        shapeList.add(rectangle2);
        shapeList.add(rectangle3);
        shapeList.add(square1);
        shapeList.add(square2);
        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(cylinder1);
        shapeList.add(cylinder2);
        shapeList.add(cube1);
        shapeList.add(cube2);

        System.out.println("\n\nPrinting Shapes\n");
        for (Shape shape : shapeList) {
            System.out.println(shape);
            System.out.println("Area: " + shape.calculateArea());

            // CODE MISSING: PRINT THE PERIMETER OF TWO-DIMENSIONAL SHAPES

            if (shape instanceof TwoDimensional) {
                if (shape instanceof Rectangle) {
                    Rectangle rect = (Rectangle) shape;
                    System.out.printf("The perimeter for this shape is: %.2f ", rect.calculatePerimeter());

                } else if (shape instanceof Circle) {
                    Circle circ = (Circle) shape;
                    System.out.printf("The perimeter for this shape is: %.2f ", circ.calculatePerimeter());
                }
                System.out.println();
            }

            // CODE MISSING: PRINT THE VOLUME OF THREE-DIMENSIONAL SHAPES
            if (shape instanceof ThreeDimensional) {
                if (shape instanceof Cylinder) {
                    Cylinder cylin = (Cylinder) shape;
                    System.out.printf("The volume for this shape is: %.2f ", cylin.calculateVolume());
                } else if (shape instanceof Cube) {
                    Cube cub = (Cube) shape;
                    System.out.printf("The volume for this shape is: %.2f ", cub.calculateVolume());
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("\n\nPrinting Shape Testing\n");

        int countFirstShape = 0;
        for (Shape firstShape : shapeList) {

            int countSecondShape = 0;
            countFirstShape++;

            System.out.println(String.format("%s at index: %s ",
                    firstShape.getClass().getName(),
                    (countFirstShape - 1)));

            for (Shape secondShape : shapeList) {
                ++countSecondShape;

                // CODE MISSING: TEST IF THE TWO SHAPES EQUAL (BUT NOT ALIASES!)
                //System.out.println(firstShape.equals(secondShape) + "\n");
                if (firstShape.equals(secondShape)) {
                    System.out.println("\tThe shape at index " + (countFirstShape - 1) +
                            " is equivalent too the shape at index "
                            + (countSecondShape - 1));

                }
//                else {
//                    System.out.println("\tThe shape at index " + (countFirstShape - 1) +
//                            " is not equivalent too the shape at index "
//                            + (countSecondShape - 1));
//                }

                // CODE MISSING: TEST THE isTopOrBottom METHOD FOR CYLINDER/CIRCLE COMBINATIONS
                if (firstShape instanceof Cylinder && secondShape instanceof Circle) {
                    Cylinder cylin = (Cylinder) firstShape;
                    Circle circ = (Circle) secondShape;

                    if (cylin.isTopOrBottom(circ)) {
                        System.out.println("\tThis Circle at index " + (countSecondShape - 1) +
                                " can be the top of the Cylinder at index " + (countFirstShape - 1));
                        System.out.println();
                    }

                }


                // CODE MISSING: TEST THE isASide METHOD FOR CUBE/SQUARE COMBINATIONS
                if (firstShape instanceof Cube && secondShape instanceof Square) {
                    //System.out.println(((Cube) firstShape).isASide((Square) secondShape));
                    if (((Cube) firstShape).isASide((Square) secondShape)) {
                        System.out.println("\tThis Cube at index " + (countSecondShape - 1) +
                                " can be a side of the Cube at index " + (countFirstShape - 1));
                        System.out.println();
                    }
                }
                // EXTRA CREDIT: TEST THE canFitInside METHOD FOR PAIRS OF THREE DIMENSIONAL SHAPES

                // If the shape is Three Dimensional.
                if (firstShape instanceof ThreeDimensional && secondShape instanceof ThreeDimensional) {
                    canFitInsidePrinter(
                            (countFirstShape - 1),
                            (countSecondShape - 1),
                            (ThreeDimensional) firstShape,
                            (ThreeDimensional) secondShape);
                }
            }
            System.out.println();
        }
    }

    private static void canFitInsidePrinter(int index1, int index2, ThreeDimensional shape1, ThreeDimensional shape2) {
        System.out.println(String.format("\tCan First 3d shape at index %s fit in Second 3d Shape at index %s: %s",
                index1,
                index2,
                (shape1).canFitInside(shape2)));
        System.out.println(String.format("\tCan Second 3d shape at index %s fit in Second 3d First at index %s: %s",
                index2,
                index1,
                (shape2).canFitInside(shape1)));
        System.out.println();

    }
}