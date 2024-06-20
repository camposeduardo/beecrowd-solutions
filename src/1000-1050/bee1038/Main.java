package bee1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = {4.00, 4.50, 5.00, 2.00, 1.50};

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double total = valores[codigo - 1] * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);

        scanner.close();
    }
}
