package Day1;
import java.util.*;
public class ASCIIValue {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char character = sc.next().charAt(0);
        int Asciivalue = (int) (character);

        System.out.println("The ASCII value of "+ character + "is:" +Asciivalue);
    }
}
