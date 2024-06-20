package bee1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();
        double consumoMedio = distancia / combustivelGasto;
        System.out.printf("%.3f km/l\n", consumoMedio);
        scanner.close();
    }
}
