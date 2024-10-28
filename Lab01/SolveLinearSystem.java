package ooplab01;
import java.util.Scanner;

public class SolveLinearSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coefficients for the first equation
        System.out.print("Enter the coefficient a11 : ");
        double first_number_5791 = scanner.nextDouble();

        System.out.print("Enter the coefficient a12 : ");
        double second_number_5791 = scanner.nextDouble();

        System.out.print("Enter the constant b1 : ");
        double third_number_5791 = scanner.nextDouble();

        // Coefficients for the second equation
        System.out.print("Enter the coefficient a21 : ");
        double fourth_number_5791 = scanner.nextDouble();

        System.out.print("Enter the coefficient a22 : ");
        double fifth_number_5791 = scanner.nextDouble();

        System.out.print("Enter the constant b2 : ");
        double sixth_number_5791 = scanner.nextDouble();

        // Check for special cases
        // First equation check
        if (first_number_5791 == 0 && second_number_5791 == 0) {
            if (third_number_5791 != 0) {
                System.out.println("The system has no solution");
                scanner.close();
                return;
            } 
        }

        // Second equation check
        if (fourth_number_5791 == 0 && fifth_number_5791 == 0) {
            if (sixth_number_5791 != 0) {
                System.out.println("The system has no solution ");
                scanner.close();
                return; 
            } else {
                System.out.println("The system has infinitely");
                scanner.close();
                return;
            }
        }

        // Calculate determinants
        double determinant_D_5791 = first_number_5791 * fifth_number_5791 - fourth_number_5791 * second_number_5791;
        double determinant_D1_5791 = third_number_5791 * fifth_number_5791 - sixth_number_5791 * second_number_5791;
        double determinant_D2_5791 = first_number_5791 * sixth_number_5791 - fourth_number_5791 * third_number_5791;

        // Check the conditions for solutions
        if (determinant_D_5791 == 0) {
            if (determinant_D1_5791 == 0 && determinant_D2_5791 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            // Use Cramer's rule to find the solution
            double x1_5791 = determinant_D1_5791 / determinant_D_5791; // Solution for x1
            double x2_5791 = determinant_D2_5791 / determinant_D_5791; // Solution for x2
            
            // Print the results
            System.out.printf("The solution is: x1 = %.2f, x2 = %.2f%n", x1_5791, x2_5791);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

