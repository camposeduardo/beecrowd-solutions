package bee1037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50.0 && valor <= 100.0) {
            System.out.println("Intervalo (75,100]");
        }  else {
            System.out.println("Fora de intervalo");
        }
        scanner.close();
    }
}
