import java.util.Scanner;

public class FindWeight {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of an object in kilograms:");

        double enteredValue = input.nextDouble();

        if (enteredValue <= 0) {
            System.out.println("Error, invalid mass entered. The entered mass must be greater than 0.");
        } else {
            double earthGravity = 9.807;
            double mercuryGravity = 3.700;
            double venusGravity = 8.870;
            double moonGravity = 1.6200;

            double earthNewtons = earthGravity * enteredValue;
            double venusNewtons = venusGravity * enteredValue;
            double moonNewtons = moonGravity * enteredValue;
            double mercuryNewtons = mercuryGravity * enteredValue;

            printWeight("Earth", earthNewtons);
            printWeight("Moon", moonNewtons);
            printWeight("Mercury", mercuryNewtons);
            printWeight("Venus", venusNewtons);
        }
    }

    private static void printWeight(String planet, double weight) {
        System.out.printf("%s: %.2f Newtons", planet, weight);

        // Additional messages based on weight
        if (weight > 1250) {
            System.out.println(" - The object is heavy");
        } else if (weight < 20) {
            System.out.println(" - The object is light");
        } else {
            System.out.println(); // New line for neutral weight
        }
    }
}
