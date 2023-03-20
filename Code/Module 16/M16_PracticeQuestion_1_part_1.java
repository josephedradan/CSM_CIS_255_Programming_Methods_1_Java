import java.util.Scanner;

public class M16_PracticeQuestion_1_part_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Even number or else!!!: ");

        try{
            int value;
            value = scan.nextInt();
            if (value%2 == 1){
                throw new OddNumberException(value);
            }
        }catch (OddNumberException e){
            System.out.println(e);
        }
    }
}
