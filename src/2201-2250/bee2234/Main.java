package bee2234;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.printf("%.2f\n", (double) h / p);

        scanner.close();
    }
}
