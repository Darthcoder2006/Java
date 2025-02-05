import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base: ");
        double base = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area: " + area);
    }
}