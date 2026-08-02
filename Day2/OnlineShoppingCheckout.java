package Day2;
import java.sql.SQLOutput;
import java.util.*;
public class OnlineShoppingCheckout {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name :");
        String name = sc.nextLine();

        System.out.println("Customer is logged in (true/false) : ");
        boolean logged = sc.nextBoolean();

        System.out.println("Is prime Member (True/False) : ");
        boolean primemember = sc.nextBoolean();

        System.out.println("Enter cart value :");
        double cartvalue = sc.nextDouble();

        System.out.println("Payment Successful (True/False):");
        boolean payment = sc.nextBoolean();

        if(logged) {
            System.out.println("Customer is logged ");
        }else {
            System.out.println("Login first");
        }
            if(primemember){
                System.out.println("Customer get Freee delivery ");
            }
            else{
                System.out.println("No free delivery");
            }
                if (cartvalue>=1000){
                    System.out.println("Customer get prime discount ");}
                else {
                    System.out.println("No Discount");
                }
                    if(payment){
                        System.out.println("Order is Confirmed");
                    }
                    else {
                        System.out.println("Order fail");
                }
            }
        }


