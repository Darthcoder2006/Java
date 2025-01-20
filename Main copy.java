import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main1 {
    public static void main(String[] args) {
        String message = "Chandramukhi Avre!!!!!!!!!! 😂😂😂\n Hitahishini Avre ";
        String decoratedMessage = decorateMessage(message);
        System.out.println(decoratedMessage);
    }

    private static String decorateMessage(String message) {
        String border = "*".repeat(message.length() + 4);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        // ANSI escape codes for colors
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        
        // Adding more sparkles and emojis
        String sparkles = "✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨";
        String laughingEmoji = "😂😂😂";
        String dedEmoji = "👻👻👻👻👻👻💀💀💀👻👻👻👻👻👻";
        
        return String.format("%s%s\n%s* %s%s%s *\n%s* %s%s *\n%s* %s%s *\n%s%s\n%s%s%s", 
                             red, border, 
                             green, yellow, message, green, 
                             green, sparkles, green, 
                             green, laughingEmoji, green, 
                             red, border, 
                             yellow, timestamp, reset);
    }
}