package Day2;

import java.util.*;

public class StudentAdmission {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Entrance Exam Passed (true/false): ");
        boolean entrance = sc.nextBoolean();

        System.out.print("Documents Submitted (true/false): ");
        boolean document = sc.nextBoolean();

        if (age >= 18) {
            System.out.println("Age Verified");

            if (percentage >= 60) {
                System.out.println("Percentage Verified");

                if (entrance) {
                    System.out.println("Entrance Exam Passed");

                    if (document) {
                        System.out.println("Documents Submitted");
                        System.out.println("Welcome " + name + " to ABC University");
                    } else {
                        System.out.println("Admission Rejected: Documents not submitted.");
                    }

                } else {
                    System.out.println("Admission Rejected: Entrance exam not passed.");
                }

            } else {
                System.out.println("Admission Rejected: Percentage below 60.");
            }

        } else {
            System.out.println("Admission Rejected: Age must be at least 18.");
        }

        sc.close();
    }
}