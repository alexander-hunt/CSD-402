public class PowerPyramid {
    public static void main(String[] args) {
        int rows = 7;
        int slotWidth = 3; // Space for the number + padding
        
        // The bottom row has (2 * rows - 1) numbers. 
        // Use this to calculate the total horizontal width.
        int totalWidth = (2 * rows - 1) * slotWidth;

        for (int i = 0; i < rows; i++) {
            StringBuilder rowContent = new StringBuilder();

            // 1. Calculate leading spaces to center the row
            // Each row has (2 * i + 1) numbers.
            int numbersInRow = (2 * i + 1);
            int padding = (totalWidth - (numbersInRow * slotWidth)) / 2;
            
            for (int s = 0; s < padding; s++) {
                rowContent.append(" ");
            }

            // 2. Add increasing powers
            for (int j = 0; j <= i; j++) {
                String num = String.valueOf((int) Math.pow(2, j));
                rowContent.append(String.format("%-" + slotWidth + "s", num));
            }

            // 3. Add decreasing powers
            for (int j = i - 1; j >= 0; j--) {
                String num = String.valueOf((int) Math.pow(2, j));
                rowContent.append(String.format("%-" + slotWidth + "s", num));
            }

            // 4. Print row content, right-padded to totalWidth, then add @
            System.out.printf("%-" + totalWidth + "s@%n", rowContent.toString());
        }
    }
}