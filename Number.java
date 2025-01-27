package Demo;
import java.util.Scanner;

public class Number {

    int num;

    // Constructor to initialize the number
    public Number(int num) {
        this.num = num;
    }

    // Method to check if the number is even or odd
    public void checkEvenOrOdd() {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int inputNum = scanner.nextInt();

        // Create a Number object with the entered number
        Number number = new Number(inputNum);

        // Call the method to check if the number is even or odd
        number.checkEvenOrOdd();

        // Close the scanner
        scanner.close();
    }
}
