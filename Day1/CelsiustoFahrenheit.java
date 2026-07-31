package Day1;
import java.util.*;
public class CelsiustoFahrenheit {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Celsius: ");
        double Celsius = sc.nextDouble();
        double faherenhit = (Celsius * 9/5)+ 32;
        System.out.println(" Faherenhit = " + faherenhit);

    }
}
