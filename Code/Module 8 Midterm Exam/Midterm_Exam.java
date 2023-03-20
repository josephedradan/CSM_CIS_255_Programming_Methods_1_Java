import java.util.Arrays;
import java.util.Random;


/*

Question 41
Which of the following is true regarding every Java class that you create from scratch?
    Any class I write classes can have 0 or 1 parent classes and any number of child classes.
        WRONG?????

 */
public class Midterm_Exam {
    int testthisshit = 0;
    public static void main(String args[]) {
//        Random generator = new Random();
//
//        int randomNumber = generator.nextInt(12) + 3;


//        Random generator = new Random();
//
//        int randomNumber = generator.nextInt(12) + 3;
//
//
//
//        for(int i = 0; i <500; i++){
//
//            System.out.println(generator.nextInt(7) + -3);
//
//
//        }


//        System.out.println(isPositiveAndEven(-2));

//        System.out.println(isPositiveAndEven(1,3,5));
//        System.out.println(isPositiveAndEven(1,2,5));
//        System.out.println(isPositiveAndEven(4,2,-4));
//        System.out.println(isPositiveAndEven(4,2,4));

//        String a = "1", b = "2";
//        int y = 5, z = 6;
//        System.out.println(a + b + y + z);

//        String a = "3", b = "4";
//        int y = 6, z = 7;
//        System.out.println(y + z + a + b);

        // 10 What is stored in text after the following code is executed?
        // YOU GOT THE WRONG ANSWER BECAUSE YOU DIDN'T READ QUESTION
//        String text = "I love this class.";
//        text.toUpperCase();
//        System.out.println(text.toUpperCase());

//        String text = "Java is cool!";
//        int result = text.length();
//        System.out.println(result);

//        String text = "Learning Java is fun.";
//        String result = text.substring(3, 7);
//        System.out.println(result);

//        String text = "Studying is stressful.";
//        int result = text.indexOf("s");
//        System.out.println(result);

//        int x[] = {3,17,2,22,9,7,6};
////        System.out.println(x[7]);
//
//        for (int j=0; j<x.length; j++) { x[j]++; }
//        System.out.println(Arrays.toString(x));

//        String[] number18 = {"hello", "there", "bye", "later"};
//        System.out.println(countLongWords(number18, 3));

//        int[] nums = {2, 4, 6};
//        int n = 8;
//
//        changeMe1(n, nums);
//
//        System.out.println(n);
//        System.out.println(nums[0]);


//
//        int[] nums2 = {1, 3, 5};
//        int n2 = 6;
//
//        changeMe2(n2, nums2);
//
//        System.out.println(n2);
//        System.out.println(nums2[0]);


    }
    // non static calling static
    public void nonStaticTest(){
        isPositiveAndEven(1);
    }
    public static void changeMe2(int number, int[] list) {
        number = 7;
        list = new int[10];
        list[0] = 7;
    }
    public static void changeMe1(int number, int[] list) {
        number++;
        list[0]++;
    }

    public static int countLongWords(String[] input, int stringLength) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > stringLength) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPositiveAndEven(int input) {
        if (input > 0 && input % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPositiveAndEven(int x, int y, int z) {
        if (isPositiveAndEven(x) && isPositiveAndEven(y) && isPositiveAndEven(z)) {
            return true;
        }
        return false;
    }

}
