package Day23;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int count = 0;
        int sum = 0;
        int largest = 0;
        int smallest = 9;
        int evenCount = 0;
        int oddCount = 0;

        for (; number != 0; number = number / 10) {

            int digit = number % 10;

            // Count
            count++;

            // Sum
            sum = sum + digit;

            // Largest
            if (digit > largest) {
                largest = digit;
            }

            // Smallest
            if (digit < smallest) {
                smallest = digit;
            }

            // Even / Odd
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of digits = " + count);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);

        sc.close();
    }
}