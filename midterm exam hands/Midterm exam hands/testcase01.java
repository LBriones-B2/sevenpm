import java.util.Scanner;

public class Testcase02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        
        String[] studentNames = new String[numStudents];
        double[] grades = new double[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            
            System.out.print("Enter the grade for " + studentNames[i] + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            String letterGrade;
            if (grades[i] >= 90) {
                letterGrade = "A";
            } else if (grades[i] >= 80) {
                letterGrade = "B";
            } else if (grades[i] >= 70) {
                letterGrade = "C";
            } else if (grades[i] >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.println(studentNames[i] + ": " + grades[i] + " (" + letterGrade + ")");
        }
        
        scanner.close();
    }
}
