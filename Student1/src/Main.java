import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args) {

        School school = new School();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nStudent List");
            System.out.print("1. Add Name ");
            System.out.print("2.Remove Student ");
            System.out.print("3.List All Students ");
            System.out.print("4.Calculate Average ");
            System.out.println("5.Exit ");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student name: ");
                        String StudentName = scanner.nextLine();

                        System.out.print("Enter Student Id: ");
                        String StudentId = scanner.nextLine();

                        System.out.print("Enter Student Age: ");
                        int StudentAge = scanner.nextInt();

                        System.out.print("Enter Student grade: ");
                        double StudentGrades = scanner.nextDouble();


                        Student newstudent = new Student(StudentName, StudentId, StudentAge, StudentGrades);
                        school.addStudent(newstudent);
                        break;

                    case 2:
                        System.out.print("Enter the name of Student to remove: ");
                        String remove = scanner.nextLine();
                        try {
                            school.removeStudent(remove);
                        } catch (Exception e) {
                            System.out.println("The student does not exist");
                        }
                        break;

                    case 3:
                        school.listStudents();
                        break;

                    case 4:
                        double average = school.calculateAverageGrade();
                        System.out.println("Average Grade: " + average);
                        break;


                    case 5:
                        System.out.println("Exiting Student System...");

                    default:
                        System.out.println("Invalid choice. Choose between 1 - 5");
                }
            } catch(InputMismatchException e) {
                System.out.println("Please enter a number from 1 - 5!");
                scanner.nextLine();
                choice = 0;
            }
            }while(choice!=5);
            scanner.close();
        }
}