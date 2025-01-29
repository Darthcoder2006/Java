import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 15000.00;
        System.out.println("Enter the withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        if (withdrawalAmount <= accountBalance) {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal successful! New balance: " + accountBalance);
        } else {
            System.out.println("Insufficient funds. Please check your balance.");
        }
        scanner.close();
    }
}