import java.util.*;

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

//		Bird test2 = new Emu("Birdo");
//      System.out.println(test2.isWarmBlooded());

        ArrayList<Animal> animalList2 = new ArrayList<>();
        animalList2.add(new Dog("Mr. Wooferson"));
        animalList2.add(new BlueWhale("Mr. Wooferson"));

		System.out.println("***** Here are all the animals.");
		for(Animal animal : animalList) {
            System.out.println(animal);
		}

		System.out.println("\n\n***** Here are just the mammals.");
		for(Animal animal : animalList) {
			if(animal instanceof Mammal){
                System.out.println(String.format("%s the %s",
                        animal.getAnimalName(),
                        animal.getClass().getName()));
            }
		}

		System.out.println("\n\n***** Here are the winged animals along with information about whether they can fly.");
		for(Animal animal : animalList) {
            if(animal instanceof Winged){
                Winged winged = (Winged) animal;
                System.out.println(String.format("%s the %s %s %s",
                        animal.getAnimalName(),
                        Winged.class.getName(),
                        animal.getClass().getName(),
                        winged.Flies() ? "can fly.": "cannot fly."));
            }
		}

		System.out.println("\n\n***** Here are the adoptable animals along with their care instructions.");
		for(Animal animal : animalList) {
            if(animal instanceof Adoptable){
                Adoptable adoptable = (Adoptable) animal;
                System.out.println(String.format("%s the %s is %s. Here are the instructions for taking care of this %s:\n%s",
                        animal.getAnimalName(),
                        animal.getClass().getName(),
                        Adoptable.class.getName(),
                        animal.getClass().getName(),
                        adoptable.getHomeCareInstructions()));
            }
		}


		System.out.println("\n\n***** Here are the animals that can dwell in water (Aquatic), along with whether they can also live on land.");
		for(Animal animal : animalList) {
            if(animal instanceof Aquatic){
                Aquatic aquatic = (Aquatic) animal;
                System.out.println(String.format("%s the %s %s %s",
                        animal.getAnimalName(),
                        Aquatic.class.getName(),
                        animal.getClass().getName(),
                        aquatic.canLiveOnLand()? "can live on land!" : "cannot live on land."));
            }
		}


        System.out.println("\n\n***** Testing Equals method. \"Two animals are logically equivalent if they have the same name and warm blooded status.\"");
        for(Animal animal : animalList) {
            for(Animal animal2 : animalList2){
                if(animal.equals(animal2)){
                    System.out.println(String.format("%s the %s who is %s in %s " +
                                    "is the same as %s the %s who is %s in %s",
                            animal.getAnimalName(),
                            animal.getClass().getName(),
                            animal.isWarmBloodedString(),
                            "animalList",
                            animal2.getAnimalName(),
                            animal2.getClass().getName(),
                            animal2.isWarmBloodedString(),
                            "animalList2"
                    ));
                }
            }
        }
	}
}