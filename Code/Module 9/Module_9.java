import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Module_9 {
    public static void main(String args[]) {
//        test_zone_1();
//        doSomething(2);
//        methodA();
//        test_zone_2();
//        fileIO();
        createValidEmailsFile(
                "C:\\Users\\Wildstraywolf\\Documents\\College of San Mateo Classes\\CSM CIS 255 Programming Methods 1 Java\\Java Code\\Module 9\\Question28TextFile",
                "C:\\Users\\Wildstraywolf\\Documents\\College of San Mateo Classes\\CSM CIS 255 Programming Methods 1 Java\\Java Code\\Module 9\\Question28TextFileOut");

        askUserForPositiveNumber();
    }

    private static void askUserForPositiveNumber() {
        boolean isPositive = false;

        int inputInt;
        while (!isPositive) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Value: ");
                inputInt = scanner.nextInt();

                if (inputInt < 1) {
                    System.out.println("Input Value is Negative");
                } else if (inputInt >= 1) {
                    System.out.println("Congratulations!");
                    isPositive = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Value is not a number try again");
            }
        }
    }

    private static void fileIO() {
    }

    public static void createValidEmailsFile(String filenameInput, String filenameOutput) {

        PrintWriter fileOut = null;
        try {
            Scanner fileScan = new Scanner(new FileReader(new File(filenameInput)));
            fileOut = new PrintWriter(new BufferedWriter(new FileWriter(filenameOutput)));

            while (fileScan.hasNext()) {
                String fileLine = fileScan.nextLine();

                String[] line = fileLine.split(",");
                for (String text : line) {
                    if (text.contains("@")) {
                        fileOut.print(text.replaceAll(" ", "") + "\n");
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }

    private static void test_zone_2() {
        // 19
        String str = "";
        try {
            str.charAt(2); // Will cause the exception StringIndexOutOfBoundsException

//            str.equals(str);
//            str.length();
//            str.replace('a', 'A');

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    private static void test_zone_1() {

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("FUCK YOU");
        }
        // CAN ONLY HAVE 1 FINAL
        // FINAL WILL ALL WAYS RUN
        finally {
            System.out.println("Final 1 WILL ALL WAYS RUN");

        }

        try {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("MUST HAVE 1 CATCH");
        }

        // CHECK THIS SHIT OUT A FORCE THROW WOW DANK


        try {
            // This Will Crash
//            throw new ArithmeticException("sdf");

            throw new NullPointerException("FUCK YOU");
        } catch (NullPointerException e) {
            System.out.println(e);
        }


        // 14 and above
        try {
            int x = Integer.parseInt("FUCK YOU");
        } catch (NumberFormatException e) {
            // NumberFormatException IS UNCHECKED
            System.out.println("YOU CANT MAKE A INT FROM THIS STRING ");
        }
    }

    // Not Valid
//    public static void method(int n) throw IllegalArgumentException {
//
//    }
    // Valid (Add the s ending)
    public static void method(int n) throws IllegalArgumentException {

    }

    public void someMethod() throws Exception {

    }
    // 16

    // Will not compile
//    public void doSomething(int n) {
//
//        if(n<0){
//            throw new Exception("Negative Number");
//
//        }
//
//    }

    // Will compile

    public static void doSomething(int number) throws ArithmeticException {

        if (number < 0) {
        }
        // If shit fails in here then the Arithmetic Exception will be returned which then you can catch
        // You can also use a try catch here too
    }

    // Number 18
    public static void methodA() {
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    public static void methodB() {
        methodC();

    }

    public static void methodC() {
        throw new NullPointerException("FUCK YOU");

    }
}
