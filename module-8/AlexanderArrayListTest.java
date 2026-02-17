import java.util.ArrayList;
import java.util.Scanner;

public class AlexanderArrayListTest {

    // Method that returns the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Integer value : list) {
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            Integer input = scanner.nextInt();
            numbers.add(input);

            if (input == 0) {
                break;
            }
        }

        Integer result = max(numbers);

        System.out.println("The largest value is: " + result);

        scanner.close();
    }
}
