package Day22;

import java.util.Scanner;

public class HelloWorldNtimes {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        for(int n = 1 ; n<=num ;n++){
            System.out.println("Hello world");
        }
    }
}
