/*
Joseph Edradan
CIS-255-OLH-CRN88669
9/28/18

Description:
    Interactive Driver
        It displays stuff.
*/

import java.util.Arrays;
import java.util.Scanner;

public class InteractiveDriver {

    private static String textAskCourse = "Enter Course Name: ";
    private static String textAskRosterSize = "Enter Maximum Roster Size: ";
    private static String textAskWaitlistSize = "Enter Maximum Waitlist Size: ";

    private static String initialQuestionAmountOfStudents = "\nFor the class/school, Enter Maximum amount of students: ";

    private static String menu = String.format("\nActions Menu:\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
            "1. Add student",
            "2. Drop Student",
            "3. Drop Student V2 (Automatically adds student to roster from being First in waitlist)",
            "4. Print Course",
            "5. Joseph's Custom Test",
            "6. Joseph's Custom Test CourseAL",
            "7. Exit",
            "Enter action: ");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        int option;

        Course course;
        String courseName;
        int courseMaxRoster;
        int courseMaxWaitlist;

//        Student[] studentsInClass;

        // Program starts here:

        System.out.print(textAskCourse);
        courseName = scanner.nextLine();
        System.out.print(textAskRosterSize);
        courseMaxRoster = scanner.nextInt();
        System.out.print(textAskWaitlistSize);
        courseMaxWaitlist = scanner.nextInt();

        course = new Course(courseName, courseMaxRoster, courseMaxWaitlist);

//        System.out.print(initialQuestionAmountOfStudents);
//        studentsInClass = new Student[scanner.nextInt()];


        while (running) {
            System.out.print(menu);
            try{
                option = scanner.nextInt();
                courseOptionDecider(option, course);
            }catch (Exception e){
                exitProgram();
            }
        }

    }

    public static void courseOptionDecider(int option, Course course) {
        Student student;
        switch (option) {
            case 1:
                student = askStudent();
                if (course.addStudent(student)) {
                    System.out.println("\nStudent: " + student + " Added");
                } else {
                    System.out.println("\nStudent: " + student + " Not Added");
                }
                break;
            case 2:
                System.out.printf(
                        "Students in roster: %s\n" +
                                "Students in waitlist: %s\n",
                        course.getFormattedStudentArray(course.getStudentRoster()),
                        course.getFormattedStudentArray(course.getStudentWaitlist()));

                student = askStudent();
                if (course.dropStudent(student)) {
                    System.out.println("\nStudent: " + student + " Dropped");
                } else {
                    System.out.println("\nStudent: " + student + " Not Dropped");
                }
                break;
            case 3:
                System.out.printf(
                        "Students in roster: %s\n" +
                                "Students in waitlist: %s\n",
                        course.getFormattedStudentArray(course.getStudentRoster()),
                        course.getFormattedStudentArray(course.getStudentWaitlist()));

                student = askStudent();
                if (course.dropStudentV2(student)) {
                    System.out.println("\nStudent: " + student + " Dropped");
                } else {
                    System.out.println("\nStudent: " + student + " Not Dropped");
                }
            case 4:
                printCourse(course);
                break;
            case 5:
                customTest();
                break;
            case 6:
                customTest2();
                break;
            case 7:
                exitProgram();
                break;
        }
    }


    public static Student askStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String askFirst = "Enter First name: ";
        String askLast = "Enter Last name: ";
        String askID = "Enter ID: ";
        String askTuitionPaid = "Is the Tuition paid? (y/n): ";

        String firstName;
        String lastName;
        String ID;
        char tuitionPaid;

        System.out.print(askFirst);
        firstName = scanner.nextLine();

        System.out.print(askLast);
        lastName = scanner.nextLine();

        System.out.print(askID);
        ID = scanner.nextLine();

        System.out.print(askTuitionPaid);
        tuitionPaid = scanner.next().charAt(0);

        if (tuitionPaid == 'y') {
            return new Student(firstName, lastName, ID, true);
        } else {
            return new Student(firstName, lastName, ID, false);
        }

    }

    private static void printCourse(Course course) {
        System.out.println(course);

    }
    private static void customTest(){
        System.out.println("######################################################" +
                "#############################################\n\n\n");
        Student[] studentsInSchool = new Student[15];

        studentsInSchool[0] = new Student("Dude 1", "", "S925", true);
        studentsInSchool[1] = new Student("Dude 2", "", "S713", false); // not in
        studentsInSchool[2] = new Student("Dude 3", "", "S512", true);
        studentsInSchool[3] = new Student("Dude 4", "", "S513", true);
        studentsInSchool[4] = new Student("Dude 5", "", "S516", true);
        studentsInSchool[5] = new Student("Dude 6", "", "S956", true); // 5th
        studentsInSchool[6] = new Student("Dude 7", "", "S419", true);
        studentsInSchool[7] = new Student("Dude 8", "", "S281", true);
        studentsInSchool[8] = new Student("Dude 9", "", "S790", true);
        studentsInSchool[9] = new Student("Dude 10", "", "S336", true);
        studentsInSchool[10] = new Student("Dude 11", "", "S156", true); // 10th
        studentsInSchool[11] = new Student("Dude 12", "", "S219", true);
        studentsInSchool[12] = new Student("Dude 13", "", "S472", true);
        studentsInSchool[13] = new Student("Dude 14", "", "S892", true);
        studentsInSchool[14] = new Student("Dude 15", "", "S901", true);

        Course course = new Course("Meme Class", 5, 5);

        for(Student student : studentsInSchool) {
            boolean added = course.addStudent(student);
            System.out.println(student + (added ? " added successfully" : " not added"));
        }

        System.out.println(course);
        System.out.println("\n\n\n");

        System.out.println();
        course.dropStudentV2(studentsInSchool[4]);
        System.out.println("Dude 5 SHOULD BE removed in roster AND Dude 7 added in roster");
        System.out.println(course);

        course.addStudent(studentsInSchool[14]);
        System.out.println("Dude 15 SHOULD BE added in whitelist");
        System.out.println(course);

        System.out.println("######################################################" +
                "#############################################\n\n\n");

    }
    private static void customTest2() {
        System.out.println("######################################################" +
                "#############################################\n\n\n");
        Student[] studentsInSchool = new Student[15];

        studentsInSchool[0] = new Student("Dude 1", "", "S925", true);
        studentsInSchool[1] = new Student("Dude 2", "", "S713", false); // not in
        studentsInSchool[2] = new Student("Dude 3", "", "S512", true);
        studentsInSchool[3] = new Student("Dude 4", "", "S513", true);
        studentsInSchool[4] = new Student("Dude 5", "", "S516", true);
        studentsInSchool[5] = new Student("Dude 6", "", "S956", true); // 5th
        studentsInSchool[6] = new Student("Dude 7", "", "S419", true);
        studentsInSchool[7] = new Student("Dude 8", "", "S281", true);
        studentsInSchool[8] = new Student("Dude 9", "", "S790", true);
        studentsInSchool[9] = new Student("Dude 10", "", "S336", true);
        studentsInSchool[10] = new Student("Dude 11", "", "S156", true); // 10th
        studentsInSchool[11] = new Student("Dude 12", "", "S219", true);
        studentsInSchool[12] = new Student("Dude 13", "", "S472", true);
        studentsInSchool[13] = new Student("Dude 14", "", "S892", true);
        studentsInSchool[14] = new Student("Dude 15", "", "S901", true);

        CourseAL course = new CourseAL("Meme Class", 5, 5);

        for(Student student : studentsInSchool) {
            boolean added = course.addStudent(student);
            System.out.println(student + (added ? " added successfully" : " not added"));
        }

        System.out.println(course);
        System.out.println("\n\n\n");

        System.out.println();
        course.dropStudentV2(studentsInSchool[4]);
        System.out.println("Dude 5 SHOULD BE removed in roster AND Dude 7 added in roster");
        System.out.println(course);

        course.addStudent(studentsInSchool[14]);
        System.out.println("Dude 15 SHOULD BE added in whitelist");
        System.out.println(course);

        System.out.println("######################################################" +
                "#############################################\n\n\n");
    }

    private static void exitProgram() {
        System.exit(0);
    }

}
