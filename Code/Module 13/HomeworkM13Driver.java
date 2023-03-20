
public class HomeworkM13Driver {

    public static void main(String[] args) {
        System.out.println("******TESTING SUM MULTIPLES");
        int[] numbers = {10, 3, 6, 2, 1, 4};
        System.out.println("Sum is 22: " + sumAllMultiples(numbers, 2));
        System.out.println("Sum is 10: " + sumAllMultiples(numbers, 5));
        System.out.println("Sum is  0: " + sumAllMultiples(numbers, 7));

        System.out.println("\n\n******TESTING Q WITHOUT U");
        System.out.println("quite: \t\tfalse: " + qWithoutFollowingU("quite"));
        System.out.println("equal: \t\tfalse: " + qWithoutFollowingU("equal"));
        System.out.println("nonsensewordqu: false: " + qWithoutFollowingU("nonsensewordqu"));
        System.out.println("QUOTE: \t\tfalse: " + qWithoutFollowingU("QUOTE"));
        System.out.println("\"\": \t\tfalse: " + qWithoutFollowingU(""));
        System.out.println("qat: \t\ttrue: " + qWithoutFollowingU("qat"));
        System.out.println("cinq: \t\ttrue: " + qWithoutFollowingU("cinq"));
        System.out.println("nonsenseqword: \ttrue: " + qWithoutFollowingU("nonsenseqword"));
        System.out.println("nonsenseqwordwithaulateron: \ttrue: " + qWithoutFollowingU("nonsenseqwordwithaulateron"));
        System.out.println("q: \t\ttrue: " + qWithoutFollowingU("q"));
        System.out.println("qq: \t\ttrue: " + qWithoutFollowingU("qq"));
        System.out.println("Qtip: \t\ttrue: " + qWithoutFollowingU("Qtip"));
        System.out.println("hello: \t\tfalse: " + qWithoutFollowingU("hello"));
        System.out.println("q: \t\ttrue: " + qWithoutFollowingU("q"));
        System.out.println("qq: \t\ttrue: " + qWithoutFollowingU("qq"));
        System.out.println("qu: \t\tfalse: " + qWithoutFollowingU("qu"));
        System.out.println("uq: \t\ttrue: " + qWithoutFollowingU("uq"));
        System.out.println("aqua: \t\tfalse: " + qWithoutFollowingU("aqua"));
        System.out.println("ava: \t\tfalse: " + qWithoutFollowingU("ava"));

    }

    public static int sumAllMultiples(int[] numbers, int multipleNumber) {
        return sumAllMultiplesHelper(numbers, multipleNumber, 0);

    }

    public static int sumAllMultiplesHelper(int[] numbers, int multipleNumber, int index) {
        if (index + 1 > numbers.length) {
            return 0;
        } else if (numbers[index] % multipleNumber == 0) {
            return sumAllMultiplesHelper(numbers, multipleNumber, index + 1) + numbers[index];
        } else {
            return sumAllMultiplesHelper(numbers, multipleNumber, index + 1);
        }
    }


    public static boolean qWithoutFollowingU(String word) {
        return qWithoutFollowingUHelper(word, 0);
    }

    public static boolean qWithoutFollowingUHelper(String word, int index) {
        int stringLength = word.length();
        if (index + 1 > stringLength) {
            return false;
        } else if (Character.toLowerCase(word.charAt(index)) == 'q') {
            if (index + 1 == stringLength) {
                return true;
            } else if (Character.toLowerCase(word.charAt(index + 1))  != 'u') {
                return true;
            }
            return false;

        } else {
            return qWithoutFollowingUHelper(word, index + 1);
        }
    }
}
