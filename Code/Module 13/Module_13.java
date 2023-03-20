public class Module_13 {
    public static void main(String argsp[]) {
        // fuckme();

        // Question 4
        fibonacciRecusive2(6, 0); // 12 calls, NO ITS 25

        // Question 5
//        System.out.println(evenPosZero(5));
//        System.out.println(evenPosZero(0));

        // Question 6
        int[] s = new int[]{12, 3, 4, 545, 1};
//        System.out.println(s.length);

//        System.out.println(whoKnows(new int[]{}, new int[]{}, 0)); // Returns true if a and b have no elements
        // WRONG ITS NOT RIGHT

        // Question 7
        // Because the recursive call does not move the para
//        System.out.println(infiniteRecursion(5));

        // Question 8
        // None of these is correct, there is no infinite recursion in this method
//        infiniteRecursion2(2);
//        System.out.println();
//        infiniteRecursion2(1);
//        System.out.println();
//        infiniteRecursion2(0);
//        System.out.println();
//        infiniteRecursion2(-1);
//        System.out.println();
//        infiniteRecursion2(-2);

        // Question 9
        // Returns 1 if char b appears in String a at least once, and 0 otherwise
//        System.out.println(mysteryMethod("ccccaaaabbbcc",'z',6)); //

        // Question 10
//        System.out.println(noBaseCasePerhaps(1)); // true

        // Question 11
//        System.out.println(method1(100));
//        System.out.println(method2(100)); // true

        // Question 12
//        System.out.println(methodA(4)); // 4
        // Question 13
//        System.out.println(methodA(0)); // 0
        // Question 14
//        System.out.println(methodA(-3)); // 3

        // Question 15
//        System.out.println(secretMethod(7,3)); // 5

        // Question 16
//        System.out.println(secretMethod(7,8)); // y greater than x

        // Question 17
//        System.out.println(factorial(4) ); // 24

        // Question 18
//        System.out.println(factorial(-1)); // 1

        // Question 19
//        System.out.println(factorial(4)); // CALLED 3 TIMES, NO ITS 4

        // Question 20
        // What condition defines the base case for this method?
        // Base Case (x <= 1)

        // Question 21 and above
        int[] a = {3, 4, 2, 5, 7, 3, 2, 5, 3};

        // Question 21
//        System.out.println(foo(a, 3, 0));

        // Question 22
//        System.out.println(foo(a, 3, 4));factorial

        // Question 23
//        System.out.println(bar(a, 6));

        // Question 24
//        System.out.println(bar(a, 9));

        // Question 25
//        System.out.println(methodB("eieio",'e'));

        // Question 26
//        System.out.println(methodB("hello there",'h'));

        // Question 27
//        System.out.println(countEvens(new int[]{0,1,2,3,4,5,6}));
    }

    private static void fuckme() {
        fuckme();
    }

    public static int fibonacciRecusive(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecusive(n - 1) + fibonacciRecusive(n - 2);
        }
    }

    // Depth first
    public static int fibonacciRecusive2(int n, int a) {
        System.out.println("HIT");
//        System.out.println(a++);
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecusive2(n - 1, a) + fibonacciRecusive2(n - 2, a);
        }
    }

    public static boolean evenPosZero(int x) {
        if (x < 0)
            return false;

            // ??? what goes here

        else if (x == 0)
            return true;

        else
            return evenPosZero(x - 2);
    }

    public static boolean whoKnows(int[] a, int[] b, int j) {
        if (j == a.length) {
            return true;
        } else if (j == b.length) {
            return false;
        } else {
            return whoKnows(a, b, j + 1);
        }
    }

    public static int infiniteRecursion(int n) {
        if (n > 0) {
            return infiniteRecursion(n) - 2;
        } else {
            return 0;
        }
    }

    public static void infiniteRecursion2(int n) {
        if (n > 0) {
            System.out.println("here 1");
            infiniteRecursion2(n - 1);
        } else if (n < 0) {
            System.out.println("here 2");
            infiniteRecursion2(n + 1);
        } else {
            System.out.println("here 3");
        }
    }

    public static int mysteryMethod(String a, char b, int i) {
        if (i == a.length()) {
            return 0;
        } else if (b == a.charAt(i)) {
            return 1;
        } else {
            return mysteryMethod(a, b, i + 1);
        }
    }

    public static int noBaseCasePerhaps(int x) {
        if (x > 0) {
            return noBaseCasePerhaps(x - 1) + 1;
        } else {
            return noBaseCasePerhaps(x - 2) + 2;
        }
    }

    public static int method1(int x) {
        if (x > 0) {
            return method1(x - 1) + 1;
        } else {
            return 0;
        }
    }

    public static int method2(int x) {
        if (x > 0) {
            return 1 + method2(x - 1);
        } else {
            return 0;
        }
    }

    public static int methodA(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return 1 + methodA(n - 1);
        } else {
            return 1 + methodA(n + 1);
        }
    }

    public static int secretMethod(int x, int y) {
        if (x == y) {
            return 1;
        } else {
            return secretMethod(x - 1, y) + 1;
        }
    }

    public static int factorial(int x) {
        System.out.println("COUNTER");
        if (x > 1) {
            return x * factorial(x - 1);
        } else {
            return 1;
        }
    }

    public static int foo(int[] a, int b, int j) {
        if (j < a.length) {
            if (a[j] == b) {
                return foo(a, b, j + 1);
            } else {
                return foo(a, b, j + 1) + 1;
            }
        } else {
            return 0;
        }
    }

    public static int bar(int[] a, int j) {
        if (j < a.length) {
            return a[j] + bar(a, j + 1);
        } else {
            return 1;
        }
    }

    public static int methodB(String s, char c) {
        if (s.length() == 0) {
            return 0;
        } else {
            return (s.charAt(0) == c ? 1 : 0) + methodB(s.substring(1), c);
        }
    }

    public static int countEvens(int[] array) {
        return countEvensHelper(array, 0, array.length);
    }

    private static int countEvensHelper(int[] array, int start, int stop) {
        int count = 0;
        if (start == stop) {
            return count;
        } else {
            if (array[start] % 2 == 0) {
                count = 1 + countEvensHelper(array, start + 1, stop);
            }
            return count;
        }
    }
}
