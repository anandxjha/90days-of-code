package Day1;

public class AssignmentOperator {

    public static void main(String[] args) {

        int a = 20;

        System.out.println("Original Value : " + a);

        a += 10;
        System.out.println("After += : " + a);

        a -= 5;
        System.out.println("After -= : " + a);

        a *= 2;
        System.out.println("After *= : " + a);

        a /= 5;
        System.out.println("After /= : " + a);

        a %= 3;
        System.out.println("After %= : " + a);
    }
}