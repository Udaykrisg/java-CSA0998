import java.util.Scanner;

// Interface for calculating total marks
interface Tota {
    int calculateTotal(int[] marks);
}

// Interface for calculating aggregate
interface Aggregate {
    double calculateAggregate(int total, int numberOfSubjects);
}

// Interface for determining the class
interface Classify {
    String getClassification(double aggregate);
}

// Class implementing multiple inheritance
class Student implements Tota, Aggregate, Classify {
    @Override
    public int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    @Override
    public double calculateAggregate(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    @Override
    public String getClassification(double aggregate) {
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60 && aggregate <= 75) {
            return "FIRST DIVISION";
        } else if (aggregate >= 50 && aggregate < 60) {
            return "SECOND DIVISION";
        } else if (aggregate >= 40 && aggregate < 50) {
            return "THIRD DIVISION";
        } else {
            return "FAIL";
        }
    }
}

public class h18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for six subjects
        int[] marks = new int[6];
        System.out.print("Enter the marks in Python: ");
        marks[0] = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        marks[1] = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        marks[2] = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        marks[3] = scanner.nextInt();
        System.out.print("Enter the marks in Chemistry: ");
        marks[4] = scanner.nextInt();
        System.out.print("Enter the marks in Professional Ethics: ");
        marks[5] = scanner.nextInt();

        // Creating an object of the Student class
        Student student = new Student();

        // Calculating total marks
        int totalMarks = student.calculateTotal(marks);
        System.out.println("Total= " + totalMarks);

        // Calculating aggregate
        double aggregate = student.calculateAggregate(totalMarks, marks.length);
        System.out.println("Aggregate = " + aggregate);

        // Getting the classification
        String classification = student.getClassification(aggregate);
        System.out.println("Class: " + classification);

        scanner.close();
    }
}
