public class ClassA {
    public int a;
    private int b;
    protected int c;

    public ClassA (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class ClassB extends ClassA  {
    protected int q;
    private int r;

    int test_2 = q + r + a + c ;

    public ClassB(int a, int b, int c) {
        super(a, b, c);
    }
}

class ClassC extends ClassB{
    private int m;

    int test_1 = m + q + a + c;

     public ClassC(int a, int b, int c) {
         super(a, b, c);
     }
 }