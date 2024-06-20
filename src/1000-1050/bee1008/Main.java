package bee1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int quantidadeDeHorasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", (valorPorHora * quantidadeDeHorasTrabalhadas));

        scanner.close();
    }
}
