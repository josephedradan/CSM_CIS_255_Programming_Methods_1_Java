public class School {

    public static void main(String args[]){
        School x = new School("Test", 123);
        x.setNumberOfStudents(-23);

        School y = new School("Test",123);

        System.out.println(x.equals(y));
//        System.out.println(x);

        School z = new HighSchool("Meme", 222, true);
//        System.out.println(z);

        School z1 = new HighSchool("Meme", 222, true);
        School z2 = new HighSchool("Mema", 222, true);
        School z3 = new HighSchool("Meme", 224, true);

        System.out.println(((HighSchool) z).compareTo((HighSchool) z1));
        System.out.println(((HighSchool) z).compareTo((HighSchool) z2));
        System.out.println(((HighSchool) z).compareTo((HighSchool) z3));

        System.out.println("\n\n\n\n\n\n\n\n\n");
        School[] schools = new School[5];

        schools[0] = new School("School 1", 100);
        schools[1] = new School("School 2", 200);
        schools[2] = new HighSchool("HighSchool 3", 300,true);
        schools[3] = new HighSchool("HighSchool 4", 400,true);
        schools[4] = new HighSchool("HighSchool 5", 100,false);

        int numberSpecialized = 0;

        for (School school: schools){
            System.out.println("\n"+school);

            if(school instanceof HighSchool){
                HighSchool highSchool = (HighSchool) school;
                if(highSchool.isSpecialized()){
                    numberSpecialized++;
                }
            }
        }
        System.out.println("\n\nAmount of HighShools Specialized is: " + numberSpecialized);


    }

    private String schoolName;
    private int numberOfStudents;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.numberOfStudents = numberOfStudents;
    }

    public School(String schoolName) {
        this(schoolName, 0);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        if(numberOfStudents > -1) {
            this.numberOfStudents = numberOfStudents;
        } else{
            System.out.println("Unacceptable Number");
        }
    }

    @Override
    public boolean equals(Object Obj) {
        if (Obj instanceof School) {
            School otherSchool = (School) Obj;

            if(!schoolName.equalsIgnoreCase(otherSchool.getSchoolName())){
                return false;
            }
            if(numberOfStudents != otherSchool.getNumberOfStudents()){
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\n\nNumber of students: %d",
                schoolName,
                numberOfStudents);
    }
}
