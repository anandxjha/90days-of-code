package Day1;
import java.util.*;
import java.lang.*;
// Personal Information
public class PersonalInformation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your City: ");
        String city = sc.nextLine();

        System.out.println("-------------------");
        System.out.println("Perional Details");
        System.out.println("-------------------");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);


    }

}
