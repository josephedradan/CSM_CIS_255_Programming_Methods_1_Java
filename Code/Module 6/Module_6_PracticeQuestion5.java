public class M6_PracticeQuestion5 {

    public static void main(String args[]) {
//        Book b1 = new Book();
//        b1.display();
//
//        Book b2 = new Reference();
//        b2.display();
//
//        Reference r2 = new Reference();
//        r2.display();
//
//        Book b3 = new eBook();
//        b3.display();
//
//        eBook e3 = new eBook();
//        e3.display();
//
//        Book b4 = new Atlas();
//        b4.display();
//
//        Atlas a4 = new Atlas();
//        a4.display();

        Book b1 = new Book();
        Book b2 = new Reference();
        Book b3 = new eBook();
        Book b4 = new Atlas();
        //eBook b5 = new Book();
        //eBook b6 = new Reference();
        eBook b7 = new eBook();
        //eBook b8 = new Atlas();
        //Reference b9 = new Book();
        Reference b10 = new Reference();
        //Reference b11 = new eBook();
        Reference b12 = new Atlas();
        //Atlas b13 = new Book();
        //Atlas b14 = new Reference();
        //Atlas b15 = new eBook();
        Atlas b16 = new Atlas();
        Object b17 = new Book();
        Object b18 = new Reference();
        Object b19 = new eBook();
        Object b20 = new Atlas();
        //Book b21 = new Object();
        //Reference b22 = new Object();
        //eBook b23 = new Object();
        //Atlas b24 = new Object();
    }

}

class Book {
    public void display() {
        System.out.println("Book");
    }
}

class Reference extends Book {
    public void display() {
        System.out.println("Reference");
    }
}

class eBook extends Book {
    public void display() {
        super.display();
        System.out.println("eBook");
    }
}

class Atlas extends Reference {
    public void display() {
        System.out.println("Atlas");
    }
}