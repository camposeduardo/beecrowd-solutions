package bee1175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];

        for (int i = 0; i < valores.length ; i++) {
            valores[i] = scanner.nextInt();
        }
        for (int i = 0; i < valores.length / 2; i++) {
            int aux = valores[i];
            valores[i] = valores[valores.length - 1 - i];
            valores[valores.length - 1 - i] = aux;
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("N[" + i + "] = " + valores[i]);
        }

        scanner.close();
    }
}
