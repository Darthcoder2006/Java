import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's roll number: ");
        String rollNumber = scanner.nextLine();
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student's marks in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        System.out.print("Enter student's attendance percentage: ");
        double attendance = scanner.nextDouble();
        double average = 0;
        for (int mark : marks) {
            average += mark;
        }
        average /= marks.length;
        System.out.println(name + " (Roll Number: " + rollNumber + ") has an average of " + average + ".");
        if (average >= 50 && attendance >= 75) {
            System.out.println(name + " is eligible for promotion to the second year.");
        } else {
            System.out.println(name + " is not eligible for promotion to the second year.");
        }
        scanner.close();
    }
}