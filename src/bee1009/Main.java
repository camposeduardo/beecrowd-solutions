package bee1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String funcionario = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalDeVendas = scanner.nextDouble();

        double totalAReceber = salarioFixo + totalDeVendas * 15 / 100;
        System.out.printf("TOTAL = %.2f\n", totalAReceber);

        scanner.close();
    }
}
