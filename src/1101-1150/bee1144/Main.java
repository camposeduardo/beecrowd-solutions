package bee1144;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int ultimoIndice = 1;
        int ultimoValorAoQuadrado = 1;
        int ultimoValorAoCubo = 1;
        boolean soma = false;
        for (int i = 1; i <= x * 2; i++) {
            if (soma) {
                System.out.println(ultimoIndice + " " + (ultimoValorAoQuadrado + 1) + " " + (ultimoValorAoCubo + 1));
                ultimoIndice++;
                soma = false;
            } else {
                ultimoValorAoCubo = (int) Math.pow(ultimoIndice, 3);
                ultimoValorAoQuadrado = (int) Math.pow(ultimoIndice,2);
                soma = true;
                System.out.println(ultimoIndice + " " + ultimoValorAoQuadrado + " " + ultimoValorAoCubo);
            }
        }

        scanner.close();
    }
}
