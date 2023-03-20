import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Module_1 {


    public static void main(String args[]) {
        test_zone();
        notes_zone();

//        printAverage(1, 2, 3);
//        calculateMiles(10, 200);
//        printGallonQuartPintCupOz(298);
//        printTrueValues(true,true);


//        System.out.println(isIsocelesTriangle(1,2,4));
//        System.out.println(isIsocelesTriangle(4,5,1));
//        System.out.println(isIsocelesTriangle(5,5,10));
//        System.out.println(isIsocelesTriangle(5,9,5));
//        System.out.println(isIsocelesTriangle(5,5,5));
//        System.out.println(isIsocelesTriangle(3,4,5));
//        System.out.println(isIsocelesTriangle(3,2,3));


    }


    public static void printAverage(int num1, int num2, int num3) {
        double x = (num1 + num2 + num3) / 3;
        System.out.println(x);
    }

    public static final double KM_TO_MILE = 0.621371;
    public static final double M_TO_MILE = 0.000621371;

    public static void calculateMiles(double km, double m) {
        double kmToMile = KM_TO_MILE * km;
        double mToMile = M_TO_MILE * m;
        System.out.println(kmToMile + mToMile);
    }

    public static final int OZ_IN_GALLON = 128;
    public static final int OZ_IN_QUART = 32;
    public static final int OZ_IN_PINT = 16;
    public static final int OZ_IN_CUP = 8;

    public static void printGallonQuartPintCupOz(int ounces) {

        int gallonInOunce = ounces / OZ_IN_GALLON;
        int gallonInOunceRemainder = ounces % OZ_IN_GALLON;

        int quartInOunce = gallonInOunceRemainder / OZ_IN_QUART;
        int quartInOunceRemainder = gallonInOunceRemainder % OZ_IN_QUART;

        int pintInOunce = quartInOunceRemainder / OZ_IN_PINT;
        int pintInOunceRemainder = quartInOunceRemainder % OZ_IN_PINT;

        int cupInOunce = pintInOunceRemainder / OZ_IN_CUP;
        int cupInOunceRemainder = pintInOunceRemainder % OZ_IN_CUP;


//        System.out.println(gallonInOunce);
//        System.out.println(gallonInOunceRemainder);
//        System.out.println(quartInOunce);
//        System.out.println(quartInOunceRemainder);
//        System.out.println(pintInOunce);
//        System.out.println(pintInOunceRemainder);
//        System.out.println(cupInOunce);
//        System.out.println(cupInOunceRemainder);

        System.out.printf("%d gallon(s), %d quart(s), %d pint(s), %d cup(s), with %d fluid ounces left over",
                gallonInOunce, quartInOunce, pintInOunce, cupInOunce, cupInOunceRemainder);

    }

    public static void printTrueValues(boolean a, boolean b) {
        if (a) {
            System.out.println("the first parameter is true");
        } else if (b) {
            System.out.println("the second parameter is true");
        } else {
            System.out.println("both parameters are false");
        }
    }

    public static boolean isIsocelesTriangle(int x, int y, int z) {
        if (x + y > z) {
            if (x == y && x == z) {
                return false;
            } else if (x == y) {
                return true;
            } else if (x == z) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void test_zone() {
//        boolean done = true;
//        int x = 11, y = 11;
//        boolean expression = (done && x <= y);
        // True

//        boolean a = true;
//        boolean b = true;
//        boolean c = false;
//        boolean expression = a && !(b || c);
        // False

//        boolean a = true;
//        boolean b = true;
//        boolean c = false;
//        boolean expression = !a || b;
        // False

//        int x = 3, y = 0;
//        if (y != 0 && ((x / y) > 0)) {
//            System.out.println("true");
//        }
        // WILL NOT CRASH

//        int x = 3, y = 0;
//        if (y == 0 || ((x / y) == 0)) {
//            System.out.println("true");
//        }
        // WILL NOT CRASH

//        int x = 1;
//        int y = (x<y) ? y=4 : y=3;
        // VALID CODE

//        (x<y) ? System.out.println("x") : System.out.println("y");
        // NOT VALID CODE

//        String s = (x<y) ? "hello" : "goodbye";
        // VALID CODE

//        int x=1, y=3;
//        int z = (x > y) ? x+1 : y+1;
//        System.out.println(z);

//        int a = 70;
//        boolean b = false;
//
//        if(a >= 70) {
//            System.out.print(1);
//
//            if(b==true) {
//                System.out.print(2);
//            }
//
//        } else {
//            System.out.print(3);
//
//            if(b==false) {
//                System.out.print(4);
//            }
//
//        }
//        System.out.print(5);
        // 15

//        int a = 40;
//        boolean b = false;
//
//        if(a >= 70) {
//            System.out.print(1);
//
//            if(b==true) {
//                System.out.print(2);
//            }
//
//        } else {
//            System.out.print(3);
//
//            if(b==false) {
//                System.out.print(4);
//            }
//
//        }
//        System.out.print(5);
        // 345

//        int a = 60;
//        boolean b = false;
//
//        if (a >= 50) {
//            System.out.print(1);
//
//            if (b == true) {
//                System.out.print(2);
//            }
//
//            System.out.print(3);
//
//        }
//
//        if (a >= 40) {
//            System.out.print(4);
//
//            if (b == false) {
//                System.out.print(5);
//            }
//
//        }
//
//        System.out.print(6);
        // 13456

//        int a = 30;
//        boolean b = false;
//
//        if (a >= 50) {
//            System.out.print(1);
//
//            if (b == true) {
//                System.out.print(2);
//            }
//
//            System.out.print(3);
//
//        }
//
//        if (a >= 40) {
//            System.out.print(4);
//
//            if (b == false) {
//                System.out.print(5);
//            }
//
//        }
//
//        System.out.print(6);
        // 6

//        int a = 80;
//        boolean b = true;
//
//        if(a >= 30) {
//            System.out.print(1);
//
//            if(b==true) {
//                System.out.print(2);
//            }
//
//            if(a >= 100) {
//                System.out.print(3);
//            }
//
//        } else if(a >= 20) {
//
//            System.out.print(4);
//
//        }
        // 12

//        int a = 25;
//        boolean b = true;
//
//        if(a >= 30) {
//            System.out.print(1);
//
//            if(b==true) {
//                System.out.print(2);
//            }
//
//            if(a >= 100) {
//                System.out.print(3);
//            }
//
//        } else if(a >= 20) {
//
//            System.out.print(4);
//
//        }
        // 4

//        int x=4, y=5;
//        if(x > y) {
//            System.out.print(x);
//        }else if(x==y) {
//            System.out.print(x+y);
//        } else {
//            System.out.print(y);
//        }
//        System.out.print(x);
        // 54

//        int x=8, y=3;
//        if(x != y) {
//            System.out.print(x);
//        } else {
//            System.out.print(y);
//        }
//        System.out.print(x);
        // 88

//        int x=9, y=7;
//        if(x < y) {
//            if(x%2 == 0) {
//                System.out.print(x);
//            }
//        } else {
//            if(y%2 == 0) {
//                System.out.print( y );
//            }
//        }
//        System.out.print(x);
        // 9

//        int score = 60;
//        Character grade;
//
//        if (score >= 90) {
//            grade = 'A';
//        }
//        if (score >= 80)  {
//            grade = 'B';
//        }
//        if (score >= 70) {
//            grade = 'C';
//        }
//        if (score >= 60) {
//            grade = 'D';
//        }
//        else {
//            grade = 'F';
//        }
//        System.out.println(grade);

//        int x = 4;
//
//        if (x > 10) {
//            System.out.println("Large");
//        } else if (x > 6 && x <= 10) {
//            System.out.println("Medium");
//        } else if (x > 3 && x <= 6) {
//            System.out.println("Small");
//        } else {
//            System.out.println("Very small");
//        }
//
//        if (x > 10) {
//            System.out.println("Large");
//        } else if (x > 6) {
//            System.out.println("Medium");
//        } else if (x > 3) {
//            System.out.println("Small");
//        } else {
//            System.out.println("Very small");
//        }
        // SIMPLIFY THIS SHIT MY MAN

//        int number = 3;
//        if(number % 2 ==0 ) {
//            System.out.println("The number is even.");
//        }
//        if(number % 3 == 0) {
//            System.out.println("The number is divisible by three.");
//        }
        // BEST SOL


//        int number = 3;
//        if(number< low) {
//            System.out.println("The number is low.");
//        } else if (number >= low && number <= high) {
//            System.out.println("The number is in the middle.");
//        } else if(number > high) {
//            System.out.println("The number is high.");
//        }
        // BEST SOL

//        int x=6;
//        System.out.println(x);
//        // COOL SHIT BRO
//        switch (x) {
//            case 3 : x += 1;
//            case 4 : x += 2;
//            case 5 : x += 3;
//            case 6 : x++;
//            case 7 : x += 2;
//            case 8 : x--;
//            case 9 : x++;
//        }
//        System.out.println(x);

//        int x=4;
//        System.out.println(x);
//        switch (x) {
//            case 3 : x += 1;
//            case 4 : x += 2;
//            case 5 : x += 3;
//            case 6 : x++;
//                break;
//            case 7 : x += 2;
//            case 8 : x--;
//            case 9 : x++;
//        }
//        System.out.println(x);

//        int x = 10;
//        do {
//            System.out.println(x);
//            x--;
//        } while (x > 0);
        // prints 10 times

//        int x = 6;
//        while (x > 0) {
//            System.out.println(x);
//            x--;
//        }
        // prints 6 times

//        for(int i=0; i<=10; i++) {
//            System.out.println(i);
//        }
        // prints 11 times

//        int counter = 1;
//        for(int j=0; j<30; j++) {
//            for(int k=30; k>0; k--) {
//                System.out.println("hi");
//                System.out.println(counter);
//                counter++;
//            }
//        }
        // prints 900 times

//        int counter = 1;
//        for (int j = 0; j < 5; j++) {
//            for (int k = 5; k > j; k--) {
//                System.out.println("hi");
//                System.out.println(counter);
//                counter++;
//            }
//        }
        // prints 15 times

//        int x = 2;
//        while (x < 162) {
//            x *= 3;
//        }
//        System.out.println(x);
        // 162


//        int x = 0;
//        for (int i=0; i<6; i++) {
//            x += i;
//        }
//        System.out.println(x);
        // 15

//        for (int k=0; k<10; k++) {
//            System.out.println(k);
//        }
//        System.out.println("final value of k is " + k);
        // WILL NOT COMPILE

//        for (int j=0; j<1000; ) {
//            System.out.println("Hello");
//        }
        // WILL COMPILE

//        for (int j=0; j<1000; j++)  {
//            j--;
//        }
        // WILL COMPILE

//        for (int n=0; n<10; n--) {
//            System.out.println(n);
//        }
        // Syntactically correct but is not semantically correct (Logical)

//        int i=1;
//        while(i<20) {
//            i++;
//            System.out.println(i);
//        }
//
//        int valueA = 2;
//        int valueB = 21;
//        for(int j=valueA; j<valueB; j++) {
//            System.out.println(j);
//        }
        // SAME LOOPS


//        for(int i=6; i>=0; i--) {
//            System.out.println(i);
//        }
//
//        int valueA = 6;
//        int valueB = -1;
//        int j=valueA;
//        while(j>valueB) {
//            System.out.println(j);
//            j--;
//        }
        // SAME LOOP

//        Scanner object = new Scanner(System.in);
//        double userNumber;
//        System.out.print("Enter number > 0: ");
//        while(true){
//
//            userNumber = object.nextDouble();
//            if (userNumber >= 0){
//                System.out.println("Good.");
//                break;
//            }
//            System.out.println("Try again, enter positive number.");
//        }


//        Scanner object = new Scanner(System.in);
//        double userNumber;
//        System.out.print("Enter number > 0: ");
//        while (true) {
//
//            userNumber = object.nextDouble();
//            if (userNumber > 0) {
//                System.out.println("Good.");
//                break;
//            } else {
//                System.out.println("Try again, enter positive number.");
//            }
//        }

//        Scanner object = new Scanner(System.in);
//        System.out.println("Enter 10 names.");
//        for (int i = 0; i<10; i++ ){
//            System.out.printf("Hello %s\n",object.next());
//        }

    }

    public static void notes_zone() {


//        Random generator = new Random();
//        for (int i = 0; i< 1000; i++){
//            int num = generator.nextInt(31)-10 ;
//            System.out.println();
//
//            // from -10 to 20
//
//        }

//        double d = 123123;
//        String s = d + "";
//        String s = Double.toString(d);
//        String s = "" + d;
//        System.out.println(s.getClass().getAnimalName());

    }
}