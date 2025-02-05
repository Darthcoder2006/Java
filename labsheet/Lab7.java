package labsheet;
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        scanner.close();

        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
            } else {
                bill = 100 * 1.50 + 200 * 2.50 + (units - 300) * 3.50;
            }
    
            System.out.println("The total bill for " + units + " units is: ₹" + bill);
        }
    }