package Day4;
import java.util.*;
public class PrintYourNameFiveTimes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name :");
        String name = sc.nextLine();
        for (int i=1 ; i<=5 ;i++){
            System.out.println(name);

        }

    }
}
