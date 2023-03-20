import java.util.Random;

public class PracticeQuestion3 {
    public static void main(String args[]) {
        Random generator = new Random();

        // indexed at 0 to right before bound
        // ADD 1 to make inclusive
        int x = generator.nextInt(13)- 6; // range 0 to 13
        int y = generator.nextInt(9) + 3;

        for(int i = 0; i <500; i++){
//            System.out.println(generator.nextInt(3)); // from 0 to 2
//            System.out.println(generator.nextInt(3) + 1); // from 1 to 3

//            System.out.println(generator.nextInt(101)); // from 0 to 100 INCLUSIVE
//            System.out.println(generator.nextInt(19) - 9); // from -10 to 10 EXCLUSIVE
//            System.out.println(generator.nextInt(19) - 9); // Range is 19 values,

//            System.out.println(generator.nextInt(13)- 6);



            // Range 0 to 100
            System.out.println(generator.nextInt(101)); // 0 to 100 Inclusive

            // Range 0 to 18, -9 to 9
            System.out.println(generator.nextInt(19) - 9); // from -10 to 10 Exclusive or -9 to 9

            // Range 0 to 8 , 3 to 11
            System.out.println(generator.nextInt(9) + 3); // 3 to 11

            // Range 0 to 12, -6 to 6
            System.out.println(generator.nextInt(13)- 6); // -6 to 6



        }
    }
}
