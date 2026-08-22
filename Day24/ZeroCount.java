package Day24;

import java.util.Scanner;

public class ZeroCount {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        int count=0;

        for(;num!=0; num/=10){
            int digit = num%10;
            if(digit ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
