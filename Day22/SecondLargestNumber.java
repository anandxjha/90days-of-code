package Day22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number ");
        int a = sc.nextInt();
        System.out.print("Enter the First number ");
        int b = sc.nextInt();
        System.out.print("Enter the First number ");
        int c = sc.nextInt();

        int max =a ;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        int Secondmax= Integer.MIN_VALUE; ;
        if(a< max && a>Secondmax ){
           Secondmax =a ;
        }
        if(b<max && b>Secondmax){
            Secondmax =b;
        }
        if(c<max && c>Secondmax){
            Secondmax =c;
        }


        System.out.println(max);
        System.out.println(Secondmax);

    }
}
