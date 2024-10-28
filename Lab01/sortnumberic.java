package ooplab01;
import java.util.Arrays;
import java.util.Scanner;

public class sortnumberic {

    public static void main(String[] args) {
        Scanner scanner_5791 = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size_5791 = scanner_5791.nextInt();

        // Declare the array
        int[] array_5791 =new int[size_5791];;

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i_5791 = 0; i_5791 < size_5791; i_5791++) {
            System.out.print("Element " + (i_5791 + 1) + ": ");
            array_5791[i_5791] = scanner_5791.nextInt();
        }

        // Sorting the array
        Arrays.sort(array_5791);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array_5791));

        // Calculate the sum of the array elements
        int sum_5791 = 0;
        for (int i_5791 = 0; i_5791 < size_5791; i_5791++) {
            sum_5791 += array_5791[i_5791];
        }

        // Calculate the average value
        double average_5791 = (double) sum_5791 / size_5791;

        // Display the sum and average
        System.out.println("Sum of array elements: " + sum_5791);
        System.out.printf("Average of array elements: %.2f%n", average_5791);

        scanner_5791.close(); // Closing the scanner
    }
}
