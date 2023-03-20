public class OddNumberException extends Exception{
    public OddNumberException(){
        super ("Number is an odd number");
    }
    public OddNumberException(int value){
        super (String.format("%s is an odd number", value));
    }
}