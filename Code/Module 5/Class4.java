public class Class4 {
    public static void main (String args[]){
        Class1 bob = new Class1();
        System.out.println(bob.a);
        System.out.println(bob.c);

        Class2 bob2 = new Class2();
        // System.out.println(bob2.y);
        System.out.println(bob2.x);
        System.out.println(bob2.a);
        System.out.println(bob2.c);
        System.out.println(bob2.z);

        Class3 bob3 = new Class3();
        System.out.println(bob3.x);
        System.out.println(bob3.c);
        System.out.println(bob3.a);
        System.out.println(bob3.r);
        System.out.println(bob3.s);
        System.out.println(bob3.z);

        // a c x r s z

        // CAN'T ACCESS SHIT BECAUSE I DON;T HAVE EXTEND
        Class4 bob4 = new Class4();
    }
}
