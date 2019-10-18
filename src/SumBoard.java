import java.util.Scanner;

public class SumBoard {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] tab01 = new int[5];
            System.out.println("Provide another number: ");
            tab01[0] = sc.nextInt();
            System.out.println("Provide another number: ");
            tab01[1] = sc.nextInt();
            System.out.println("Provide another number: ");
            tab01[2] = sc.nextInt();
            System.out.println("Provide another number: ");
            tab01[3] = sc.nextInt();
            System.out.println("Provide another number: ");
            tab01[4] = sc.nextInt();
            int sum = tab01[0] + tab01[2] + tab01[4];
            System.out.println("The amount of 1,3,5 value is: " + sum);

        }
    }

