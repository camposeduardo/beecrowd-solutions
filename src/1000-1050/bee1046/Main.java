package bee1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == y) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (x < y) {
            System.out.println("O JOGO DUROU " + (y-x) + " HORA(S)");
        } else {
            int horaFinal = (x - y) - 24;
            System.out.println("O JOGO DUROU " + (horaFinal * (-1)) + " HORA(S)");
        }

        scanner.close();
    }
}
