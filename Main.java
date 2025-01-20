import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String message = "Namaskara!!!!!";
        String decoratedMessage = decorateMessage(message);
        System.out.println(decoratedMessage);
    }

    private static String decorateMessage(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        message = message + "\n" + timestamp;
        
        String border = "*".repeat(message.length() + 4);
        
        // ANSI escape codes for colors
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        
        // Adding more sparkles and emojis
        String sparkles = "✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨";
        String laughingEmoji = "😂😂😂";
        String dedEmoji = "👻👻👻👻👻👻💀💀💀👻👻👻👻👻👻";
        String chandramukhi = "Chandramukhi Avre 👻";
        String lensLady = "Lens Lady 🤓";
        String yedava = "Yedava 🤪";
        String boxerAunty = "Boxer Aunty 🥊";
        String kaliBro = "Kali Bro 😎";
        String curlyLambu = "Curly Lambu 🌀";
        String mohini = "Mohini 👧";
        String cameramansBoy = "Cameraman's Boy 📷";
        String bengaliNuclearMouse = "Bengali Nuclear Mouse 🐭💥";
        
        return String.format("%s%s\n%s* %s%s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s* %s%s *\n%s%s\n%s%s%s", 
                             red, border, 
                             green, yellow, message, green, 
                             green, sparkles, green, 
                             green, laughingEmoji, green, 
                             green, dedEmoji, green, 
                             green, chandramukhi, green, 
                             green, lensLady, green, 
                             green, yedava, green, 
                             green, boxerAunty, green, 
                             green, kaliBro, green, 
                             green, curlyLambu, green, 
                             green, mohini, green, 
                             green, cameramansBoy, green, 
                             green, bengaliNuclearMouse, green, 
                             red, border, 
                             yellow, timestamp, reset);
    }
}