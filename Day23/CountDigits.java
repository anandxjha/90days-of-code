package Day23;

import java.util.*;

public class CountDigits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        int count = 0;

        for (; number != 0; number = number / 10) {
            count++;
        }

        System.out.println(count);
    }
}
// (/ ye last digit remove kr deta)