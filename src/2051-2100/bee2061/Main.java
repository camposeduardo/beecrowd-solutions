package bee2061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeAbas = scanner.nextInt();
        int acoes = scanner.nextInt();

        for (int i = 0; i < acoes; i++) {
            String acao = scanner.next();

            if (acao.equals("fechou")) {
                numeroDeAbas++;
            } else {
                numeroDeAbas--;
            }
        }

        System.out.println(numeroDeAbas);

        scanner.close();
    }
}
