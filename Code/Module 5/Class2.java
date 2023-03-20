public class Class2 extends Class1 {
    protected String x;
    private String y;
    public String z;

    public static void main (String args[]) {
        Class1 bob = new Class1();
        // c a

        Class2 bob2 = new Class2();
//        System.out.println(bob2);
        // x y z c a

        Class3 bob3 = new Class3();
        // r s


        // CAN'T RUN IF PRIVATE
//        bob.test_method();
    }

    public Class2 (){
        // THERE IS NO OTHER WAY TO SUPER BUT THIS WAY
        super(1);

    }

    @Override
    public void fuck() {
        super.fuck();
    }
}
