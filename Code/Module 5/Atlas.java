public class Atlas extends Book{

    private int numberOfMaps;

    public static void main (String args[]) {
        Atlas bob = new Atlas("Bob's Book", "Joseph", 2323,1);
        System.out.println(bob);

        Book dude = new Book("Dude", "Joseph", 1000);
        Book dude2 = new Book("Dude", "Joseph", 1000);
        Book dude3 = new Book("Dude 2", "Joseph", 1000);

        System.out.println(dude.equals(dude2));
        System.out.println(dude.equals(dude3));
        System.out.println(dude2.equals(bob));
        System.out.println(dude.getTitle().equals(dude2.getTitle()));


    }
    public Atlas(String title, String author, int copyrightYear, int numberOfMaps) {
        super(title, author, copyrightYear);
        this.numberOfMaps = numberOfMaps;
    }

    public int getNumberOfMaps() {
        return numberOfMaps;
    }

    public void setNumberOfMaps(int numberOfMaps) {
        if (numberOfMaps > 0){
            this.numberOfMaps = numberOfMaps;
        }
        else{
            System.out.println("Invalid number of maps");
        }
    }

    @Override
    public String toString() {
//        return getTitle() + " by " + getAuthor() + " (" + getCopyrightYear() + ")\n\n" +
//                "Contains " + numberOfMaps + " maps";
//        return String.format("%s by %s (%s)\n\nContains %d maps",
//                getTitle(),
//                getAuthor(),
//                getCopyrightYear(),
//                numberOfMaps);

        return String.format("%s\n\nContains %d maps",super.toString(),numberOfMaps);

    }
}
