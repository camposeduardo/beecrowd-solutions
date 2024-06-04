package bee1047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            int tempoInicial = horaInicial * 60 + minutoInicial;
            int tempoFinal = horaFinal * 60 + minutoFinal;

            int tempoTotal = tempoFinal - tempoInicial;

            if (tempoFinal < tempoInicial) {
                tempoTotal += 1440;
            }

            int horasTotais = tempoTotal / 60;
            int minutosTotais = tempoTotal % 60;

            System.out.println("O JOGO DUROU " + horasTotais + " HORA(S) E " + minutosTotais + " MINUTO(S)");
            scanner.close();
        }
    }
}
