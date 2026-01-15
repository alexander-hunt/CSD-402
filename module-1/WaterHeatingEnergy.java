import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (°C): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (°C): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using the formula Q = m * (Tf - Ti) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy required is " + energy + " Joules.");

        input.close();
    }
}
