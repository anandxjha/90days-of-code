package Day10;

import java.util.Scanner;

public class PrintOddEvenPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2==0 ){
            System.out.println("Even number");
           if(number %1==0 && number %number ==0){
               System.out.println("Prime number");
               if(number %2 !=0){
                   System.out.println("odd number ");
               }
           }
        }
        else{
            System.out.println("Odd number");
        }

    }
}
