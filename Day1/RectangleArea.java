package Day1;
//Rectangle Area
import java.util.*;
public class RectangleArea {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the length: ");
        float length = sc.nextFloat();

        System.out.print("Enter the Width: ");
        float width = sc.nextFloat();

        Float area = length * width;
        System.out.println("Area of Rectangle = " +area);
    }
}
