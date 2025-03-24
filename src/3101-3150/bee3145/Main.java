package bee3145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeAnoes = scanner.nextInt();
        int distancia = scanner.nextInt();
        double quantidadeDeDias = (double) distancia / (quantidadeDeAnoes + 2);
        System.out.printf("%.2f\n", quantidadeDeDias);
        scanner.close();
    }
}
