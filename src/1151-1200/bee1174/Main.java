package bee1174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] valores = new double[100];

        for (int i = 0; i < 100 ; i++) {
            valores[i] = scanner.nextDouble();

        }

        for (int i = 0; i < 100 ; i++) {
            if (valores[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, valores[i]);
            }
        }

        scanner.close();
    }
}
