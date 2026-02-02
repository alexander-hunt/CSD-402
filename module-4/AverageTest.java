import java.util.Arrays;

public class AverageTest {

    // Overloaded average methods
    public static short average(short[] array) {
        long sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {

        short[] shortArray = {2, 4, 6};                 // size 3
        int[] intArray = {10, 20, 30, 40};              // size 4
        long[] longArray = {100L, 200L, 300L, 400L, 500L}; // size 5
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5}; // size 6

        System.out.println("SHORT ARRAY");
        System.out.println("Elements: " + Arrays.toString(shortArray));
        System.out.println("Average : " + average(shortArray));
        System.out.println();

        System.out.println("INT ARRAY");
        System.out.println("Elements: " + Arrays.toString(intArray));
        System.out.println("Average : " + average(intArray));
        System.out.println();

        System.out.println("LONG ARRAY");
        System.out.println("Elements: " + Arrays.toString(longArray));
        System.out.println("Average : " + average(longArray));
        System.out.println();

        System.out.println("DOUBLE ARRAY");
        System.out.println("Elements: " + Arrays.toString(doubleArray));
        System.out.println("Average : " + average(doubleArray));
    }
}
