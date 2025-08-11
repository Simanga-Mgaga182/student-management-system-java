import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added: " + student.getStudentName());
    }

    public void removeStudent(String studentName) {
        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                iterator.remove();
                System.out.println("Removed: " + student.getStudentName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with name: \"" + studentName + "\" not found.");
        }
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in class.");
        } else {
            System.out.println("Students in class:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) return 0;

        double total = 0;
        for (Student student : students) {
            total += student.getStudentGrades();
        }
        return total / students.size();
    }
}
