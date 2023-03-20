
public class Class1 {
    public String a;
    private String b;
    protected String c;

    private int test_var;

    public static void main (String args[]){
        Class1 bob = new Class1();
        System.out.println(bob.a);
        System.out.println(bob.b);
        System.out.println(bob.c);

        Class2 bob2 = new Class2();
//        System.out.println(bob);
        // b c a

        Class3 bob3 = new Class3();
        // c a r s x y
        // r s
    }

    // constructor
    public Class1(){
        this.test_var = 1;
    }
    public Class1 (int x){
        this.test_var = x;

    }

    // sub classes can't access this
    private void test_method (){

    }

    // OVERLOADING EXAMPLE
    public void bark (){

    }
    public void bark (int x){

    }
    public void fuck (){

    }
class Runner {
//    public static void main (String args[]){
//        Class1 bob = new Class1();
//        System.out.println(bob.a);
//        System.out.println(bob.c);
//
//        Class2 bob2 = new Class2();
//        // System.out.println(bob2.y);
//        System.out.println(bob2.x);
//        System.out.println(bob2.a);
//        System.out.println(bob2.c);
//        System.out.println(bob2.z);
//
//        Class3 bob3 = new Class3();
//        System.out.println(bob3.x);
//        System.out.println(bob3.c);
//        System.out.println(bob3.a);
//        System.out.println(bob3.r);
//        System.out.println(bob3.s);
//        System.out.println(bob3.z);
//
//        // CAN'T ACCESS SHIT BECAUSE I DON;T HAVE EXTEND
//        Class4 bob4 = new Class4();
    }
}