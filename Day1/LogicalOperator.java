package Day1;

public class LogicalOperator {

    public static void main(String[] args) {

        int age = 20;
        int marks = 80;

        System.out.println(age >= 18 && marks >= 35);

        System.out.println(age >= 18 || marks >= 90);

        boolean isJavaEasy = true;

        System.out.println(!isJavaEasy);
    }
}