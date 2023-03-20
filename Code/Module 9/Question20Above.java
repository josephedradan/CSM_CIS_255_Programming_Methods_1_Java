public class Question20Above {
    public static void main(String[] args) {
        try {
            int num = 99; // output is 723
//            int num = -421; // output is 67813
//            int num = 0; // 457813

            sampleMethod(num);
            System.out.print("1");
        } catch (OtherException ex) {
            System.out.print("2");
        }
        System.out.print("3");
    }

    public static void sampleMethod(int n) throws OtherException {
        try {
            if (n > 0) {
                throw new OtherException();
            } else if (n < 0) {
                throw new NegativeNumberException();
            } else {
                System.out.print("4");
            }
            System.out.print("5");
        } catch (NegativeNumberException ex) {
            System.out.print("6");
        } finally {
            System.out.print("7");
        }
        System.out.print("8");
    }
}
