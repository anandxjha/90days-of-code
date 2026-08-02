package Day2;
import java.util.*;
public class ShowGrade {
     static void main(){
        Scanner Sc=new Scanner (System.in);
        System.out.print("Enter the marks :");
        int marks = Sc.nextInt();
        if (marks>=90 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>=75 ){
            System.out.println("Grade B");
         }
        else if(marks >=60){
            System.out.println("Grade C");
        }
        else if(marks >=35){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
