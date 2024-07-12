package bee1172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();
            if (valor <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = valor;
            }

            System.out.println("X["+i+"] = " + vetor[i]);
        }

        scanner.close();
    }
}
