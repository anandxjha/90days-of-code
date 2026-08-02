package Day2;
import java.util.*;
public class PassFail {
    static void main() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the marks :");
     int marks = sc.nextInt();

     if(marks>=35){
         System.out.println("Pass");
     }
     else{
         System.out.println("Fail");
     }
    }
}
