package Day6;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        int mult = 1;
        for(int i= 1;i<=number;i++){
            mult=mult*i;
        }
        System.out.println(mult);
    }
}
