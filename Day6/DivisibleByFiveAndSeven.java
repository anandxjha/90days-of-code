package Day6;

public class DivisibleByFiveAndSeven {
    public static void main(String[]args){
        for (int i=1 ; i<=100;i++){
            if(i%5==0 && i%7==0){
                System.out.println(i);
            }
        }
    }
}
//divisible by  5 and 7 using for loop