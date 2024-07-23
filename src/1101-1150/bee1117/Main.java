package bee1117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finish = false;
        double resultado = 0.0;
        int quantidadeDeNotas = 0;

        while (!finish) {
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                resultado += nota;
                quantidadeDeNotas++;
            } else {
                System.out.println("nota invalida");
            }

            if (quantidadeDeNotas == 2) {
                finish = true;
            }
        }
        System.out.printf("media = %.2f\n", (resultado / 2));
        scanner.close();
    }
}
