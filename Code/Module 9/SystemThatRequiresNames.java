import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemThatRequiresNames {

    public static void main(String args[]) {
        List<String> namesList = new ArrayList();
        namesList.add("Joseph");
        namesList.add("Bob");
        namesList.add("Dude");
        namesList.add("Meme");

        String name = "Meme";
        String name2 = "Guy";

        System.out.println(Arrays.toString(namesList.toArray()));
        checkAndAddUserName(name, namesList);
        System.out.println(Arrays.toString(namesList.toArray()));
        checkAndAddUserName(name2, namesList);
        System.out.println(Arrays.toString(namesList.toArray()));

    }

    // This code works with my tester.
    public static void checkAndAddUserName(String name, List list) {
        try {
            if (list.contains(name)) {
                throw new FoundNameInListException(name);
            } else {
                list.add(name);
                System.out.println(String.format("Name %s is added in given list!",
                        name));
            }
        } catch (FoundNameInListException e) {
            System.out.println(String.format("Name %s is in given list!",
                    e.getMessage()));
        }
    }
}
