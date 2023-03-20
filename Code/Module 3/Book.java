import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;



    public static void main(String args[]) {

        Book book1 = new Book("Art of the deal", "Donald J Trump", "978-0399594496",1987);
        Book book2 = new Book("Joseph's Book", "Joseph Edradan", "123-0123456789",1997);
        Book book3 = new Book("A title", "Boaty", "333-8888888888",2000);

        book1.setISBN("978-0399594496323423243");
        System.out.println();
        book2.setPublicationYear(3000);
        System.out.println();
        System.out.println(book3.toString());
        System.out.println(book3);
        System.out.printf("This book is %d years old!", book3.getBookAge());

    }


    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        // You can have whatever title you want.
        this.title = title;
    }

    public void setAuthor(String author) {
        // You can be whoever you want, even a robot.
        this.author = author;
    }

    public void setISBN(String ISBN) {
        String pattern  = "[0-9]{3}-[0-9]{10}"; // any number 3 times then dash then any number 10 times
        if(Pattern.matches(pattern, ISBN)){
            this.ISBN = ISBN;
        }
        else {
            System.out.println("Invalid ISBN");
        }
    }

    public void setPublicationYear(int publicationYear) {
        LocalDateTime date = LocalDateTime.now();

        if ( publicationYear >= 0 && publicationYear <= date.getYear()){
            this.publicationYear = publicationYear;

        } else{
            System.out.println("Invalid Publication Year");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nISBN: %s\nPublication Year: %d",
                title,
                author,
                ISBN,
                publicationYear );
    }

    public int getBookAge(){
        LocalDateTime date = LocalDateTime.now();
        return date.getYear() - publicationYear;
    }
}
