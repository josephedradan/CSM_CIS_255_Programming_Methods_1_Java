import static java.util.stream.Collectors.joining;

/*
Joseph Edradan
CIS-255-OLH-CRN88669
9/28/18

Description:
    Course

*** IMPORTANT NOTE ***:
    Priority is:
        ROSTER
        WAITLIST

    IF WAITLIST HAS SOMEONE THEN ANYONE ELSE WILL BE ADDED TO WAITLIST FIRST THEN YOU CAN ADD AGAIN TO BE IN ROSTER IF
    ROSTER HAS SPACE.

    JUSTIFICATION: ANYONE ON THE WAITLIST SHOULD HAVE PRIORITY OVER SOMEONE NOT ON THE WAITLIST.

    IGNORE IMPORTANT NOTE IF CODE FROM dropStudentV2 IS USED INSTEAD OF dropStudent

Notes:
    there are a bunch of boolean methods to confirm that something has happened, they are not necessary, but why not
    have more control over your code.

    2 Methods are not used, but can be used in replace of some code at the cost of readability.
    1 of those methods (dropStudentV2) is a more advanced version of dropStudent.

    Don't Mind the imports at the top, they were going to be used for stream.
 */
public class Course {
    // ONLY USED FOR SPECIAL FUNCTION, IF METHOD IS EVER TO BE USED.
    final public boolean ADD = true;
    final public boolean REMOVE = false;

    private String courseName;

    private Student[] studentRoster;
    private Student[] studentWaitlist;

    private int maxRoster;
    private int maxWaitlist;

//    public static void main(String args[]) {
//        System.out.println("######################################################" +
//                "#############################################\n\n\n");
//        Student[] studentsInSchool = new Student[15];
//
//        studentsInSchool[0] = new Student("Dude 1", "", "S925", true);
//        studentsInSchool[1] = new Student("Dude 2", "", "S713", false); // not in
//        studentsInSchool[2] = new Student("Dude 3", "", "S512", true);
//        studentsInSchool[3] = new Student("Dude 4", "", "S513", true);
//        studentsInSchool[4] = new Student("Dude 5", "", "S516", true);
//        studentsInSchool[5] = new Student("Dude 6", "", "S956", true); // 5th
//        studentsInSchool[6] = new Student("Dude 7", "", "S419", true);
//        studentsInSchool[7] = new Student("Dude 8", "", "S281", true);
//        studentsInSchool[8] = new Student("Dude 9", "", "S790", true);
//        studentsInSchool[9] = new Student("Dude 10", "", "S336", true);
//        studentsInSchool[10] = new Student("Dude 11", "", "S156", true); // 10th
//        studentsInSchool[11] = new Student("Dude 12", "", "S219", true);
//        studentsInSchool[12] = new Student("Dude 13", "", "S472", true);
//        studentsInSchool[13] = new Student("Dude 14", "", "S892", true);
//        studentsInSchool[14] = new Student("Dude 15", "", "S901", true);
//
//        Course course = new Course("Meme Class", 5, 5);
//
//        for(Student student : studentsInSchool) {
//            boolean added = course.addStudent(student);
//            System.out.println(student + (added ? " added successfully" : " not added"));
//        }
//
//        System.out.println(course);
//        System.out.println("\n\n\n");
//
//        System.out.println();
//        course.dropStudentV2(studentsInSchool[4]);
//        System.out.println("Dude 5 SHOULD BE removed in roster AND Dude 7 added in roster");
//        System.out.println(course);
//
//        course.addStudent(studentsInSchool[14]);
//        System.out.println("Dude 15 SHOULD BE added in whitelist");
//        System.out.println(course);
//
//        System.out.println("######################################################" +
//                "#############################################\n\n\n");
//    }

    public Course(String courseName, int maxRoster, int maxWaitlist) {
        this.courseName = courseName;
        this.maxRoster = maxRoster;
        this.maxWaitlist = maxWaitlist;
        this.studentRoster = new Student[maxRoster];
        this.studentWaitlist = new Student[maxWaitlist];

    }

    public String getCourseName() {
        return courseName;

    }

    public int getMaxWaitlist() {
        return maxWaitlist;

    }

    public int getMaxRoster() {
        return maxRoster;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public Student[] getStudentRoster() {
        return studentRoster;

    }

    public Student[] getStudentWaitlist() {
        return studentWaitlist;

    }

    public String getFormattedStudentArray(Student[] studentArray){
        return studentArrayFullNameToString(studentArray);
    }
    public String studentArrayFullNameToString(Student[] studentArray) {
        String text = "";
        for (int i = 0; i < studentArray.length; i++) {
            // Spacing
            if (i % 5 == 0) {
                text = text + "\n     ";
            }
            // Escape if there is null
            if (studentArray[i] == null) {
                break;
            }
            text = text + String.format("%s, ", studentArray[i]);

        }
        if(text.length()<=2){
            return "None";
        }else{
            return text.substring(0,text.length()-2);

        }
//         No spacing, No filter for null
//        Arrays.stream(studentArray)
//                .map(e -> String.format("%s %s", e.getFirstName(), e.getLastName()))
//                .collect(Collectors.joining(", "));
    }

    public String toString() {
        return String.format(
                        "\n" +
                        "Course name: %s\n" +
                        "Number of Students Enrolled: %d\n" +
                        "Maximum capacity: %d\n" +
                        "Roster:\n%s\n\n" +
                        "Number of Students on Waitlist: %d\n" +
                        "Maximum capacity: %d\n" +
                        "Waitlist:\n%s\n" +
                        "\n\n\n\n",
                courseName,
                studentsInArray(studentRoster),
                maxRoster,
                studentArrayFullNameToString(studentRoster),
                studentsInArray(studentWaitlist),
                maxWaitlist,
                studentArrayFullNameToString(studentWaitlist));
    }

    public boolean isStudentObject(Student student){
        if(student instanceof Student){
            return true;
        }
        return false;
    }
    public int studentsInArray(Student[] studentArray){
        int counter = 0;
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i] instanceof Student){
                counter++;
            }
        }
        return counter;
    }
    // helper method
    public boolean isStudentInArray(Student student, Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            if (student.equals(studentArray[i])) {
                return true;
            }
        }
        return false;
    }

    // helper method
    private boolean addStudentInArray(Student student, Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == null) {
                studentArray[i] = student;
                return true;
            }
        }
        return false;
    }

    // NO ONE SHOULD CALL THIS, UNLESS SPECIFIED, USE removeStudentInArrayAndShift INSTEAD!
    private boolean removeStudentInArray(Student student, Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            if (student.equals(studentArray[i])) {
                studentArray[i] = null;
                return true;
            }
        }
        return false;
    }

    private int findNullIndexInArray(Student[] studentArray){
        for (int i = 0; i < studentArray.length - 1; i++) {
            if(studentArray[i] == null){
                return i;
            }
        }
        return -1;
    }

    private boolean arrayShiftLeftToRemoveNull(Student[] studentArray) {
        // If no index found then don't do anything...
        int index = findNullIndexInArray(studentArray);
        if(index > -1){
            for (int i = index; i < studentArray.length - 1; i++) {
                studentArray[i] = studentArray[i + 1];
            }
            studentArray[studentArray.length-1] = null;
            return true;
        }
        return false;
    }

    private boolean removeStudentInArrayAndShift(Student student, Student[] studentArray){
        if(removeStudentInArray(student, studentArray)){
            if(arrayShiftLeftToRemoveNull(studentArray)){
                // Confirm Null Removal
                return true;
            }
            // Confirm removal regardless of shift.
            return true;
        }
        return false;
    }


    // TODO: USE ME IF YOU WANT, TO COMPLICATE CODE.
    private boolean modifytudentToArray(Student student, Student[] studentArray, boolean method) {
        for (int i = 0; i < studentArray.length; i++) {
            // If adding to array.
            if (method){
                if (studentArray[i] == null) {
                    studentArray[i] = student;
                    return true;
                }
            }
            // If removing from array.
            else if (!method){
                if (student.equals(studentArray[i])) {
                    studentArray[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addStudent(Student student) {
        // Is Not student object?
        if (!isStudentObject(student)) {
            return false;
        }
        // Didn't pay, no add.
        if (!student.isTuitionPaid()) {
            return false;
        }
        // Already in Roster.
        if(isStudentInArray(student, studentRoster)){
            return false;
        }
        // Already in waitlist
        if (isStudentInArray(student, studentWaitlist)) {
            // Drop from waitlist and roster.
            if(dropStudent(student)){
                // Add that student to Roster.
                if(addStudentInArray(student,studentRoster)){
                    return true;
                }
            }
            return false;
        }
        // Not in waitlist and Not in roster.
        if (!isStudentInArray(student, studentWaitlist) && !isStudentInArray(student, studentRoster)) {
            // If students in waitlist, CANNOT ADD IN CLASS UNTIL WAITLIST IS EMPTY.
            if (studentsInArray(studentWaitlist)> 0){
                if (addStudentInArray(student, studentWaitlist)) {
                    return true;
                }
            }
            else{
                // Add to roster if not full.
                if (addStudentInArray(student, studentRoster)) {
                    return true;
                }
                // Add to waitlist if roster full and waitlist not full.
                else if (addStudentInArray(student, studentWaitlist)) {
                    return true;
                }
            }
        }

        // If all fails.
        return false;

    }

    public boolean dropStudent(Student student) {
        // Is Not student object?
        if (!isStudentObject(student)) {
            return false;
        }
        if (isStudentInArray(student, studentRoster)) {
            // 1.Remove student from roster and shift.

            return removeStudentInArrayAndShift(student, studentRoster);
        }
        if(isStudentInArray(student, studentWaitlist)){
            // 1.Remove student from waitlist and shift.

            return removeStudentInArrayAndShift(student, studentWaitlist);
        }
        return false;
    }

    public boolean dropStudentV2(Student student) {
        // Is Not student object?
        if (!isStudentObject(student)) {
            return false;
        }
        // ****** AUTOMATICALLY REMOVE STUDENT FROM ROSTER AND ADD FIRST FROM WAITLIST TO ROSTER
        // RIP NO DEFAULT PARAMETER
        if (isStudentInArray(student, studentRoster)) {
            // 1.Remove student from roster and shift.
            // 2.Add student from waitlist to roster and shift waitlist.

            // If removal is successful.
            if (removeStudentInArrayAndShift(student, studentRoster)) {
                if (addStudent(studentWaitlist[0])) {
                    // student added from waitlist to roster (Doesn't matter)
                    if (removeStudentInArrayAndShift(studentWaitlist[0], studentWaitlist)) {
                        // remove student from waitlist Doesn't matter)
                        return true;
                    }
                }
                // student removed
                return true;
            }
        } else if(isStudentInArray(student, studentWaitlist)){
            // 1.Remove student from waitlist and shift.

            return removeStudentInArrayAndShift(student, studentWaitlist);
        }
        return false;

    }

}
