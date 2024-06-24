package bee1040;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat formatter = new DecimalFormat("#0.0");

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (10);
        System.out.println("Media: " + formatter.format(media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaDoExame = scanner.nextDouble();
            System.out.println("Nota do exame: " + notaDoExame);
            double mediaDoExame = (media + notaDoExame) / 2;

            if (mediaDoExame < 5.0) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno aprovado.");
            }
            System.out.println("Media final: " + formatter.format(mediaDoExame));
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
