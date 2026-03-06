public class studentRecord {
    private int studentID;
    private double gpa; //only reading within this class

    public studentRecord(int studentID) {
        this.studentID = studentID;

    }   //we add a constructor when they ask for a return type

    public int getStudentID() {
        return studentID;

    }

    public double getGpa() {
        return gpa;

    }

    public void setGpa(double newGpa) {

        if (newGpa > 0.0 && newGpa < 4.0) {
            this.gpa = newGpa;
        } else {
            System.out.println("Invalid GPA");
        }

    }

    public class Main {
        public static void main(String[] args) {
            studentRecord student = new studentRecord(2);
            student.setGpa(3.8);
            student.setGpa(5.0);
            System.out.println("Your GPA is: " + student.getGpa());


        }
    }
}


