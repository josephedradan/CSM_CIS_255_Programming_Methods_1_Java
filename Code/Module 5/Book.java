public class Book {

    private String title, author;
    private int copyrightYear;

    public Book(String title, String author, int copyrightYear) {
        this.title = title;
        this.author = author;
        this.copyrightYear = copyrightYear;
    }

    public static void main(String args[]) {
        Book book1 = new Book("Book 1", "Joseph", 2018);
        Atlas atlas1 = new Atlas("Atlas 1", "Joseph", 2018, 100);

        System.out.println(book1);
        System.out.println(atlas1);
        System.out.printf("\nIs Book 1 the same as Atlas 1: %s\n", book1.equals(atlas1));
        System.out.println("Renaming Atlas 1 to Book 1");
        atlas1.setTitle("Book 1");
        System.out.printf("Is Book 1 the same as Book 1 (Formally Atlas 1): %s\n", atlas1.equals(book1));
        System.out.println("Changing the Author of the former Atlas 1");
        book1.setAuthor("Not Joseph");
        System.out.printf("Are they the same now?: %s\n", book1.equals(atlas1));

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCopyrightYear(int copyrightYear) {
        if (copyrightYear > 0) {
            this.copyrightYear = copyrightYear;
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + copyrightYear + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;

//            boolean sameTitle, sameAuthor, sameCopyrightYear;
//
//            if(this.title.equalsIgnoreCase(otherBook.title)){
//                sameTitle = true;
//            } else{
//                sameTitle = false;
//            }
//            if(this.author.equalsIgnoreCase(otherBook.author)){
//                sameAuthor = true;
//            } else{
//                sameAuthor = false;
//            }
//            if(this.copyrightYear == otherBook.copyrightYear){
//                sameCopyrightYear = true;
//            } else{
//                sameCopyrightYear = false;
//            }
//
//            return sameTitle && sameAuthor && sameCopyrightYear;

            if (!this.title.equalsIgnoreCase(otherBook.title)) {
                return false;
            }
            if (!this.author.equalsIgnoreCase(otherBook.author)) {
                return false;
            }
            if (this.copyrightYear != otherBook.copyrightYear) {
                return false;
            }
            return true;

        } else {
            return false;

        }
    }
}