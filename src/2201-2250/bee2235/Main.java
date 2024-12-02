package bee2235;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b == c || a - b == 0 || b + c == a || b - c == 0 || c + a == b || c - a == 0) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        scanner.close();
    }
}
