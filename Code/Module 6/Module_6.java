public class Module_6 {
    public static void main(String args[]) {
//        test_zone();
//        test_zone_2();
//        test_zone_3();
        test_zone_4();
    }

    private static void test_zone_4() {
    }

    private static void test_zone_3() {
        // 17
        System.out.println("-------Test Zone 3-------");
        Shape a1 = new Shape();
//        a1.print(); // print 1

        Shape a2 = new Triangle();
//        a2.print(); // prints 12 because super is called.

        Shape a3 = new EquilateralTriangle();
//        a3.print(); // prints 123 because super is called.

    }

    private static void test_zone_2() {
        // 12 to 16
        System.out.println("-------Test Zone 2-------");
        Shape s1 = new Shape();
//        s1.print(); // Prints 1

        Shape s2 = new Rectangle();
//        s2.print(); // Prints 2

        Shape s3 = new Square();
//        s3.print(); // Prints 3
//        System.out.println(s3.getClass().getAnimalName()); // Prints Actual Shape The Declared is Shape

    }

    public static void test_zone() {
        // Question 1 to 11
        // READ IT RIGHT TO LEFT EX. Student is a person

        Person p1 = new Student(); // works
//        Student s1 = new Person(); // doesn't work
        Person p2 = new Undergraduate();
//        Undergraduate u1 = new Person(); // does not work
        Student s2 = new Undergraduate();
        Object o1 = new Student();
//        Student s3 = new Object(); // no work
//        Undergraduate u2 = new Student(); // no work
//        Student s4 = new Teacher(); // no work
//        Teacher t1 = new Undergraduate(); // no work
//        Undergraduate u3 = new Teacher(); // no work


    }

    // CLASS CLASS BECAUSE ALREADY HAVE BOOK CLASS

    // 21 will compile
    class Book {
        public void print() {
            System.out.print(1);
        }
    }
    class Atlas extends Book {
        public void print() {
            super.print();
            System.out.print(2);
        }
    }
}

class Shape {
    public void print() {
        System.out.print(1);
    }
}

class Rectangle extends Shape {
    public void print() {
        System.out.print(2);
    }
}

class Square extends Rectangle {
    public void print() {
        System.out.print(3);
    }
}

// SHIT MADE AGAIN
//class Shape {
//    public void print() {
//        System.out.print(1);
//    }
//}
class Triangle extends Shape {
    public void print() {
        super.print();
        System.out.print(2);
    }
}

class EquilateralTriangle extends Triangle {
    public void print() {
        super.print();
        System.out.print(3);
    }
}

// 20 CODE WILL NOT COMPILE BECAUSE OF SUPER
//class Book {
//    public void print() {
//        super.print();
//        System.out.print(1);
//    }
//}

