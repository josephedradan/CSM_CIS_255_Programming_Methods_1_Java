public class House {
    private int numberOfBedrooms;
    private boolean forSale;

    public static void main(String args[]){
        House bob = new House(23,true);
        System.out.println(bob);

        System.out.println();

        HouseBoat bob2 = new HouseBoat(132,true, "Unsinkable II");
        System.out.println(bob2);
        System.out.println();

        HouseBoat bob3 = new HouseBoat(132,true, "Unsinkable III");
        System.out.println(bob2);
        System.out.println();

        HouseBoat bob4 = new HouseBoat(132,true, "Unsinkable II");
        System.out.println(bob2);
        System.out.println();

        System.out.println("Equals time");
        System.out.println(bob2.equals(bob3));
        System.out.println(bob3.equals(bob2));

        System.out.println(bob2.equals(bob4));
        System.out.println(bob4.equals(bob2));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        HouseBoat test1 = new HouseBoat(1,true,"A");
        HouseBoat test2 = new HouseBoat(1,true,"A");
        HouseBoat test3 = new HouseBoat(42,true,"A");
        HouseBoat test4 = new HouseBoat(1,true,"C");

        System.out.println(test1.compareTo(test1));
        System.out.println(test1.compareTo(test2));
        System.out.println(test1.compareTo(test3)); // -41 is how much test3 needs to be test1 in bedrooms AKA test 1 is losing
        System.out.println(test1.compareTo(test4)); // -2 is how much test4 needs to be test1 in name AKA test1 is losing

    }

    public House() {
        this(1, false);
    }

    public House(int numberOfBedrooms, boolean forSale) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.forSale = forSale;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        if(numberOfBedrooms > 0){
            this.numberOfBedrooms = numberOfBedrooms;
        }else{
            System.out.println("Invalid number of Bedrooms");
        }
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    @Override
    public String toString() {
        return String.format("Number of Bedrooms: %s\nFor Sale?: %s",
                numberOfBedrooms,
                forSale);
    }
}
