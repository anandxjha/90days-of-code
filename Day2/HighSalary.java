package Day2;
import java.util.*;
public class HighSalary {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Salary :");
        int Salary= sc.nextInt();

        if (Salary>=50000){
            System.out.println("HighSalary");
        }
    }
}
