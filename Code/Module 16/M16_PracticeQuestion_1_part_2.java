public class M16_PracticeQuestion_1_part_2 {
    // no exceptions are thrown
    /*
    statement1;
    statement6;
    statement11;
    statement14;
    statement15;
    statement7;
    statement9;
    statement10;
    statement2;
    statement4;
    statement5;
     */

    // an exception of type ExceptionS is thrown before statement11 in methodB
    /*
    statement1;
    statement6;
    ExceptionS
    statement12;
    statement14;
    statement15;
    statement7;
    statement9;
    statement10;
    statement2;
    statement4;
    statement5;
     */

    // an exception of type ExceptionR is thrown before statement11 in methodB
    /*
    statement1;
    statement6;
    ExceptionR
    statement14;
    statement8;
    statement9;
    statement10;
    statement2;
    statement4;
    statement5;
     */

    // exception of type ExceptionQ is thrown before statement11 in methodB
    /*
    statement1;
    statement6;
    ExceptionQ
    statement14;
    statement9;
    statement3;
    statement4;
    statement5;
     */

    // exception of type ExceptionC is thrown before statement11 in methodB
    /*
    Compile time error
     */

    public static void main(String[] args) {
        try {
            boolean q = false;

            System.out.println("statement1;");

            if (q == true) {
                throw new ExceptionQ();
            }

            methodA();
            System.out.println("statement2;");
        } catch (ExceptionQ ex) {
            System.out.println("statement3;");
        } finally {
            System.out.println("statement4;");
        }
        System.out.println("statement5;");
    }

    public static void methodA() throws ExceptionQ {
        try {
            boolean r = false;

            System.out.println("statement6;");

            if (r == true) {
                throw new ExceptionR();
            }

            methodB();
            System.out.println("statement7;");
        } catch (ExceptionR ex) {
            System.out.println("statement8;");
        } finally {
            System.out.println("statement9;");
        }
        System.out.println("statement10;");
    }

    public static void methodB() throws ExceptionR, ExceptionQ  {
        try {
            boolean s = false;
            boolean r = false;
            boolean q = true;
            boolean t = false;

//            throw new ExceptionC();

            if (q == true) {
                throw new ExceptionQ();
            }

            if (r == true) {
                throw new ExceptionR();
            }

            if (s == true) {
                throw new ExceptionS();
            }

            if (t == true) {
                throw new ExceptionT();
            }


            System.out.println("statement11;");
        } catch (ExceptionS ex) {
            System.out.println("statement12;");
        } catch (ExceptionT ex) {
            System.out.println("statement13;");
        } finally {
            System.out.println("statement14;");
        }
        System.out.println("statement15;");
    }

    private static class ExceptionQ extends Exception {
        public ExceptionQ() {
            System.out.println("ExceptionQ");
        }
    }

    private static class ExceptionR extends Exception {
        public ExceptionR() {
            System.out.println("ExceptionR");
        }
    }

    private static class ExceptionS extends Exception {
        public ExceptionS() {
            System.out.println("ExceptionS");
        }
    }

    private static class ExceptionT extends Exception {
        public ExceptionT() {
            System.out.println("ExceptionT");
        }
    }








//    public static void main(String[] args) {
//        try {
//            statement1;
//            methodA();
//            statement2;
//        } catch (ExceptionQ ex) {
//            statement3;
//        } finally {
//            statement4;
//        }
//        statement5;
//    }
//
//    public static void methodA() {
//        try {
//            statement6;
//            methodB();
//            statement7;
//        } catch (ExceptionR ex) {
//            statement8;
//        } finally {
//            statement9;
//        }
//        statement10;
//    }
//
//    public static void methodB() {
//        try {
//            statement11;
//        } catch (ExceptionS ex) {
//            statement12;
//        } catch (ExceptionT ex) {
//            statement13;
//        } finally {
//            statement14;
//        }
//        statement15;
//    }
}
