import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // ArrayList with 10 Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Alpha");
        words.add("Bravo");
        words.add("Charlie");
        words.add("Delta");
        words.add("Echo");
        words.add("Foxtrot");
        words.add("Golf");
        words.add("Hotel");
        words.add("India");
        words.add("Juliet");

        // Print using a for-each loop
        System.out.println("ArrayList contents:");
        for (String s : words) {
            System.out.println(" - " + s);
        }

        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("\nEnter the index (0-" + (words.size() - 1) + ") of the element to see again: ");
        String userInput = scanner.nextLine(); 

        try {
            int indexPrimitive = Integer.parseInt(userInput);
            Integer indexBoxed = indexPrimitive;
            System.out.println("You chose: " + words.get(indexBoxed));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("An Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}