public class Person {

    public static void main(String args[]) {
        Person p1 = new Person();
        // Question 46
        int m1 = p1.getSalary(); // statementA // PERSON
        System.out.println(m1);

        Person p2 = new Teacher();
        // Question 47
        int m2 = p2.getSalary(); // statementB // TEACHER

        Person p3;
        if(m2 > 10000) {
            p3 = new Teacher();
        } else {
            p3 = new Dean();
        }
        // Question 48
        int m3 = p3.getSalary(); // statementC // THIS CANNOT BE DETERMINED BECAUSE THERE IS SUPPOSED TO BE NO CODE
    }

    public int getSalary() {
        System.out.println("FUCK ME");
        return 0;
    }
}

class Dean extends Person {

    @Override
    public int getSalary() {
        System.out.println("ME DEAN");
        return 0;

    }
}

class Teacher extends Person {

    @Override
    public int getSalary() {
        System.out.println("ME TEACHER");
        return 0;

    }
}

