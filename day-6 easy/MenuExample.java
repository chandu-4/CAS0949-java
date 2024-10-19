import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. if-else Statement");
            System.out.println("2. switch Statement");
            System.out.println("3. for Loop");
            System.out.println("4. while Loop");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Syntax for if-else:");
                    System.out.println("if (condition) {");
                    System.out.println("   // code");
                    System.out.println("} else {");
                    System.out.println("   // code");
                    System.out.println("}");
                    break;
                case 2:
                    System.out.println("Syntax for switch:");
                    System.out.println("switch (expression) {");
                    System.out.println("   case value1:");
                    System.out.println("       // code");
                    System.out.println("       break;");
                    System.out.println("   default:");
                    System.out.println("       // code");
                    System.out.println("}");
                    break;
                case 3:
                    System.out.println("Syntax for for loop:");
                    System.out.println("for (initialization; condition; increment) {");
                    System.out.println("   // code");
                    System.out.println("}");
                    break;
                case 4:
                    System.out.println("Syntax for while loop:");
                    System.out.println("while (condition) {");
                    System.out.println("   // code");
                    System.out.println("}");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }
}
