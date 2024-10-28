package ooplab01;

import java.util.Scanner;

public class caculatesmatrices {
    public static void main(String[] args) {
        Scanner scanner_5791 = new Scanner(System.in);

        // Ask for the number of rows and columns
        System.out.print("Enter the number of rows in the matrices: ");
        int rows_5791 = scanner_5791.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int columns_5791 = scanner_5791.nextInt();

        // Declare two matrices and a result matrix
        int[][] matrixA_5791 = new int[rows_5791][columns_5791];
        int[][] matrixB_5791 = new int[rows_5791][columns_5791];
        int[][] resultMatrix_5791 = new int[rows_5791][columns_5791];

        // Input matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i_5791 = 0; i_5791 < rows_5791; i_5791++) {
            for (int j_5791 = 0; j_5791 < columns_5791; j_5791++) {
                System.out.print("A[" + i_5791 + "][" + j_5791 + "]: ");
                matrixA_5791[i_5791][j_5791] = scanner_5791.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i_5791 = 0; i_5791 < rows_5791; i_5791++) {
            for (int j_5791 = 0; j_5791 < columns_5791; j_5791++) {
                System.out.print("B[" + i_5791 + "][" + j_5791 + "]: ");
                matrixB_5791[i_5791][j_5791] = scanner_5791.nextInt();
            }
        }

        // Add the matrices
        for (int i_5791 = 0; i_5791 < rows_5791; i_5791++) {
            for (int j_5791 = 0; j_5791 < columns_5791; j_5791++) {
                resultMatrix_5791[i_5791][j_5791] = matrixA_5791[i_5791][j_5791] + matrixB_5791[i_5791][j_5791];
            }
        }

        // Display the result matrix
        System.out.println("The sum of matrix A and matrix B is:");
        for (int i_5791 = 0; i_5791 < rows_5791; i_5791++) {
            for (int j_5791 = 0; j_5791 < columns_5791; j_5791++) {
                System.out.print(resultMatrix_5791[i_5791][j_5791] + " ");
            }
            System.out.println(); // Move to the next line
        }

        scanner_5791.close(); // Close the scanner
    }
}
