package bee2896;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; i++) {
            int garrafasCompradas = scanner.nextInt();
            int qntGarrafas = scanner.nextInt();

            if (qntGarrafas <= garrafasCompradas) {
                int garrafasParaGanhar = 0;
                while (garrafasCompradas >= qntGarrafas) {
                    garrafasCompradas -= qntGarrafas;
                    garrafasParaGanhar++;
                }
                System.out.println(garrafasParaGanhar + garrafasCompradas);

            } else {
                System.out.println(garrafasCompradas);
            }

        }

        scanner.close();
    }
}
