public class MyClass {
    private int num;

    public MyClass() {
        num = 2;
    }
    public void doSomething(int num) {
        System.out.print(num);
        System.out.print(this.num);
    }
}