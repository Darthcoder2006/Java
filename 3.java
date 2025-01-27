public class 3 {
    
}
public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("No cities provided.");
    } else {
        System.out.println("Cities provided:");
        for (String city : args) {
            System.out.println(city);
        }
    }
}