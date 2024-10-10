import java.util.Scanner;

public class CollegeUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();

        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaff = staffUsers / 3;

        int studentUsers = totalUsers - (staffUsers + nonTeachingStaff);

        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}
