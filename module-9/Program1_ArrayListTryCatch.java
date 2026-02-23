import java.util.ArrayList;
import java.util.Scanner;

public class Program1_ArrayListTryCatch {
    public static void main(String[] args) {
        // ArrayList with at least 10 Strings
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

        // Print using for-each loop
        System.out.println("ArrayList contents:");
        for (String s : words) {
            System.out.println(" - " + s);
        }

        Scanner scanner = new Scanner(System.in);

        // Ask user which element they'd like to see again.
        // We'll accept a String input (index as text), then parse it.
        System.out.print("\nEnter the index (0-" + (words.size() - 1) + ") of the element to see again: ");
        String userInput = scanner.nextLine(); // working with user's String input

        try {
            // Parse index from String -> int
            int indexPrimitive = Integer.parseInt(userInput);

            // Autoboxing: primitive int -> Integer object
            Integer indexBoxed = indexPrimitive;

            // Auto-unboxing: Integer -> int when used as an index
            System.out.println("You chose: " + words.get(indexBoxed));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("An Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException ex) {
            // Not required by prompt, but prevents crashing on non-numeric input
            System.out.println("Invalid number format. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}