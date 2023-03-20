public class Tester {

    public static void main(String[] args) {

        Goldfish goldie = new Goldfish("Jarold");
        Turtle turtle = new Turtle("Sheldon");
        Dog doggie = new Dog("Jan");
        Otter otto = new Otter("Otto");
        BlueWhale dory = new BlueWhale("Dory");

        System.out.println(goldie.getHomeCareInstructions());
        System.out.println(turtle.getHomeCareInstructions());
        System.out.println(doggie);
        System.out.println(otto);
        System.out.println(dory);


    }
}
