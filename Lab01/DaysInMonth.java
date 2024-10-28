package ooplab01;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner_5791 = new Scanner(System.in);

        int year_5791 = 0;
        String month_5791 = "";

        // Ask for valid year input
        while (true) {
            System.out.print("Enter a valid year (positive number): ");
            if (scanner_5791.hasNextInt()) {
                year_5791 = scanner_5791.nextInt();
                if (year_5791 >= 0) {
                    break;
                } else {
                    System.out.println("Invalid year. Year must be a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter digits only.");
                scanner_5791.next(); // Consume invalid input
            }
        }

        // Ask for valid month input
        while (true) {
            System.out.print("Enter a valid month (full name, abbreviation, or number): ");
            month_5791 = scanner_5791.next();
            if (isValidMonth(month_5791)) {
                break;
            } else {
                System.out.println("Invalid month. Please enter a valid month.");
            }
        }

        // Get the number of days in the month and year
        int days_5791 = getNumberOfDaysInMonth(month_5791, year_5791);
        System.out.println("Number of days in " + month_5791 + " " + year_5791 + " is: " + days_5791);

        scanner_5791.close();
    }

    // Method to check if the month is valid
    public static boolean isValidMonth(String month_5791) {
        switch (month_5791.toLowerCase()) {
            case "1": case "jan": case "jan.": case "january":
            case "2": case "feb": case "feb.": case "february":
            case "3": case "mar": case "mar.": case "march":
            case "4": case "apr": case "apr.": case "april":
            case "5": case "may":
            case "6": case "jun": case "jun.": case "june":
            case "7": case "jul": case "jul.": case "july":
            case "8": case "aug": case "aug.": case "august":
            case "9": case "sep": case "sep.": case "september":
            case "10": case "oct": case "oct.": case "october":
            case "11": case "nov": case "nov.": case "november":
            case "12": case "dec": case "dec.": case "december":
                return true;
            default:
                return false;
        }
    }

    // Method to get the number of days in the month
    public static int getNumberOfDaysInMonth(String month_5791, int year_5791) {
        switch (month_5791.toLowerCase()) {
            case "1": case "jan": case "jan.": case "january":
                return 31;
            case "2": case "feb": case "feb.": case "february":
                return isLeapYear(year_5791) ? 29 : 28;
            case "3": case "mar": case "mar.": case "march":
                return 31;
            case "4": case "apr": case "apr.": case "april":
                return 30;
            case "5": case "may":
                return 31;
            case "6": case "jun": case "jun.": case "june":
                return 30;
            case "7": case "jul": case "jul.": case "july":
                return 31;
            case "8": case "aug": case "aug.": case "august":
                return 31;
            case "9": case "sep": case "sep.": case "september":
                return 30;
            case "10": case "oct": case "oct.": case "october":
                return 31;
            case "11": case "nov": case "nov.": case "november":
                return 30;
            case "12": case "dec": case "dec.": case "december":
                return 31;
            default:
                return -1; // This should never happen as we validated the month before
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year_5791) {
        if (year_5791 % 4 == 0) {
            if (year_5791 % 100 == 0) {
                return year_5791 % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
