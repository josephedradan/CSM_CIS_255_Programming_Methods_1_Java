public class FoundNameInListException extends Exception {
    public FoundNameInListException(){
        super("Name found in given List.");
    }
    public  FoundNameInListException(String message){
        super(message);
    }
}


