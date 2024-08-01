package bee1158;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        boolean finish = false;
        
        for (int i = 0; i < casos; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int total = 0;

            if (x % 2 != 0) {
                total = somaImparesConsecutivos(x, y);
            } else {
                total = somaImparesConsecutivos(x + 1, y);
            }

            System.out.println(total);
        }
        scanner.close();
    }

    public static int somaImparesConsecutivos(int valorInicial, int quantidadeParaSomar) {

        int contador = 0;
        int total = 0;
        int valorAtual = valorInicial;

        while (contador != quantidadeParaSomar) {
            if (valorAtual % 2 != 0) {
                total += valorAtual;
                contador++;
            }
            valorAtual++;
        }
        return total;
    }
}
