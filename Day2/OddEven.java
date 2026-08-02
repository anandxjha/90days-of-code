package Day2;
import java.util.*;
public class OddEven {
    public static void main() {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
