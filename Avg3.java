import java.util.Scanner;

public class Avg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Subject: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second subject: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third subject: ");
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);
        scanner.close();
    }
}