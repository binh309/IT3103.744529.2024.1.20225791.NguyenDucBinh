package ooplab01;
import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner_5791 = new Scanner(System.in);

        // Input coefficients for the quadratic equation
        System.out.print("Enter coefficient a (first_number_5791): ");
        double first_number_5791 = scanner_5791.nextDouble();

        System.out.print("Enter coefficient b (second_number_5791): ");
        double second_number_5791 = scanner_5791.nextDouble();

        System.out.print("Enter constant c (third_number_5791): ");
        double third_number_5791 = scanner_5791.nextDouble();

        // Check if the equation is actually quadratic (a != 0)
        if (first_number_5791 == 0) {
            System.out.println("This is not a quadratic equation since a = 0.");
        } else {
            // Calculate the discriminant (b^2 - 4ac)
            double discriminant_5791 = second_number_5791 * second_number_5791 - 4 * first_number_5791 * third_number_5791;

            // Check the nature of the discriminant
            if (discriminant_5791 > 0) {
                // Two real and distinct roots
                double x1_5791 = (-second_number_5791 + Math.sqrt(discriminant_5791)) / (2 * first_number_5791);
                double x2_5791 = (-second_number_5791 - Math.sqrt(discriminant_5791)) / (2 * first_number_5791);
                System.out.printf("The equation has two real and distinct roots: x1 = %.2f, x2 = %.2f%n", x1_5791, x2_5791);
            } else if (discriminant_5791 == 0) {
                // One real root (double root)
                double x_5791 = -second_number_5791 / (2 * first_number_5791);
                System.out.printf("The equation has one real root: x = %.2f%n", x_5791);
            } else {
                // No real roots (complex roots)
                double realPart_5791 = -second_number_5791 / (2 * first_number_5791);
                double imaginaryPart_5791 = Math.sqrt(-discriminant_5791) / (2 * first_number_5791);
                System.out.printf("The equation has two complex roots: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi%n", 
                                  realPart_5791, imaginaryPart_5791, realPart_5791, imaginaryPart_5791);
            }
        }

        scanner_5791.close(); // Close the scanner to prevent resource leaks
    }
}
