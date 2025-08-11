public class Student {
    private String StudentName;
    private String StudentId;
    private int StudentAge;
    private double StudentGrades;


    public Student(String StudentName, String StudentId, int StudentAge, double StudentGrades){
        this.StudentName = StudentName;
        this.StudentId = StudentId;
        this.StudentAge = StudentAge;
        this.StudentGrades = StudentGrades;
    }

    public String getStudentName(){
        return StudentName;
    }
    public double getStudentGrades(){
        return StudentGrades;
    }


    @Override
    public String toString() {
        return ("Student name: " + StudentName + ", Student ID: " + StudentId +  ", Student Age: " + StudentAge + ", Student Grade: " + StudentGrades);
    }


}
