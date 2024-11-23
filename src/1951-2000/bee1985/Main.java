package bee1985;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double[] valores = {0, 1.50, 2.50, 3.50, 4.50, 5.50};

        int quantidade = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            String codigo = scanner.next();
            int qtd = scanner.nextInt();
            int ultimoDigito = Integer.parseInt(String.valueOf(codigo.charAt(3)));

            total += valores[ultimoDigito] * qtd;
        }

        System.out.printf("%.2f\n", total);

        scanner.close();
    }
}
