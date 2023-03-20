import java.util.ArrayList;
import java.util.List;

public class HouseDriver {
    public static void main(String args[]){

        List<House> houseList = new ArrayList<>();
        houseList.add(new House(21, true));
        houseList.add(new House(1, true));
        houseList.add(new House(55, false));
        houseList.add(new House(4, false));
        houseList.add(new HouseBoat(24, true, "Bob"));
        houseList.add(new HouseBoat(32, true, "Dank"));
        houseList.add(new HouseBoat(5, false, "Zank"));
        houseList.add(new HouseBoat(2, false, "Memes"));

        int numberHouseBoatStartingWithZ = 0;

        for(House house : houseList){
            System.out.println(house);
            if (house instanceof HouseBoat){
                if (((HouseBoat) house).getHouseBoatName().contains("Z")){
                    numberHouseBoatStartingWithZ++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Number of HouseBoats with \"Z\" in their name: " + Integer.toString(numberHouseBoatStartingWithZ));
    }
}
