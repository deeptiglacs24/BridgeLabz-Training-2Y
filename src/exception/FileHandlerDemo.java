package exception;
import java.io.*;

class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("✅ File opened successfully: " + fileName);
    }
}

public class FileHandlerDemo {
    public static void main(String[] args) {
        System.out.println("=== File Handler Demo ===");
        try {
            FileHandler fh = new FileHandler("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

