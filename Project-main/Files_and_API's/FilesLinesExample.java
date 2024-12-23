import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FilesLinesExample {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("example.txt"))
                .forEach(System.out::println); // Print each line of the file
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
