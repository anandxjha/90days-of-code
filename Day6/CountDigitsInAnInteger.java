package Day6;

import java.util.Scanner;

public class CountDigitsInAnInteger {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        int count=0;

        for(;number != 0; number = number / 10){
            count++;
        }
        System.out.println(count);
    }
}
