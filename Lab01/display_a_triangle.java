package ooplab01;
import java.util.Scanner;
public class display_a_triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int  n_5791 = scanner.nextInt();
        for(int i=0; i< n_5791; i++){
            for(int j=0; j<n_5791-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j< 2*i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
