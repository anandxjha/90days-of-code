package Day22;

import java.util.Scanner;

public class Largest {
    static void main() {
        Scanner sc= new Scanner(System.in);
       // System.out.print("Enter the number of a :");
        int a = sc.nextInt();
       // System.out.print("Enter the number of b :");
        int b = sc.nextInt();
        // System.out.print("Enter the number of c :");
        int c = sc.nextInt();

//        if(a>b && a>c){
//            System.out.println("Largest number is " + a);
//        }
//        else if(b>a && b>c){
//            System.out.println("Largest number is " + b);
//        }
//        else {
//            System.out.println("Largest number is " + c);
//        }

      int max = a;
      if(b>max ){
          max =b;
      }
      if(c>max){
          max=c;
      }
        System.out.println(max);

    }
}
