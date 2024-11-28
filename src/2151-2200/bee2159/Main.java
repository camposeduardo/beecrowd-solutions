package bee2159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double p = n / Math.log(n);
        double m = p * 1.25506;

        System.out.printf("%.1f %.1f\n", p, m);

        scanner.close();
    }
}
