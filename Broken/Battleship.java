import java.util.*;

public class Battleship {
    public static Scanner scannerObject = new Scanner(System.in);
    public static Random randomObject = new Random();


    final public String[] defaultNames = new String[]
            {"USS Enterpise", "Unsinkable II", "Usain Boat", "Titanic II", "Boaty McBoatface"};


    public static void main(String[] args) {

        System.out.println("Enter Battlefield length X.");
        int fieldSizeX = scannerObject.nextInt();
//        System.out.println("Enter Battlefield length Y.");
//        int fieldSizeY = scannerObject.nextInt();

        Field battleField = new Field(fieldSizeX,fieldSizeY);
        //////////////////////////////


        System.out.println("Enter Player Ship name.");
        String playerName = scannerObject.nextLine();

        System.out.println("Enter Player Ship length.");
        int playerLength = scannerObject.nextInt();

//        System.out.println("Enter Player Ship position.");
//        int playerPosition = scannerObject.nextInt();

//        System.out.println("Enter Player Ship orientation (H or V).");
//        char playerOrientation = scannerObject.nextLine().toLowerCase().charAt(0);

        Player playerObject = new Player("Joseph", 10 );



//        System.out.println("Enter number of computers.");
//        int numberOfComputers = scannerObject.nextInt();

        //////////////////////////////

        Ai computer_1 = new Ai("Bob",23);
        computer_1.attackPoistion();

        boolean gameRunning = true;

        while(gameRunning){
            System.out.println("Enter X");
            int xPosition = scannerObject.nextInt();
            System.out.println("Enter Y");
            int yPosition = scannerObject.nextInt();
        }

    }

}

class Field {
    public static Random randomObject = new Random();

    private int fieldSizeX;
    private int fieldSizeY;

    // FIELD DIMENSIONS
    private int[][] multi = new int[fieldSizeX][fieldSizeY];

    // Single Dimension
    private int[] single = new int[fieldSizeX];


    public Field(int fieldSizeX) {
        this.fieldSizeX  = fieldSizeX;
    }

    public Field(int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;


    }

//    public void changeFieldValueMulti(int[] position) {
//        // This with change the value of the field meaning hit.
//        // THIS IS FOR HITS
//
//        // x , y
//        this.multi[position[0]][position[1]] += 1;
//
//    }

    public void changeFieldValueSingle(int[] position) {
        // This will change the field position

        // x
        this.single[position[0]] += 1;

    }

    public boolean validateAttackedPosition(int[] position) {
        // check x and y
        if (position[0] <= this.fieldSizeX && position[1] <= this.fieldSizeY) {
            System.out.println("Invalid x and y positions.");
            return false;
        }
        // x check
        else if (position[0] <= this.fieldSizeX) {
            System.out.println("Invalid x positions.");
            return false;
        }
        // y check
        else if (position[1] <= this.fieldSizeY) {
            System.out.println("Invalid y positions.");
            return false;
        } else return true;
    }

    public List<int[]> giveShipAPosition(int shipSize){
        // JUST NOTICED MULTI DIMENSION LOGIC IS WAY TO LONG TO DEVELOP
        // ALSO PLAYER GIVING STARTING POSITION IS TO LONG TO DEVELOP

        int orientation = randomObject.nextInt((1 - 0) + 1) + 0;

        // Horizontal
        if(orientation == 0){
            for()
        }


    }

//    public void checkShipColision(int[][]){
//    // TODO ADD THIS SHIT
//    }
//
//    public

}

class Ship {

    // I can't think of a better way to give the field dimensions for all the classes
    public static int fieldSizeX;
    public static int fieldSizeY;

    public String name;
    public int shipLength;
    public int shipInitialPosition;
    List<int[]> positions = new ArrayList<>();

    public Ship(String name, int size, int fieldSizeX, int fieldSizeY ) {
        this.name = name;
        this.shipLength = size;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;

    }

    public Ship(String name, int size) {
        this.name = name;
        this.shipLength = size;

    }


    public Boolean reciveHit(int[] positionHit){

        for(int i = 0; i < positions.size(); i++){
            if(Arrays.equals(positionHit,positions.get(i))){
                positions.remove(i);
                return true;
            }
        }
        return false;
    }

    public int[] attackPoistion(int xPosition, int yPosition ) {
        int[] position = {xPosition, yPosition};
        return position;
    }

    public String getName() {
        return name;
    }

    public int getShipLength() {
        return shipLength;
    }

    //////////////////////////////

    public List<int[]> getPositions() {
        return positions;
    }

    public void setPositions(List<int[]> positions) {
        this.positions = positions;
    }
}

class Ai extends Ship {
    private Random randomObject = new Random();

    public Ai(String name, int size) {
        super(name, size);
        this.name = name;

    }

    public int[] attackPoistion() {
        int lowerBound = 0;
        int upperBoundX = this.fieldSizeX;
        int upperBoundY = this.fieldSizeY;

        // for readability
        int xPosition = randomObject.nextInt((upperBoundX - lowerBound) + 1) + lowerBound;
        int yPosition = randomObject.nextInt((upperBoundY - lowerBound) + 1) + lowerBound;

        int[] position = {xPosition, yPosition};

        return position;
    }

}

class Player extends Ship {
    public Player(String name, int size) {
        super(name, size);
        this.name = name;

    }
}
