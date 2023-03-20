import java.util.*;

//        Coded and tested by John San Jose & Joseph Edradan
//        CIS 255, Masters

public class AnimalKingdomDriver {
    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Bat("Count Batula"));
        animalList.add(new BlueWhale("Blubby Blubs"));
        animalList.add(new Dog("Mr. Wooferson"));
        animalList.add(new Emu("Outback Ollie"));
        animalList.add(new Goldfish("Sammy Swimmer"));
        animalList.add(new Otter("Henry Handholder"));
        animalList.add(new Parakeet("Songbird Stu"));
        animalList.add(new Turtle("Shelly Silversteen"));

        ArrayList<Animal> animalList2 = new ArrayList<>();
        animalList2.add(new Dog("Mr. Wooferson"));
        animalList2.add(new BlueWhale("Mr. Wooferson"));

        System.out.println("***** Here are all the animals.");
        for(Animal animal : animalList) {
            // YOUR CODE HERE!
            System.out.println(animal);
        }

        System.out.println("\n\n***** Here are just the mammals.");
        for(Animal animal : animalList) {
            // YOUR CODE HERE! USE POLYMORPHISM!
            if(animal instanceof Mammal) {
                Mammal mammal = (Mammal) animal;
                System.out.println(mammal.getNameOfAnimal());
            }
        }

        System.out.println("\n\n***** Here are the winged animals along with information about whether they can fly.");
        for(Animal animal : animalList) {
            // YOUR CODE HERE! USE POLYMORPHISM!
            if(animal instanceof Winged) {
                Winged wingedAnimal = (Winged) animal;
                System.out.print(animal.getNameOfAnimal());
                System.out.print((wingedAnimal.flies() ? " can " : " cannot " ) + "fly.\n");
            }

        }

        System.out.println("\n\n***** Here are the adoptable animals along with their care instructions.");
        for(Animal animal : animalList) {
            // YOUR CODE HERE! USE POLYMORPHISM!
            if(animal instanceof Adoptable) {
                Adoptable pet = (Adoptable) animal;
                System.out.print(animal.getNameOfAnimal());
                System.out.printf("'s care instructions:\n%s\n",
                        pet.getHomeCareInstructions());
            }
        }


        System.out.println("\n\n***** Here are the animals that can dwell in water, along with whether they can also live on land.");
        for(Animal animal : animalList) {
            // YOUR CODE HERE! USE POLYMORPHISM!
            if(animal instanceof WaterDweller) {
                WaterDweller aqueousAnimal = (WaterDweller) animal;
                System.out.print(animal.getNameOfAnimal());
                System.out.print(" lives in water " +
                                (aqueousAnimal.livesOnLand() ? "and can also " : "but cannot ") +
                                "live on land.\n");
            }

        }

        System.out.println("\n\n***** Testing Equals method. \"Two animals are logically equivalent if they have the same name and warm blooded status.\"");
        for(Animal animal : animalList) {
            for(Animal animal2 : animalList2){
                if(animal.equals(animal2)){
                    System.out.println(String.format("%s the %s who is %s in %s " +
                                    "is the same as %s the %s who is %s in %s",
                            animal.getNameOfAnimal(),
                            animal.getClass().getName(),
                            animal.isWarmBlooded(),
                            "animalList",
                            animal2.getNameOfAnimal(),
                            animal2.getClass().getName(),
                            animal2.isWarmBlooded(),
                            "animalList2"
                    ));
                }
            }
        }
        System.out.println("\nCoded by Joseph Edradan and John San Jose");


    }
}