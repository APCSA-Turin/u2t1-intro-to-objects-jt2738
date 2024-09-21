public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Stacy", 13, 9, 3.8);
        student1.printIntroResume();
        System.out.println();
        student1.printStudentInfo();
        System.out.println("----------");
        Student student2 = new Student("Joe", 15, 11, 3.7);
        student2.printIntroResume();
        System.out.println();
        student2.printStudentInfo();
    }
}
