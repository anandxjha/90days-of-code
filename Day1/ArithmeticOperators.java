package Day1;
import java.util.*;
public class ArithmeticOperators {
    public static void main(String[]args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the first number A: ");
       int firstnumber = sc.nextInt();
       System.out.print("Enter the second number B: ");
       int secondnumber = sc.nextInt();

       int a = firstnumber+secondnumber;
       int b = firstnumber-secondnumber;
       int c = firstnumber*secondnumber;
       int d = firstnumber/secondnumber;
       int e = firstnumber%secondnumber;

        System.out.println("----ArithmeticOperator----");
        System.out.println("Addition = " +a);
        System.out.println("Subtraction = " +b);
        System.out.println("Multiplication = " +c);
        System.out.println("Division = " +d);
        System.out.println("Modulus = " +e);


    }
}
/*
package Day1;

import java.util.*;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number A: ");
        int firstnumber = sc.nextInt();

        System.out.print("Enter the second number B: ");
        int secondnumber = sc.nextInt();

        int a = firstnumber + secondnumber;
        int b = firstnumber - secondnumber;
        int c = firstnumber * secondnumber;

        System.out.println("Addition = " + a);
        System.out.println("Subtraction = " + b);
        System.out.println("Multiplication = " + c);

        if (secondnumber != 0) {
            int d = firstnumber / secondnumber;
            int e = firstnumber % secondnumber;

            System.out.println("Division = " + d);
            System.out.println("Modulus = " + e);
        } else {
            System.out.println("Division and Modulus cannot be performed because the second number is 0.");
        }

        sc.close();
    }
}
 */