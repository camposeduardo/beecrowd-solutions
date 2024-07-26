package bee1178;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[100];

        double num = scanner.nextDouble();

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, num);
            vetor[i] = num;
            num /= 2;
        }

        scanner.close();
    }
}
