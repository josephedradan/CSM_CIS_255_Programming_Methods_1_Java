public class M9_PracticeQuestion {

    public static void main (String args[]){

        /*
        1. no exceptions are thrown
        2. an ExceptionA is thrown in statement8
        3. an ExceptionB is thrown in statement8
        4. an ExceptionC is thrown in statement8
        5. an ExceptionD is thrown in statement8

        Answers
        1. 1, 7, 8, 9, 12, 13, 2, 5, 6
        2. 1, 7, 10, 12, 13, 2, 5, 6
        3. 1, 7, 11, 12, 13, 2, 5, 6
        4. 1, 7, 12, 4, 5, 6
        5. 1, 7, 12, 5, Crash

         */
        methodA();
//        test();
    }
    public static void methodA() {


        System.out.println("state1");
        try {
            methodB();
            System.out.println("state2");

        } catch(ArithmeticException ex) { // B
            System.out.println("state3");
        } catch(NullPointerException ex) { // C
            System.out.println("state4");
        } finally {
            System.out.println("state5");
        }
        System.out.println("state6");
    }

    public static void methodB() {
        System.out.println("state7");

        try {

            // ExceptionA
            // "akki" is not a number
//            int num = Integer.parseInt ("akki");

            // ExceptionB
//            System.out.println(1/0);

            // ExceptionC
//            String a = null; //null value
//            System.out.println(a.charAt(0));

            // ExceptionD // No catch for it, will crash
//            int a[] = new int[5];
//            a[6] = 9; // accessing 7th element in an array of
//            // size 5

            System.out.println("state8"); // this statement generates the exception when one is thrown

            System.out.println("state9");
        } catch(NumberFormatException  ex) { // A
            System.out.println("state10");
        } catch(ArithmeticException ex) { // B
            System.out.println("state11");
        } finally {
            System.out.println("state12");
        }
        System.out.println("state13");
    }

    public static void test (){
        System.out.println("FUCK YOU");
        try{
            System.out.println(1/0);
            System.out.println("USDKLFJS:DFKLSJDFKL:SJDFKLSDJF");
        } catch (ArithmeticException e){
            System.out.println("ARITHMETIC ERROR");
        }finally {
            System.out.println("IM FINALLY BITCH");
        }
        System.out.println("DUDE");

    }
}
