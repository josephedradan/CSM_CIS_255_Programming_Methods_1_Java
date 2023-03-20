/*
Joseph Edradan
9/7/2018
Project 1: Battleship
CIS-255-OLH-CRN88669



Notes:
Made in 6 hours
Was doing a multi dimension then noticed that it would be too hard a couple hours in so had to improvise.
Didn't implement validating positions.
OH GOD I MESSED UP.


 */


import java.util.*;

public class Battleship {
    public static Scanner scannerObject = new Scanner(System.in);
    public static Random randomObject = new Random();



    public static void main(String[] args) {
        final int MAX_SHIP_SIZE = 5;
        final int MIN_SHIP_SIZE = 1;

//        System.out.println("Enter Battlefield length X.");
//        int fieldSizeX = scannerObject.nextInt();

        int fieldSizeX = 50;
        int maxMisses = 10;

        Field battleField = new Field(fieldSizeX);

        //////////////////////////////


//        System.out.println("Enter Player Ship name.");
//        String playerName = scannerObject.nextLine();


        Ship playerObject = new Ship("Player", battleField.giveShipAPosition(getRandomValue(MIN_SHIP_SIZE, MAX_SHIP_SIZE)), fieldSizeX, maxMisses);
        Ai computer_1 = new Ai("Computer 1", battleField.giveShipAPosition(getRandomValue(MIN_SHIP_SIZE, MAX_SHIP_SIZE)), fieldSizeX);
        Ai computer_2 = new Ai("Computer 2", battleField.giveShipAPosition(getRandomValue(MIN_SHIP_SIZE, MAX_SHIP_SIZE)), fieldSizeX);
        Ai computer_3 = new Ai("Computer 3", battleField.giveShipAPosition(getRandomValue(MIN_SHIP_SIZE, MAX_SHIP_SIZE)), fieldSizeX);


        // THIS COULD HAVE LOOKED BETTER
        boolean gameRunning = true;
        boolean play = true;


        while(play){
            while(gameRunning){
                System.out.printf("Enter a position to fire from %d to %d\n", 0, fieldSizeX);
                int firePosition = scannerObject.nextInt();

                if(computer_1.reciveHit(firePosition)){
                    playerObject.addHit();
                    System.out.println("Hit Computer 1");
                } else{
                    playerObject.addMiss();
                    System.out.println("Miss");
                }
                if(computer_2.reciveHit(firePosition)){
                    playerObject.addHit();
                    System.out.println("Hit Computer 2");
                } else{
                    playerObject.addMiss();
                    System.out.println("Miss");
                }
                if(computer_3.reciveHit(firePosition)){
                    playerObject.addHit();
                    System.out.println("Hit Computer 3");
                } else{
                    playerObject.addMiss();
                    System.out.println("Miss");
                }

                if(computer_1.getLife()+computer_2.getLife()+computer_3.getLife() == 0){
                    System.out.println("You win");
                    System.out.printf("You have %d Hits and %d Misses\n",playerObject.getHits(),playerObject.getMisses());
                    break;
                } else if(playerObject.numberOfMisses == 0){
                    System.out.println("You loss");
                    break;
                }
            }
            System.out.println("Do you want to play again? (y/n)");
            char answer = scannerObject.nextLine().toLowerCase().charAt(0);
            if(answer == 'n'){
                break;
            }

        }


    }

    public static int getRandomValue(int lowerBound, int upperBound) {
        int randomValue = randomObject.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        return randomValue;
    }

}

class Field {
    public static Random randomObject = new Random();

    public int fieldSizeX;

    // Single Dimension
    public int[] singleField = new int[fieldSizeX];

    public int[] placements = new int[4];

    public Field(int fieldSizeX) {
        this.fieldSizeX = fieldSizeX;
    }




    public boolean validateAttackedPosition(int position) {
        // x check
        if (position <= this.fieldSizeX) {
            System.out.println("Invalid x positions.");
            return true;
        }
        return false;
    }

    public List<Integer> giveShipAPosition(int shipSize) {

        List<Integer> positions = new ArrayList<>(shipSize);


        int initialPosition = randomObject.nextInt(fieldSizeX); // 0 to n -1

        if (initialPosition < (fieldSizeX - shipSize)) {
            for (int i = 0; i < shipSize; i++) {
                positions.add(initialPosition + i);

            }
        }
        return positions;
    }
}

class Ship {

    // I can't think of a better way to give the field dimensions for all the classes
    public static int fieldSizeX;

    public String name;
    public List<Integer> shipPosition;
    public int numberOfHits;
    public int numberOfMisses;

    public Ship(String name, List<Integer> shipPosition, int fieldSizeX, int maxMisses) {
        this.name = name;
        this.shipPosition = shipPosition;
        this.fieldSizeX = fieldSizeX;
        this.numberOfMisses = maxMisses;

    }
    public Ship(String name, List<Integer> shipPosition, int fieldSizeX) {
        this.name = name;
        this.shipPosition = shipPosition;
        this.fieldSizeX = fieldSizeX;

    }

    public Boolean reciveHit(int positionHit) {

        for (int i = 0; i < shipPosition.size(); i++) {
            if (positionHit == shipPosition.get(i)) {
                this.shipPosition.remove(i);
                return true;
            }
        }
        return false;
    }

    public int attackPoistion(int xPosition) {
        int position = xPosition;
        return position;
    }

    public String getName() {
        return name;
    }

    public int getLife(){
        return shipPosition.size();
    }

    public void addHit(){
        this.numberOfHits =+ 1;
    }
    public void addMiss(){
        this.numberOfMisses =+ 1;
    }
    public int getHits(){
        return this.numberOfHits;
    }
    public int getMisses(){
        return this.numberOfMisses;
    }



}

class Ai extends Ship {
    private Random randomObject = new Random();

    public Ai(String name, List<Integer> shipPosition, int fieldSizeX) {
        super(name, shipPosition, fieldSizeX);
    }


    public int attackPoistion() {
        int lowerBound = 0;
        int upperBoundX = this.fieldSizeX;

        // for readability
        int xPosition = randomObject.nextInt((upperBoundX - lowerBound) + 1) + lowerBound;

        int position = xPosition;

        return position;
    }

}
