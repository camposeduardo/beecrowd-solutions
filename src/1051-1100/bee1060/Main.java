package bee1060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorDePositivos = 0;
        for (int i = 0; i < 6 ; i++) {
            double valor = scanner.nextDouble();
            if (valor > 0) {
                contadorDePositivos += 1;
            }
        }
        System.out.println(contadorDePositivos + " valores positivos");
    }
}
