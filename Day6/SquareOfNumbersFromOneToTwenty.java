package Day6;
import java.util.*;
public class SquareOfNumbersFromOneToTwenty {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = Sc.nextInt();
        for (int i=1; i<=number; i++ ){
            System.out.println(i +" -> "+ i *i);
        }
    }
}
//square of number using for loop
