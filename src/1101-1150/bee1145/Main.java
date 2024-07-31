package bee1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int contador = 0;

        for (int i = 1; i <= y ; i++) {
            if (contador < (x-1)) {
                System.out.print(i + " ");
                contador++;
            } else {
                System.out.print(i);
                contador = 0;
                System.out.println();
            }

        }

        scanner.close();
    }
}
