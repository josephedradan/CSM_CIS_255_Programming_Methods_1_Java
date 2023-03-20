import java.util.ArrayList;

import static java.util.stream.Collectors.joining;

/*
Joseph Edradan
CIS-255-OLH-CRN88669
9/28/18

Description:
    CourseAL

*** IMPORTANT NOTE ***:
    Priority is:
        ROSTER
        WAITLIST

    IF WAITLIST HAS SOMEONE THEN ANYONE ELSE WILL BE ADDED TO WAITLIST FIRST THEN YOU CAN ADD AGAIN TO BE IN ROSTER IF
    ROSTER HAS SPACE.

    JUSTIFICATION: ANYONE ON THE WAITLIST SHOULD HAVE PRIORITY OVER SOMEONE NOT ON THE WAITLIST.

    IGNORE IMPORTANT NOTE IF CODE FROM dropStudentV2 IS USED INSTEAD OF dropStudent

Notes:

 */
public class CourseAL {
    private String courseName;

    private ArrayList<Student> studentRoster;
    private ArrayList<Student> studentWaitlist;

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
//        CourseAL course = new CourseAL("Meme Class", 5, 5);
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

    public CourseAL(String courseName, int maxRoster, int maxWaitlist) {
        this.courseName = courseName;
        this.maxRoster = maxRoster;
        this.maxWaitlist = maxWaitlist;
        this.studentRoster = new ArrayList(maxRoster);
        this.studentWaitlist = new ArrayList(maxWaitlist);

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

    public ArrayList getStudentRoster() {
        return studentRoster;

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public void setMaxRoster(int maxRoster) {
        this.maxRoster = maxRoster;
    }

    public void setMaxWaitlist(int maxWaitlist) {
        this.maxWaitlist = maxWaitlist;
    }

    public ArrayList getStudentWaitlist() {
        return studentWaitlist;

    }

    public String getFormattedStudentArray(ArrayList<Student> studentArrayList) {
        return studentArrayFullNameToString(studentArrayList);
    }

    // I PREFER THIS FORMATTING.
    public String studentArrayFullNameToString(ArrayList<Student> studentArrayList) {
        String text = "";
        for (int i = 0; i < studentArrayList.size(); i++) {
            // Spacing
            if (i % 5 == 0) {
                text = text + "\n     ";
            }
            text = text + String.format("%s, ", studentArrayList.get(i));

        }
        if (text.length() < 2) {
            return "None";
        } else {
            return text.substring(0, text.length() - 2);
        }
    }

    // I PREFER MY FORMATTING OVER THIS ONE.
    public String studentArrayFullNameToStringActual(ArrayList<Student> studentArrayList) {
        return String.format("\n     %s\n", studentArrayList.toString());
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
                studentRoster.size(),
                maxRoster,
                studentArrayFullNameToString(studentRoster),
                studentWaitlist.size(),
                maxWaitlist,
                studentArrayFullNameToString(studentWaitlist));
    }
    public boolean isStudentObject(Student student){
        if(student instanceof Student){
            return true;
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
        if (studentRoster.contains(student)) {
            return false;
        }
        // Already in waitlist
        if (studentWaitlist.contains(student)) {
            if (studentRoster.size() < maxRoster) {
                studentWaitlist.remove(student);
                return studentRoster.add(student);
            }
        }
        // Not in waitlist and Not in roster.
        if (!studentWaitlist.contains(student) && !studentRoster.contains(student)) {
            // If students in waitlist, CANNOT ADD IN CLASS UNTIL WAITLIST IS EMPTY.
            if (studentWaitlist.size() > 0) {
                if (studentWaitlist.size() < maxWaitlist) {
                    return studentWaitlist.add(student);
                }
            } else {
                // Add to roster if not full.
                if (studentRoster.size() < maxRoster) {
                    return studentRoster.add(student);
                }
                // Add to waitlist if roster full and waitlist not full.
                else if (studentWaitlist.size() < maxWaitlist) {
                    return studentWaitlist.add(student);
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
        if (studentRoster.contains(student)) {
            // 1.Remove student from roster and shift.

            return studentRoster.remove(student);

        } else if (studentWaitlist.contains(student)) {
            // 1.Remove student from waitlist and shift.

            return studentWaitlist.remove(student);
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
        if (studentRoster.contains(student)) {
            // 1.Remove student from roster and shift.
            // 2.Add student from waitlist to roster and shift waitlist.

            // If removal is successful.
            if (studentRoster.remove(student)) {
                if (addStudent(studentWaitlist.get(0))) {
                    // student added from waitlist to roster (Doesn't matter)
                    if (studentWaitlist.remove(studentWaitlist.get(0))) {
                        // remove student from waitlist Doesn't matter)
                        return true;
                    }
                }
                // student removed
                return true;
            }
        } else if (studentWaitlist.contains(student)) {
            // 1.Remove student from waitlist and shift.

            return studentWaitlist.remove(student);
        }
        return false;

    }

}
