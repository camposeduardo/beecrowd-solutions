package bee1101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean terminar = false;

        while (true) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= 0 || y <= 0) {
                break;
            }
            int maior = Math.max(x, y);
            int menor = Math.min(x, y);
            int total = 0;

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                total += i;
            }
            System.out.println("Sum=" + total);
        }

        scanner.close();
    }
}
