import java.beans.Expression;

public class question_8 {
    /*
    // 8
    statement1;
    statement6;
    statement9;
    statement10;
    statement2;
    statement4;
    statement5;

    // 9
    statement1;
    statement9;
    statement3;
    statement4;
    statement5;

    // 10
    statement1;
    statement7;
    statement9;
    statement10;
    statement2;
    statement4;
    statement5;


    number 11 ??????  type ExceptionM,
    DO NOT GET JEBAITED
     */
    public static void main(String[] args) {
        try {
            boolean a = false;
            System.out.println("statement1;");
            method1();
            System.out.println("statement2;");

            if ( a == true){
                throw new ExceptionA();
            }
        } catch (ExceptionA ex) {
            System.out.println("statement3;");
        } finally {
            System.out.println("statement4;");
        }
        System.out.println("statement5;");
    }
    public static void method1() throws ExceptionA {
        try {
            boolean a = false;
            boolean b = false;
            boolean c = false;
            boolean m = true;


            if ( a == true){
                throw new ExceptionA();
            }
            if (b == true){
                throw new ExceptionB();
            }
            if (c == true){
                throw new ExceptionC();
            }
            if (m == true){
                throw new ExceptionM();
            }
            System.out.println("statement6;");
        } catch (ExceptionB ex) {
            System.out.println("statement7;");
        } catch (ExceptionC ex) {
            System.out.println("statement8;");
        } catch (ExceptionM ex) {
            System.out.println("FUCK OFF;");
        } finally {
            System.out.println("statement9;");
        }
        System.out.println("statement10;");
    }

    private static class ExceptionA extends Exception {
    }

    private static class ExceptionB extends Exception  {
    }

    private static class ExceptionC extends Exception  {
    }

    private static class ExceptionM extends Exception {
    }
}
