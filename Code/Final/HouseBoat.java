public class HouseBoat extends House implements Comparable<HouseBoat> {
    private String houseBoatName;

    public HouseBoat(int numberOfBedrooms, boolean forSale, String houseBoatName) {
        super(numberOfBedrooms, forSale);
        this.houseBoatName = houseBoatName;
    }

    public String getHouseBoatName() {
        return houseBoatName;
    }

    public void setHouseBoatName(String houseBoatName) {
        this.houseBoatName = houseBoatName;
    }

    @Override
    public String toString() {
        return String.format("%s\nHouseBoat name: %s",
                super.toString(),
                houseBoatName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HouseBoat) {
            HouseBoat otherHouseBoat = (HouseBoat) obj;

            if (!this.houseBoatName.equalsIgnoreCase(otherHouseBoat.houseBoatName)) {
                return false;
            }
            if (this.getNumberOfBedrooms() != (otherHouseBoat.getNumberOfBedrooms())) {
                return false;
            }
            return true;
        }
        return false;
    }

    // Look at midterm's Highschool or Module 7 Examples Employee
    @Override
    public int compareTo(HouseBoat otherHouseBoat) {
        int differenceHouseBoatName = this.houseBoatName.compareToIgnoreCase(otherHouseBoat.houseBoatName);
        int differenceBedrooms = this.getNumberOfBedrooms() - otherHouseBoat.getNumberOfBedrooms();

        if (this.houseBoatName.equalsIgnoreCase(otherHouseBoat.houseBoatName)) {
            // if name is the same then do diff in bedrooms
            return differenceBedrooms;
        } else {
            // if name is diff then give difference
            return differenceHouseBoatName;
        }
    }
}
