package Day2;
import java.util.*;
public class ATMProgram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the card :");
        boolean card = sc.nextBoolean();
        System.out.print("Enter pin :");
        boolean pin = sc.nextBoolean();

        if (card) {
            if (pin) {
                System.out.println("Cash widraw");
            } else {
                System.out.println("incorrect details");
            }

        } else {
            System.out.println("Transaction Failed");

        }
    }
}
