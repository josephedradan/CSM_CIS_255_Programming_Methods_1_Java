import com.sun.nio.file.ExtendedWatchEventModifier;

public class Question23Above {
    /*

NumberFormatException ExceptionQ

     // "akki" is not a number
    int num = Integer.parseInt ("akki");

ArithmeticException ExceptionR

    System.out.println(1/0);

NullPointerException ExceptionS

    String a = null; //null value
    System.out.println(a.charAt(0));

ArrayIndexOutOfBoundsException ExceptionT

    int[] array = new int[5];
    int boom = array[10]; // Throws the exception

     */


    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            methodA();
            System.out.println("statement2");

        } catch (NumberFormatException ex) { // ExceptionQ ex
            System.out.println("statement3");
        } finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");

    }

    public static void methodA() {
        try {
            System.out.println("statement6");

            methodB();
            System.out.println("statement7");

        } catch (ArithmeticException ex) { // ExceptionR ex
            System.out.println("statement8");

        } finally {
            System.out.println("statement9");

        }
        System.out.println("statement10");

    }

    public static void methodB() {
        try {
            // 24 ExceptionS
//            String a = null; //null value
//            System.out.println(a.charAt(0));

            // 25 ExceptionR
//            System.out.println(1/0);

            // 26 ExceptionQ
//            // "akki" is not a number
//            int num = Integer.parseInt ("akki");

            // 27 ExceptionC
//            throw new RuntimeException();
//            throw new IllegalArgumentException("ClassNotFoundException");

            System.out.println("statement11");

        } catch (NullPointerException ex) { // ExceptionS ex
            System.out.println("statement12");

        } catch (ArrayIndexOutOfBoundsException ex) { // ExceptionT ex
            System.out.println("statement13");

        } finally {
            System.out.println("statement14");

        }
        System.out.println("statement15");

    }
}

