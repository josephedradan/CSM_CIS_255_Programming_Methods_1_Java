public class PracticeQuestion3 {
    public static void main(String args[]) {
//        Readable r = new Readable(); // No work 1
//        Readable r = new Book(); // No work 2
//        Readable r = new Dictionary(); 3
//        Readable r = new eBook(); //4
//        Book b = new Book(); // No work 5
//        Book b = new Dictionary(); // 6
//        Book b = new eBook(); // 7
//        Dictionary d = new Dictionary(); // 8
//        Downloadable d = new Downloadable(); // No work 9
//        Downloadable d = new Book(); // No work 10
//        Downloadable d = new Dictionary(); // No work 11
//        Downloadable d = new eBook(); // 12
//        Readable[] readableThings = new Readable[10]; //13
//        Book[] books = new Book[10]; // 14
//        Dictionary[] dictionaries = new Dictionary[10]; // 15
    }
}
interface Readable{}
interface Downloadable{}

abstract class Book implements Readable{}
class Dictionary extends Book{}
class eBook extends Book implements Downloadable{}