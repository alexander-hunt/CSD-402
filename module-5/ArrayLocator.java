import java.util.Arrays;

public class ArrayLocator {

    // -------- Largest (double) --------
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Largest (int) --------
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Smallest (double) --------
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Smallest (int) --------
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Main method (demonstration) --------
    public static void main(String[] args) {

        int[][] intArray = {
            {3, 5, 1},
            {9, 2, 8},
            {4, 6, 7}
        };

        double[][] doubleArray = {
            {2.5, 7.1, 3.3},
            {9.8, 1.2, 4.6},
            {5.0, 6.4, 8.9}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Int array largest location: " + Arrays.toString(largestInt)
                + " value = " + intArray[largestInt[0]][largestInt[1]]);
        System.out.println("Int array smallest location: " + Arrays.toString(smallestInt)
                + " value = " + intArray[smallestInt[0]][smallestInt[1]]);

        System.out.println("Double array largest location: " + Arrays.toString(largestDouble)
                + " value = " + doubleArray[largestDouble[0]][largestDouble[1]]);
        System.out.println("Double array smallest location: " + Arrays.toString(smallestDouble)
                + " value = " + doubleArray[smallestDouble[0]][smallestDouble[1]]);
    }
}
