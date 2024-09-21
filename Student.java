public class Student {
    private String name;
    private int age;
    private int grade;
    private double gpa;

    // constructor 
    public Student(String studentName, int studentAge, int studentGrade, double studentGpa){
        name = studentName;
        age = studentAge ;
        grade = studentGrade ;
        gpa = studentGpa ;

    }
    public void printStudentInfo() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Grade: " + grade + "th Grade");
        System.out.println("Student's Age: " + age);
        System.out.println("Student's GPA: " + gpa);
    }
    public void printIntroResume () {
        System.out.println("This is the transcript of " + name + ":");
    }
}
