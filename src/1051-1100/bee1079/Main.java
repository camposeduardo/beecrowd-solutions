package bee1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        for (int i = 0; i < casos ; i++) {
            double v1 = scanner.nextDouble();
            double v2 = scanner.nextDouble();
            double v3 = scanner.nextDouble();

            double mediaPonderada = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;

            System.out.printf("%.1f\n", mediaPonderada);
        }

        scanner.close();
    }
}
