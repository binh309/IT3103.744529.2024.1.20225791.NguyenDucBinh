package ooplab01;

import java.util.Scanner;

public class linear_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for the coefficient a
        System.out.print("Enter the coefficient a : ");
        double first_number_5791 = scanner.nextDouble();

        // Prompt for the constant b
        System.out.print("Enter the constant b : ");
        double second_number_5791 = scanner.nextDouble();

        // Check if a is not zero to avoid division by zero
        if (first_number_5791 == 0) {
            while(first_number_5791==0){
                System.out.print("Coefficient a cannot be zero in a linear equation,please reenter the first number:");
                first_number_5791= scanner.nextDouble();
            }
        } 
        // Calculate the value of x
        double x_5791;
        if(second_number_5791 ==0){
                x_5791=0;
        }
        else
        x_5791 = -1.0*second_number_5791 / first_number_5791;

        // Print the result
        System.out.printf("The solution of the equation %.2f x + (%.2f) = 0 is: x = %.2f%n", first_number_5791, second_number_5791, x_5791);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
