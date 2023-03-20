import java.util.*;

public abstract class Animal {

    //Our common attributes with all animals
    private boolean bloodType;
    private String nameOfAnimal;

    //All animals can go by different names. ArrayList otherName stores it.
    private ArrayList<String> otherName = new ArrayList();

    public void addOtherName (String otherName){
        this.otherName.add(otherName);
    }

    //Grandparent constructor that only takes in the bloodType and the name
    //of the animal.
    public Animal(boolean bloodType, String nameOfAnimal) {

        this.bloodType = bloodType;

        if (!nameOfAnimal.equalsIgnoreCase("")) {
            this.nameOfAnimal = nameOfAnimal;
        } else {
            System.out.println("Improper name input.");
        }
    }


    //Our getters for our attributes with no setters because it would not
    //be logical to change their bloodtype but able to change the name.
    public boolean isWarmBlooded() {
        return bloodType;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setName(String nameOfAnimal) {
        if (!nameOfAnimal.equalsIgnoreCase(" ") && !this.nameOfAnimal.equalsIgnoreCase(nameOfAnimal)) {
            this.nameOfAnimal = nameOfAnimal;
        } else {
            System.out.println("Improper input for name of Animal\n");
        }
    }

    //Returns true if animal is warm blooded.
    private String isWarmBloodedStringConfigure() {
        return (this.isWarmBlooded() ? "Warm-Blooded.\n" : "Cold-Blooded.\n");

    }

    //Hidden service method that processes the otherNames ArrayList and returns it
    //as a string. Other methods do not need this since their inheriting the toString()
    //which uses this service only.
    private String processOtherNames() {
        String s = "";
        for (String names : otherName) {
            s += "- " + names + "\n";
        }

        return s;
    }

    //Overridden methods from Object class toString() and equals()
    @Override
    public String toString() {

        String s = "This animal's name is: " + this.getNameOfAnimal() + " and is " +
                this.isWarmBloodedStringConfigure() + "\nList of other names:\n" +
                processOtherNames();

        return s;

    }


    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Animal) {
            Animal animal = (Animal) obj;
            if (this.getNameOfAnimal().equalsIgnoreCase(animal.getNameOfAnimal()) &&
                    this.isWarmBlooded() == animal.isWarmBlooded())
            {
                return true;
            }
        }
        return false;
    }
}
