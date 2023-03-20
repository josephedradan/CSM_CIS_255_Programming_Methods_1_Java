import java.util.Arrays;

public abstract class Pet implements Comparable<Pet> {

    private String name;
    private int age;


    public static void main(String args[]) {
//        Pet cat1 = new Cat("Zig Boy", 112, "Black");
//        Pet cat2 = new Cat("Zig Boy",112,"Black");
//        Pet bird1 = new Bird("Falcon", 999, true);
//
//        System.out.println("\nDisplaying Objects");
//        System.out.println(cat1);
//        System.out.println(cat2);
//
//        System.out.println("\nCompare");
//        System.out.println(cat1.compareTo(cat2));
//
//        System.out.println("\nEquals");
//        System.out.println(cat1.equals(cat2));

        Pet[] pets = new Pet[5];

        pets[0] = new Cat("John", 999, "Red");
        pets[1] = new Cat("Bob", 12, "Green");
        pets[2] = new Cat("Susan", 100, "Blue");
        pets[3] = new Bird("Bob", 100, true);
        pets[4] = new Bird("Falcon", 123,true);

        int birdsSing = 0;

        for(Pet pet: pets){
            System.out.println("\n"+pet);

            if(pet instanceof Bird){
                Bird bird = (Bird) pet;
                if(bird.getCanSing()){
                    birdsSing++;
                }
            }
        }
        System.out.println("\nAmount of Birds that can sing is: " + birdsSing);
        System.out.println();
        Arrays.sort(pets);
        System.out.println();

        for(Pet pet: pets){
            System.out.println("\n"+pet);
        }
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String toString() {
        String s = "Name: " + name;
        s += "\nAge: " + age;
        return s;
    }

    public abstract void printVetAppointmentReminder();

    void compareToPrinter(String name1, int age1, String name2, int age2){
        System.out.println(String.format("\"%s, %s years old\" would come before \"%s, %s years old\"",
                name1, age1, name2, age2));
    }
    @Override
    public int compareTo(Pet otherPet) {

        if (name.equalsIgnoreCase(otherPet.name)) {
            if (age < otherPet.age) {
                compareToPrinter(name, age, otherPet.name, otherPet.age);
                return age - otherPet.age;
            }
            if(age > otherPet.age) {
                compareToPrinter(otherPet.name, otherPet.age, name, age);
                return age - otherPet.age;
            }
        }

        int difference = name.compareToIgnoreCase(otherPet.name);
        // name given less than this.name
        if (difference < 0) {
            compareToPrinter(name, age, otherPet.name, otherPet.age);
            return difference;
        }

        // name given greater than this.name
        if (difference > 0) {
            compareToPrinter(otherPet.name, otherPet.age, name, age);
            return difference;
        }
        System.out.println("They have the same Name and Age");
        return 0;
    }

}