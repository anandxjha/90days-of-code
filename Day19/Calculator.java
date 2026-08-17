package Day19;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Console Calculator ===");

        // Take the first number as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Take the operator as input
        System.out.print("Choose an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Take the second number as input
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;
        boolean validOperation = true;

        // Perform the calculation based on the chosen operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero error
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                // Handle modulus by zero error
                if (num2 == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                } else {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                validOperation = false;
                result = 0;
                break;
        }

        // Print the output if the operation was valid
        if (validOperation) {
            System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }
}
