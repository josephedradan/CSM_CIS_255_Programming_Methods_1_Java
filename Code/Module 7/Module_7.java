public class Module_7 {
    public static void main(String args[]) {
        question3();
        question4();
        test_code_zone();
        question8();
    }

    private static void question8() {
        // 8
        // Student extends person
        Person p1 = new Student(); //

        //9
        // Person is abstract
//        Person p2 = new Person(); // NO WORK

        //10
        // student no implement financial aid.
//        FinancialAidEligible p3 = new Student();

        //11
        // Works
        FinancialAidEligible p4 = new Undergraduate();

        //12
        // CAN NOT BE instantiated REMEMBER YOU FUCK,  abs and interface are a NO GO.
//        FinancialAidEligible p5 = new FinancialAidEligible (); // NO WORK

        //13
        Student[] people = new Student[10];

        //14
        // Person is abstract class
        Person[] people2 = new Person[10];

        //15
        // FinancialAidEligible is a interface
        FinancialAidEligible[] people3 = new FinancialAidEligible[10];

    }

    private static void question4() {
        // WORKS WITHOUT AN OVERRIDE IN C
        ClassA myObject = new ClassC();
        myObject.originalMethod();

        // WORKS WITHOUT AN OVERRIDE IN C
        ClassC myObject2 = new ClassC();
        myObject2.originalMethod();
    }

    private static void question3() {
        //ClassA myObject = new ClassB(1,2);
        //ClassA myObject2 = new ClassA(1,2); // NO WORK
    }

    private static void test_code_zone() {

    }

}

// you can implement from multiple interface
interface josephImp {

}

// you can extend only one abstract class AKA inherits
abstract class josephAbs{

}