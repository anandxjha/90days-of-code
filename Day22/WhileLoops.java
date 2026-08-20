package Day22;

import java.util.Scanner;

public class WhileLoops {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        int num=1; //inisialize
        while(num<=n){  //condition
            System.out.println(num);
            num++; //increment
        }
    }
}
