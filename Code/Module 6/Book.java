// Qustion 21 WILL NOT COMPILE BECAUSE 2 CLASS BUT CODE WILL WORK
//public class Book {
//    public void print() {
//        System.out.print(1);
//    }
//}
//public class Atlas extends Book {
//    public void print() {
//        super.print();
//        System.out.print(2);
//    }
//}

import java.util.Scanner;

// 22
//public class Book {
//    public static void main(String args[]) {
//        // inside of a main method:
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What kind of object?");
//        int type = Integer.parseInt(scan.nextLine());
//        Book book;
//        if(type==1) {
//            book = new Book();
//        } else {
//            book = new Dictionary();
//        }
//    }
//        public void print() {
//        System.out.print(1);
//    }
//}
//
//class Dictionary extends Book {
//    public void print() {
//        System.out.print(2);
//    }
//}

// 24 WILL COMPILE
public class Book {
    public static void main(String argsp[]){
        System.out.println("\nNumber 24");
        // 24
        Book book1 = new Book();
        book1.print();

        System.out.println("\nNumber 25");
        // 25
        Book dictionary1 = new Dictionary();
        dictionary1.print();

        System.out.println("\nNumber 26");
        // 26 WILL NOT COMPILE
//        Book book2 = new Book();
//        book2.words();

        System.out.println("\nNumber 27");
        // 27 WILL NOT COMPILE
//        Book dictionary2 = new Dictionary();
//        dictionary2.words();

        System.out.println("\nNumber 28");
        // 28 WILL COMPILE
        Dictionary dictionary3 = new Dictionary();
        dictionary3.words();

        System.out.println("\nNumber 29");
        // 29 WILL COMPILE
        Dictionary dictionary4 = new Dictionary();
        dictionary4.print();

        System.out.println("\nNumber 30");
        // 30 WILL COMPILE BUT CRASH Exception in thread "main" java.lang.ClassCastException: Book cannot be cast to Dictionary at Book.main(Book.java:75)
//        Book book5 = new Book();
//        Dictionary d1 = (Dictionary) book5;

        System.out.println("\nNumber 31");
        // 31 WILL COMPILE
        Book book6 = new Dictionary();
        Dictionary d2 = (Dictionary) book6;

        System.out.println("\nNumber 32");
        // 32 WILL COMPILE
        Book book7 = new Book();
        System.out.println(book7.getClass().getName());
        if(book7 instanceof Dictionary) {
            Dictionary d3 = (Dictionary) book7;
            System.out.println("I RAN, THE IF STATEMENT WORKED.");
        }

        System.out.println("\nNumber 33");
        // 33 NOT WILL COMPILE
//        Book book8 = new Dictionary();
//        if(book8 instanceof Dictionary) {
//            book8.words();
//        }


    }
    public void print() {
        System.out.print(1);
    }
}

class Dictionary extends Book {
    public void words() {
        System.out.print(2);
    }
}