package Day25;

import java.util.Scanner;

public class HollowSquarePattern {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1 || row ==n){
                    System.out.print("* ");
                }
                else{
                    if(col==1 || col==n){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }


                }
            }
            System.out.println();
        }
    }
}
