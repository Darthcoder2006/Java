package labsheet;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("The result of addition is: " + (num1 + num2));
                case 2 -> System.out.println("The result of subtraction is: " + (num1 - num2));
                case 3 -> System.out.println("The result of multiplication is: " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) System.out.println("The result of division is: " + (num1 / num2));
                    else System.out.println("Division by zero is not allowed.");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
