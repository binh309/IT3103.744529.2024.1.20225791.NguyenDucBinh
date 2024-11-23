package ooplab01;
import java.util.Scanner;
class caculate_2_double_number {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a first number:");
        double first_number_5791= scanner.nextDouble();
        System.out.print("Enter a second number:");
        double second_number_5791 =scanner.nextDouble();
        //System.out.println("You entered: " + first_number_5791 + " " +second_number_5791);
        System.out.println("You have some operation:");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");

        System.out.print("please choose the operation:");
        int choose_5791=scanner.nextInt();
        //scanner.close();
        if(choose_5791==1){
            System.out.printf("Result of calculation sum of %.4f and %.4f is: %.4f%n", first_number_5791, second_number_5791, (first_number_5791 + second_number_5791));
        }
        else if(choose_5791==2){
            System.out.printf("Result of calculation difference of %.4f and %.4f is: %.4f%n", first_number_5791, second_number_5791, (first_number_5791 - second_number_5791));
        }
        else if(choose_5791==3){
            System.out.printf("Result of calculation product of %.4f and %.4f is: %.4f%n", first_number_5791, second_number_5791, (first_number_5791 * second_number_5791));
        }
        else if (choose_5791==4){
            while(second_number_5791==0){
                System.out.print("don't have dision for 0, please enter two_number:");
                second_number_5791= scanner.nextDouble();
            }
            System.out.printf("Result of calculation product of %.4f and %.4f is: %.4f%n", first_number_5791, second_number_5791, (first_number_5791 / second_number_5791));
        }
        scanner.close();
    }
}
