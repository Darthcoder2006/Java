import java.util.Scanner;

public class RoomVolume {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        double length, breadth, height;

        // Prompt the user to enter the dimensions of the room
        System.out.print("Enter the length, breadth and height of the room in meters: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();

        // Calculate the volume
        double volume = length * breadth * height;

        // Display the volume
        System.out.println("The volume of the room is: " + volume + " cubic meters");

        // Determine if the air conditioner is suitable
        if (volume <= 80) {
            System.out.println("The air conditioner is suitable for the room.");
        } else {
            System.out.println("The air conditioner is not suitable for the room.");
        }

        // Calculate the new volume if the height is increased to 4 meters
        double newHeight = 4.0;
        double newVolume = length * breadth * newHeight;

        // Display the new volume
        System.out.println("If the height is increased to 4 meters, the new volume of the room is: " + newVolume + " cubic meters");

        // Reassess if the air conditioner is still suitable
        if (newVolume <= 80) {
            System.out.println("The air conditioner is still suitable for the room.");
        } else {
            System.out.println("The air conditioner is not suitable for the room.");
        }

        // Close the scanner
        sc.close();
    }
}
// Task b: Calculate the new volume if the height is increased to 4 meters
double newHeight = 4.0;
double newVolume = length * breadth * newHeight;

// Display the new volume
System.out.println("If the height is increased to 4 meters, the new volume of the room is: " + newVolume + " cubic meters");

// Task c: Reassess if the air conditioner is still suitable
if (newVolume <= 80) {
    System.out.println("The air conditioner is still suitable for the room.");
} else {
    System.out.println("The air conditioner is not suitable for the room.");
}