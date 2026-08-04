package Day6;

public class DivisibleByFour {
    public static void main(String[]args){
        int count =0;
        for (int i =1 ;i<=100;i++){
            if(i%4==0 ){
                count++;

            }
        }
        System.out.println("count = " +count);
    }
}
//using for lopp divisible by 4