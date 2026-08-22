package Day24;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;

        for (; num != 0; num /= 10) {

            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}