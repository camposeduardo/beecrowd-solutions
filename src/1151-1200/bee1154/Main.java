package bee1154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finish = false;
        int tracker = 0;
        int total = 0;

        while (!finish) {
            int x = scanner.nextInt();
            if (x < 0) {
                finish = true;
            } else {
                total += x;
                tracker++;
            }
        }

        System.out.printf("%.2f", ((double) total / tracker));

        scanner.close();
    }
}
