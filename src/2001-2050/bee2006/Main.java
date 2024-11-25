package bee2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] chaDosCompetidores = new int[5];

        int tipoDeCha = scanner.nextInt();
        int acertos = 0;

        for (int i = 0; i < chaDosCompetidores.length ; i++) {
            chaDosCompetidores[i] = scanner.nextInt();

            if (chaDosCompetidores[i] == tipoDeCha) {
                acertos++;
            }
        }
        System.out.println(acertos);

        scanner.close();
    }
}
