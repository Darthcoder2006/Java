package labsheet;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result of multiplication is: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result of division is: " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
