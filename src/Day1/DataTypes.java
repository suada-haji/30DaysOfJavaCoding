package Day1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();

         /* Print the sum of both integer variables on a new line. */
        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + c);

        scan.close();

    }
}