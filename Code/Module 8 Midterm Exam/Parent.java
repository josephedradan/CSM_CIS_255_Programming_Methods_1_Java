public class Parent{
    public static void main(String args[]) {
        Parent p = new Parent();
        p.display();
        p.display("hi");
        Parent a = new ChildA();
        a.display();
        a.display("hi");
        Parent b = new ChildB();
        b.display();
        b.display("hi");
    }

        public void display() {
        System.out.print(1);
    }
    public void display(String s) {
        System.out.print(2);
    }
}

class ChildA extends Parent {
    public void display() {
        super.display();
        System.out.print(3);
    }
}

class ChildB extends Parent{
    public void display(String s) {
        super.display(s);
        System.out.print(4);
    }
}

