package Day24;

import java.util.Scanner;

public class EvenOddDigitCounter {
    static void main() {
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        int evencount =0;
        int oddcount =0;

         for(; num !=0;num /=10){
             int digit = num%10;
             if(digit%2==0) {
                 evencount++;
             }else{
                 oddcount++;

                 }
             }
        System.out.println(evencount);
        System.out.println(oddcount);

         }

        }


