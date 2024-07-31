package bee1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while ((x = scanner.nextInt()) != 0) {
            int total = 0;

            if (x % 2 == 0) {
                for (int i = x; i <= x + 8 ; i+=2) {
                    total += i;
                }
            } else {
                for (int i = x + 1; i <= x + 10 ; i+=2) {
                    total += i;
                }
            }

            System.out.println(total);
        }

        scanner.close();
    }
}
