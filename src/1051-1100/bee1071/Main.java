package bee1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x  = scanner.nextInt();
        int y = scanner.nextInt();

        int total = 0;

        if (x == y) {
            total = 0;
        } else if (x > y) {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        } else {
            for (int i = x; i < y; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        }
        System.out.println(total);
        scanner.close();
    }
}
