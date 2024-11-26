package bee2060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNumeros = scanner.nextInt();
        int multiploDe2 = 0;
        int multiploDe3 = 0;
        int multiploDe4 = 0;
        int multiploDe5 = 0;


        for (int i = 0; i < quantidadeDeNumeros; i++) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                multiploDe2++;
            }

            if (numero % 3 == 0) {
                multiploDe3++;
            }

            if (numero % 4 == 0) {
                multiploDe4++;
            }

            if (numero % 5 == 0) {
                multiploDe5++;
            }
        }

        System.out.println(multiploDe2 + " Multiplo(s) de 2");
        System.out.println(multiploDe3 + " Multiplo(s) de 3");
        System.out.println(multiploDe4 + " Multiplo(s) de 4");
        System.out.println(multiploDe5 + " Multiplo(s) de 5");

        scanner.close();
    }
}
