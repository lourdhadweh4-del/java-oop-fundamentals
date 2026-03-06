public class StudentMain {
    public static void main(String[] args) {
        Student B1 = new Student ();
        B1.setGpa(3.8);
        B1.setGpa(5.0);
        System.out.println("Student ID: " + B1.getStudentID());
        System.out.println("Valid GPA: " + B1.getGpa());
    }
}
