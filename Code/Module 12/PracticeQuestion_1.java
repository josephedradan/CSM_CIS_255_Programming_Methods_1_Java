import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PracticeQuestion_1 {
    public static void main(String[] args){
        List<String> sList = new ArrayList();

        System.out.println(sList.toString());
        sList.add("carrot");
        System.out.println(sList.toString());
        sList.add("apple");
        System.out.println(sList.toString());
        sList.add("grape");
        System.out.println(sList.toString());
        sList.add("banana");
        System.out.println(sList.toString());
        System.out.println(sList.remove(0));
        System.out.println(sList.toString());
        System.out.println(sList.remove(0));
        System.out.println(sList.toString());
        sList.add("pineapple");
        System.out.println(sList.toString());
        sList.add("mango");
        System.out.println(sList.toString());
        System.out.println(sList.size());
        System.out.println(sList.toString());
        sList.add(2, "peach");
        System.out.println(sList.toString());
        sList.add(1, "plum");
        System.out.println(sList.toString());

    }
}

/*
[]
[carrot]
[carrot, apple]
[carrot, apple, grape]
[carrot, apple, grape, banana]
carrot
[apple, grape, banana]
apple
[grape, banana]
[grape, banana, pineapple]
[grape, banana, pineapple, mango]
4
[grape, banana, pineapple, mango]
[grape, banana, peach, pineapple, mango]
[grape, plum, banana, peach, pineapple, mango]
 */
// So

/*
[carrot]
[carrot, apple]
[carrot, apple, grape]
[carrot, apple, grape, banana]
[apple, grape, banana]
[grape, banana]
[grape, banana, pineapple]
[grape, banana, pineapple, mango]
[grape, banana, pineapple, mango]
[grape, banana, peach, pineapple, mango]
[grape, plum, banana, peach, pineapple, mango]
 */