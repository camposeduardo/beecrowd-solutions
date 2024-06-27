package bee1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        int porcentagem = 0;
        double reajuste = 0;

        if (valor >= 0 && valor <= 400) {
            porcentagem = 15;
            reajuste = (valor * porcentagem) / 100;
        } else if (valor > 400 && valor <= 800) {
            porcentagem = 12;
            reajuste = (valor * porcentagem) / 100;
        } else if (valor > 800 && valor <= 1200) {
            porcentagem = 10;
            reajuste = (valor * porcentagem) / 100;
        } else if (valor > 1200 && valor <= 2000) {
            porcentagem = 7;
            reajuste = (valor * porcentagem) / 100;
        } else {
            porcentagem = 4;
            reajuste = (valor * porcentagem) / 100;
        }

        System.out.printf("Novo salario: %.2f\n", valor + reajuste);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + porcentagem + " %");

        scanner.close();
    }
}
