import javafx.scene.shape.Rectangle;

public class Module_3 {
    public static void main(String args[]) {


//        test_zone();
        test_zone_2();
//        test_zone_3(); //

//        int dude = 5/2; // PRINTS 2
//        System.out.println(dude);
    }

    private static void test_zone_3() {
        Rectangle r = new Rectangle(8, 8);
        int n = 2;

        shrink(r); // 4 and 4
//        shrink(n); // 1

        System.out.print("" + ( (int) r.getWidth()) + ( (int) r.getHeight()) + n);

//        public void shrink(Rectangle rec) {
//            rec = new Rectangle(5,5); //
//            int newWidth = (int) rec.getWidth()/2;
//            int newHeight = (int) rec.getHeight()/2;
//            rec.setSize(newWidth, newHeight); //  // 2 and 2
//        }
//        public void shrink(int q) {
//            q = q / 2;
//        }


        // SHOULD PRINT 221

    }

    private static void test_zone_2() {
        Rectangle r = new Rectangle(8, 8);
        int n = 2;

        shrink(r); // 4 and 4
//        shrink(n); // 1

        System.out.print("" + ((int) r.getWidth()) + ( (int) r.getHeight()) + n);

//        public void shrink(Rectangle rec) {
//            int newWidth = (int) rec.getWidth()/2;
//            int newHeight = (int) rec.getHeight()/2;
//            rec.setSize(newWidth, newHeight);
//        }
//        public void shrink(int q) {
//            q = q / 2;
//        }

        // IT SHOULD PRINT 441 LOGICALLY
    }

    private static void shrink(Rectangle r) {
    }

    private static void test_zone() {

        Person bob = new Person("Name", "Fuckboi Land", 69);
        System.out.println(bob.toString());
        bob.vote();

//        Person p = new Person("Janet Jones", "456 Orange Avenue", 16.5);
//        new Person p = ("Carla Doe", "789 Broad Street", 26);
//        p = new Person();
//        new Person(p);
//        Person p = new Person();

        System.out.println();
        Person p = new Person("John Smith", "123 Main Street", 42); // ONLY ONE THAT WORKS

        p.getPhoneNumber(); // WORKS
//        public String getPhoneNumber();
//        String = getPhoneNumber(p);
//        p.toString();
//        getPhoneNumber(p);
        String s = p.getPhoneNumber(); // WORKS
//        p = getPhoneNumber();

//        p.toString();
//        System.out.print(String.to(p));
        System.out.print(p + "\n"); // WORKS
        System.out.print(p.toString() + "\n"); // WORKS
        System.out.println(p.getAge());
        System.out.println(p.canVote(18)); // returns a boolean

//        Person.vote(p);
//        Person.vote();
//        vote(p);
//        p.vote(p);
        p.vote(); // ONLY ONE THAT WORKS

//        System.out.println(p.vote()); // WILL NOT WORK

        p.toString();

        Person z = new Person("John Smith", "123 Main Street", 42); // a reference/ pointer/ memory address to the object
        int n = 4;  //
    }
}

class Person {
    private String name;
    private String address;
    private int age;

    public Person(String newName, String newAddress, int newAge) {
        name = newName;
        address = newAddress;
        age = newAge;
    }

    public String toString() {
        String s = name + "\n" + address + "\n" + age;
        return s;
    }

    public void vote() {
        System.out.println(name + " is voting.");
    }

    public String getPhoneNumber() {
        return "FUKC YOU";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canVote(int age) {
        return age > 18;
    }
}