import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);

        try {
            // Create the file if it does not exist
            if (file.createNewFile()) {
                System.out.println("Created new file: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }

            // Write 10 random integers
            Random rand = new Random();
            FileWriter writer = new FileWriter(file, true);
            
            if (file.length() > 0) {
                writer.write(" ");
            }

            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(100); 
                writer.write(Integer.toString(n));
                if (i < 9) writer.write(" ");
            }

            writer.close();
            System.out.println("Appended 10 random numbers to " + fileName);

            // Reopen the file, read the data, display it
            System.out.println("\nFile contents:");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
            System.out.println();

            fileScanner.close();
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}