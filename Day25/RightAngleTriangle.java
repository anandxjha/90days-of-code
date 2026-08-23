package Day25;

import java.util.Scanner;

public class RightAngleTriangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
