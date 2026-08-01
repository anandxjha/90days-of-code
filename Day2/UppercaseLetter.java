package Day2;
import java.util.*;
public class UppercaseLetter {
    static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Letter :");
        char letter = sc.next().charAt(0);
        if (letter >= 'A' && letter <= 'Z' ){
            System.out.println("Uppercase Letter");
        }

    }
}
