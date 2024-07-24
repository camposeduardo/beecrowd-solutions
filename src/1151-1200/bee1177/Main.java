package bee1177;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < 1000 ; i++) {
            if (contador == x) {
                contador = 0;
            }
            System.out.println("N[" + (i) + "] = " + contador);
            contador++;

        }
        scanner.close();
    }
}
