import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FilesReadWriteExample {
    public static void main(String[] args) {
        try {
            // Write to file
            Files.writeString(Paths.get("example2.txt"), "Hello, this is a new file using Files.writeString.");

            // Read from file
            String content = Files.readString(Paths.get("example2.txt"));
            System.out.println("File content: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
