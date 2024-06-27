package bee1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorDePositivos = 0;
        double soma = 0;
        for (int i = 0; i < 6 ; i++) {
            double valor = scanner.nextDouble();
            if (valor > 0) {
                contadorDePositivos += 1;
                soma += valor;
            }
        }
        System.out.println(contadorDePositivos + " valores positivos");
        System.out.printf("%.1f\n", (soma / contadorDePositivos));
    }
}
