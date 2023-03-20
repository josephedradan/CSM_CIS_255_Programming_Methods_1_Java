import java.util.Arrays;

public class Module_4 {
    public static void main (String args[]){
//        non_hw_notes();
        test_zone_1();

        System.out.println();

        // QUESTION 6
//        MyClass question_6 = new MyClass();
//        question_6.doSomething(6);

        // QUESTION 10
//        question_10();


        // QUESTION 11      ****************** CHECKOUT
        // This shit makes an Object and you can do shit in it with the DetermineNullInObject Class.
        DetermineNullInObject question_11_object = new DetermineNullInObject();

        Object[] question_11_array = new Object[5];

        // Similar to
        // int[] intArray = new int[20]; // combining both statements in one
        question_11_array[2] = 3;
        question_11_array[1] = 2;

        // FOR PRINTING ARRAY
        System.out.println("\nQuestion 11");
        Arrays.stream(question_11_array)
                .forEach(e-> System.out.printf("%s ",e));
        System.out.println();

        System.out.println("Offset is 1 so start at array index 1");
        // Could input      new Object[] {1,2,3,123, null, 33,}
        System.out.println(question_11_object.countNulls(question_11_array, 1));

        System.out.println("\nThe object array is: new Object[] {1,2,3,123, null, 33,}");
        System.out.println(question_11_object.countNulls(new Object[] {1,2,3,123, null, 33,}));
        System.out.println("");

        // QUESTION 13
        System.out.println(Creature.DRAGON.ordinal()); // RETURNS 2



    }

    private static void question_10() {

        // This one will not work
//        int n = Bird.getFlightSpeed();

        Bird b = new Bird();
        int n = b.getFlightSpeed();

        Bird B = new Bird();
        B.getFlightSpeed();

        int z = Bird.getMaximumFlightSpeed();

    }

    // static means you don't have to make an object to call its part of class.
    private static void non_hw_notes() {

        // NOTE THAT YOU MUST HAVE DIFFERENT AMOUNT OF PARAMS TO DO A METHOD.
        // OVERLOADING NEED DIFF PARAMETERS
        System.out.println(tryMe(123));

    }
    public static double tryMe(int x){
        return x + 0.123;
    }
    // WILL NOT WORK SINCE int x is already used.
//    public static int tryMe(int x){
//        return (int) x;
//    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////// HW Section
    // 1
//    public static int method () {
//        return 2;
//    }
//    public static int method (int num) {
//        return 2 * num;
//    }

    // 2
//    public static int method () {
//        return 4;
//    }
//
//    public static double method (int num) {
//        return 4.5;
//    }

    // 3
//    public static int method(int number) {
//        return number;
//    }
//
//    // CANT USE THIS SINCE int input is used ( int number ) is same input as ( int numberToConvert )
//    public static int method(int numberToConvert) {
//        return number * -1;
//    }

    // 4
//    public static int method () {
//        return method(5);
//    }
//
//    public static int method (int num) {
//        return 10 * num;
//    }

    // 5
//    public static void method(int num) {
//        double n = num * 0.5;
//        System.out.println(n);
//    }
//
//    // CANT USE THIS SINCE int input is used ( int number ) is same input as ( int numberToConvert )
//    public static double method(int num) {
//        return num * 0.5;
//    }

    public static void test_zone_1(){
//        System.out.println(method());
//        System.out.println(method(1));

        // For Question 5 and above
//        method(9);

        // 14
//        Creature myCreature = DRAGON;                         // WILL NOT WORK
        Creature myCreature = Creature.DRAGON;                // WORKS
//        Creature myCreature = new Creature (Creature.DRAGON); // WILL NOT WORK // CANT WORK BECAUSE PRIVATE
//        Creature myCreature=Creature.dragon;                  // WILL NOT WORK
//        Creature myCreature = new Creature (DRAGON);          // WILL NOT WORK // CANT WORK BECAUSE PRIVATE
//        myCreature = DRAGON;                                  // WILL NOT WORK
//        Creature myCreature = new Creature ("DRAGON");        // WILL NOT WORK // CANT WORK BECAUSE PRIVATE

        // 15
        System.out.println("Question 15   " + myCreature); // prints  Question 15   DRAGON

        // 16
        System.out.println("Question 16   " + myCreature.canFly()); // prints  Question 16   true

        // 17
        //Creature newCreature = new Creature("ELF"); // CANT WORK BECAUSE PRIVATE

        // 18
        String s = "";
        System.out.println("Question 18   " + s.length());

        // 19
//        String q19 = null;
//        System.out.println("Question 18   " + q19.length()); // WILL LEAD TO EXCEPTION OR ERROR

        // 20
        String a = null;
        String b = "";
        System.out.printf("Question 20   %s\n",a==b); // prints false

        // 21
        String a2 = null;
        String b2 = "";
//        System.out.printf("Question 20   %s\n", a2.equals(b2)); // WILL CAUSE Exception in thread "main"
//        System.out.println(a2.equals(b2)); // Exception in thread "main"

        // 22
        String a3 = null;
        String b3 = "";
        System.out.printf("Question 22   %s\n", b3.equals(a3));


    }
}

