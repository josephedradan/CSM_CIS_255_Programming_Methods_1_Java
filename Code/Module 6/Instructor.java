public class Instructor extends Person {

    private String subjectTaught;
    private final static String DEFAULT_SUBJECT = "N/A";

    public static void main (String args[]) {
        // Dank memes
        Person[] people = new Person[5];
        people[0] = new Person("Samy Kamkar");
        people[1] = new Instructor("Elon Musk","Public Relations");
        people[2] = new Instructor("Mark Zuckerberg", "Business");
        people[3] = new Instructor("Linus Torvalds", "Communications");
        people[4] = new Instructor("Jeff Bezos", "Business");

        // I don't like math.
        int teachesBusiness = 0;

        for(Person person : people){
            System.out.println(person);

            if(person instanceof Instructor){
                Instructor instructor = (Instructor) person;

                if(instructor.getSubjectTaught().equals("Business")){
                    teachesBusiness++;
                }
            }
        }
        System.out.println("\nAmount of Instructors that teach Business: " + teachesBusiness);

    }

    public Instructor() {
        this.subjectTaught = DEFAULT_SUBJECT;
    }

    public Instructor(String name, String subjectTaught) {
        super(name);
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    @Override
    public String toString() {
//        return String.format("\nName: %s\nSubject: %s",
//                this.getAnimalName(),
//                subjectTaught);
        return String.format("\n%s\nSubject: %s",
                super.toString(),
                subjectTaught);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Instructor) {
            Instructor otherInstructor = (Instructor) obj;
//            if(!this.getAnimalName().equalsIgnoreCase(otherInstructor.getAnimalName())){
//                return false;
//            }
            // Gotta use super to reduce code.
            if(!super.equals(obj)){
                return false;
            }
            if(!this.getSubjectTaught().equalsIgnoreCase(otherInstructor.getSubjectTaught())){
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
