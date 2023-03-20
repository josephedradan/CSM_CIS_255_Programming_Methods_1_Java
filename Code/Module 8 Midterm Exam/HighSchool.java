public class HighSchool extends School implements Comparable<HighSchool> {

    private boolean isSpecialized;

    public HighSchool(String schoolName, int numberOfStudents, boolean isSpecialized) {
        super(schoolName, numberOfStudents);
        this.isSpecialized = isSpecialized;
    }

    public boolean isSpecialized() {
        return isSpecialized;
    }

    public void setSpecialized(boolean specialized) {
        isSpecialized = specialized;
    }

    @Override
    public String toString() {
        return String.format("%s\n\nSpecialized: %s",
                super.toString(),
                isSpecialized);
    }

    @Override
    public int compareTo(HighSchool otherHighSchool) {
        // Difference is the amount that otherHighSchool needs to be This HighSchool

        int differenceStudents = super.getNumberOfStudents() - otherHighSchool.getNumberOfStudents();
        int differenceName = super.getSchoolName().compareToIgnoreCase(otherHighSchool.getSchoolName());

        if (super.getSchoolName().equalsIgnoreCase(otherHighSchool.getSchoolName())) {

            if (differenceStudents == 0) {
                System.out.println("No Difference between Schools");
                return differenceStudents;
            } else if (differenceStudents < 0) {
                System.out.println("This HighSchool has Fewer students than Other HighSchool");
                return differenceStudents;
            } else {
                System.out.println("This HighSchool has More students than Other HighSchool");
                return differenceStudents;
            }

        } else {
            if (differenceName < 0) {
                System.out.println("This HighSchool's Name is less than Other HighSchool\"");
                return differenceName;
            } else {
                System.out.println("This HighSchool's Name is greater than Other HighSchool\"");
                return differenceName;
            }

        }
    }
}
