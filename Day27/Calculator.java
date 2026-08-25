package Day27;

public class Calculator {

    // Method definition
    public int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Returns an integer value
    }

    public static void main(String[] args) {
        // Create an object to call a non-static method
        Calculator calc = new Calculator();

        // Calling the method and saving the result
        int result = calc.addNumbers(5, 10);

        System.out.println("The sum is: " + result);
    }
}
