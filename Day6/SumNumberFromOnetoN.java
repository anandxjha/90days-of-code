package Day6;

import java.util.Scanner;

public class SumNumberFromOnetoN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int sum =0;
        for(int i=1 ;i<=number;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
//sum of number from one to n using for loop