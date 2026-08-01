package Day1;

public class UnaryOperator {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Unary Plus      : " + (+a));
        System.out.println("Unary Minus     : " + (-a));

        System.out.println("Pre Increment   : " + (++a));
        System.out.println("Post Increment  : " + (a++));

        System.out.println("Value of a      : " + a);

        System.out.println("Pre Decrement   : " + (--a));
        System.out.println("Post Decrement  : " + (a--));

        System.out.println("Value of a      : " + a);

        boolean flag = true;

        System.out.println("Logical NOT     : " + (!flag));
    }
}