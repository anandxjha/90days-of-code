package Day6;

import java.util.Scanner;

public class SumofEvenNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        int sum=0;

        for(int i =1;i<=number;i++){
            if(i %2==0 ){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
//sum of even number using for loops