public class PracticeQuestions {
    public static void main(String args[]) {
        questions();

    }

    public static void questions() {
        int num = 4;
        num += 3;
        num /= 3;
        num = num * (3 + num);

        System.out.println(num);

        int n = 3;
        double test1 = Math.pow(n, 2);
        double test2 = Math.pow(test1, 3);

        System.out.println(test2);

        double dub = 3;
        double test3 = dub *= 4;
        double test4 = dub = dub / 5;
        double test5 = dub -= 7;

        int a = 2, b = 3, c = 5, d = 6;
        double x = 3.0, y = 4.0;
        double test6, test7, test8, test9;

        test6 = ((d / c) + (c - d)) * (a + b);
        test7 = (c / b) + (c / y);
        test8 = (x + y) / (c / d); // Adding Int and Double is bad idea results in inf and Not 8.4
        test9 = (y / x) + (b / a);

        System.out.println(test8);
    }

}
