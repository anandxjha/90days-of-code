package Day1;
import java.util.*;
public class CircleArea {
    public static void main(String[]args){
        Scanner Sc = new Scanner (System.in);
        System.out.print(" Enter the Radius: ");
        float radius= Sc.nextFloat();
        float pi= 3.14f;
        float area = pi*radius*radius;

        System.out.println("Area of Circle = " +area);

    }
}