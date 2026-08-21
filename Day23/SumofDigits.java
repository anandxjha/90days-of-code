package Day23;

import java.util.Scanner;

public class SumofDigits {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        int sum =0;
        for(;number !=0; number =number/10  ){
            int digit = number%10;
            sum = sum+digit;

        }
        System.out.println(sum);
    }
}
