import java.util.Scanner;
public class namg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter gender:");
        String gender = scanner.next();
        System.out.println("Enter marks:");
        double marks = scanner.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
        scanner.close();
    }
}