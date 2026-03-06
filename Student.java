public class Student {
    private int studentID;
    private double gpa;

    public Student() {
       studentID = 19756;
               gpa = 2.9;

    }
    public  int getStudentID () {
        return studentID;

    }
    public void setGpa (double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            gpa = newGpa;
        } else {
            System.out.println("Invalid GPA");


        }
    }
    public double getGpa() {
        return gpa;
    }
}
