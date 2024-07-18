package bee1180;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeElementos = scanner.nextInt();

        int[] elementos = new int[numeroDeElementos];

        for (int i = 0; i < elementos.length ; i++) {
            elementos[i] = scanner.nextInt();
        }

        int menorValor = elementos[0];
        int indice = 0;

        for (int i = 0; i < elementos.length ; i++) {
            if (elementos[i] < menorValor) {
                menorValor = elementos[i];
                indice = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + indice);

        scanner.close();
    }
}
