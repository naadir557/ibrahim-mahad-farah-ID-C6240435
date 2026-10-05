
public class student {

    // Shared by all students
    private static final String UNIVERSITY_NAME = "University of Somalia";

    // Encapsulated fields
    private String studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    // Constructor
    public student(String studentId, String name, int age,
                   String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;

        setAge(age);
        setGpa(gpa);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException(
                    "Age must be between 16 and 100."
            );
        }
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException(
                    "GPA must be between 0.0 and 4.0."
            );
        }
        this.gpa = gpa;
    }

    // Display student information
    public void displayStudentInformation() {
        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Result: " +
                (hasPassed() ? "Passed" : "Failed"));
        System.out.println("----------------------------");
    }

    // Determine whether the student has passed
    public boolean hasPassed() {
        return gpa >= 2.0;
    }

    // Main method to demonstrate the program
    public static void main(String[] args) {

        // Create four Student objects
        student student1 = new student(
                "ST001", "Ahmed", 21,
                "Computer Science", 3.5
        );

        student student2 = new student(
                "ST002", "Fatima", 22,
                "Information Technology", 2.8
        );

        student student3 = new student(
                "ST003", "Ali", 20,
                "Software Engineering", 1.7
        );

        student student4 = new student(
                "ST004", "Aisha", 23,
                "Business Administration", 3.2
        );

        // Display information for all students
        student1.displayStudentInformation();
        student2.displayStudentInformation();
        student3.displayStudentInformation();
        student4.displayStudentInformation();
    }
}
