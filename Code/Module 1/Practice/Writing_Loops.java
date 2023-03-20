import java.util.stream.IntStream;

public class Writing_Loops {
    public static void main(String args[]) {
        sumOfRangeIntegers(0,10);

    }

    public static void sumOfRangeIntegers(int start, int end) {
        // python would be print(sum(range(1,11)))
        System.out.println(
                IntStream
                        .range(start, end+1) // n to n-1
                        .sum());
        // python lambda would be print(reduce(lambda x,y: x+y, range(1,11)))
        System.out.println(
                IntStream
                        .range(start, end+1) // n to n-1
                        .reduce(((x,y) -> x+y)).getAsInt());
        // Jesus... this looks disgusting.


    }
}
