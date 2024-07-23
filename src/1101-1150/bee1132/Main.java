package bee1132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int max = Math.max(x, y);
        int min = Math.min(x,y);

        int total = 0;

        for (int i = min; i <= max ; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }

        System.out.println(total);

        scanner.close();
    }
}
