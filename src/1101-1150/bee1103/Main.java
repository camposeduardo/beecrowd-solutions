package bee1103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finish = false;

        while (!finish) {

            int h1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            int h2 = scanner.nextInt();
            int m2 = scanner.nextInt();

            int horarioAtual = ((h1 * 60) + m1);
            int horarioParaDespertar = ((h2 * 60) + m2);

            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                finish = true;

            } else {
                int minutosParaDormir = Math.abs(horarioAtual - horarioParaDespertar);

                if (horarioAtual > horarioParaDespertar) {
                    minutosParaDormir = Math.abs(minutosParaDormir - 1440);
                }

                System.out.println(minutosParaDormir);
            }


        }

        scanner.close();
    }
}
