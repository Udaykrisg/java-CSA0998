import java.util.Scanner;

public class m6Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter the employee's grade (A or B): ");
        char grade = scanner.next().charAt(0);
        double bonusPercentage;
        if (grade == 'A') {
            bonusPercentage = 0.05; // 5% bonus for Grade A
        } else if (grade == 'B') {
            bonusPercentage = 0.10; // 10% bonus for Grade B
        } else {
            System.out.println("Invalid grade entered. Exiting program.");
            return;
        }
        if (salary < 10000) {
            bonusPercentage += 0.02;
        }
        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;
        System.out.println("\nEmployee Details:");
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Bonus Percentage: " + (bonusPercentage * 100) + "%");
        System.out.println("Bonus Amount: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);
    }
}