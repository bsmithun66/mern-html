import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sp = n / 2;
        int len = 1;

        // upper half
        for (int i = 1; i <= n / 2; i++) {

            // spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // stars and spaces
            for (int j = 1; j <= len; j++) {

                if (j == 1 || j == len || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

            sp--;
            len += 2;
        }

        // middle line
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        // lower half
        sp = 1;
        len = n - 2;

        for (int i = 1; i <= n / 2; i++) {

            // spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // stars and spaces
            for (int j = 1; j <= len; j++) {

                if (j == 1 || j == len || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

            sp++;
            len -= 2;
        }

        sc.close();
    }
}