
// Ques: Print the given pattern
//        1111
//        2222
//        3333
//        4444
package Day31;
import java.util.*;
public class NumberSquare2 {
    static void main() {


        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for(int j=1;j<=n;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

    }
}