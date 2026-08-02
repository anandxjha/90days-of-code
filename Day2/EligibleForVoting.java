package Day2;
import java.util.*;
public class EligibleForVoting {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.print("Eligible for Voting");
         }
        else{
            System.out.println("Not eligible for voting");
        }

        }
    }

