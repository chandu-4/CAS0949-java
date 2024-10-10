import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        double bonus = 0;
        if (grade == 'A' || grade == 'a') {
            bonus = salary * 0.05;
        } else if (grade == 'B' || grade == 'b') {
            bonus = salary * 0.10;
        } else {
            System.out.println("Invalid grade entered!");
            return;
        }
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        double totalSalary = salary + bonus;
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + totalSalary);

        scanner.close();
    }
}
