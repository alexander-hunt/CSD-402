import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer choice (1–3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user
        System.out.print("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = scanner.nextInt();

        // Convert numbers to words
        String computerMove = convertChoice(computerChoice);
        String userMove = convertChoice(userChoice);

        // Display choices
        System.out.println("Computer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine result
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        scanner.close();
    }

    private static String convertChoice(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
