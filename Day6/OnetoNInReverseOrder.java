package Day6;
import java.util.*;
public class OnetoNInReverseOrder {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ;");
        int number = sc.nextInt();

        for (int  i =number ;i>=1 ;i--){
            System.out.println(i);
        }
    }
}
//one to n in reverse order using for loop