public class Module_5 {
    public static void main (String args[]) {

        Class1 bob = new Class1(1);

        A bob2 = new A();
        //bob2.printer();

        B bob3 = new B();
        bob3.printer();
    }


}
// Question 20
class A {
    // instance var
    private int a;

    public A() {
        a = 7;
    }
    public void printer(){
        System.out.println(a);
    }
}

class B extends A {
    // instance var
    private int b;

    public B() {
        b = 8;
    }

    // IF YOU DON'T OVERRIDE, printer WILL PRINT 7
//    @Override
//    public void printer(){
//        System.out.println(b); // WILL PRINT 8
//    }
}