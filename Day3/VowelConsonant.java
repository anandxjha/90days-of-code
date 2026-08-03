package Day3;
import java.util.*;
public class VowelConsonant {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter character ");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");


        }
    }
}
