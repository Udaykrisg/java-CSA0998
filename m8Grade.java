import java.util.Scanner;
public class m8Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Python:");
        double pythonMarks = sc.nextDouble();
        System.out.println("Enter the marks in C Programming:");
        double cProgrammingMarks = sc.nextDouble();
        System.out.println("Enter the marks in Mathematics:");
        double mathematicsMarks = sc.nextDouble();
        System.out.println("Enter the marks in Physics:");
        double physicsMarks = sc.nextDouble();
// Validate input marks
        if (pythonMarks >= 0 && pythonMarks <= 100 && cProgrammingMarks >= 0 && cProgrammingMarks <= 100
                && mathematicsMarks >= 0 && mathematicsMarks <= 100 && physicsMarks >= 0 && physicsMarks <=
                100) {
            double totalMarks = pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
            double aggregate = totalMarks / 4.0;
            System.out.println("Total= " + totalMarks);
            System.out.println("Aggregate = " + aggregate);
            if (aggregate > 75) {
                System.out.println("DISTINCTION");
            } else if (aggregate >= 60 && aggregate < 75) {
                System.out.println("First Division");
            } else if (aggregate >= 50 && aggregate < 60) {
                System.out.println("Second Division");
            } else if (aggregate >= 40 && aggregate < 50) {
                System.out.println("Third Division");
            } else {
                System.out.println("Fail");
            }
        } else
        {
            System.out.println("Invalid marks. Please enter valid marks between 0 and 100.");
        }
        sc.close();
    }
}