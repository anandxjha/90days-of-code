package Day23;

import java.util.Scanner;

public class RevesePalindromeDigitsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        int revese =0;
        for(; n !=0; n =n/10){
            int digit =n%10;
            revese=revese*10+digit;

        }
        System.out.println(revese);
    }
}
