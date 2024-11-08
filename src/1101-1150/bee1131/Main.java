package bee1131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean terminar = false;

        int qntDeJogos = 0;
        int interStats = 0;
        int gremioStats = 0;
        int empates = 0;

        while (!terminar) {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                interStats++;
            } else if (golsGremio > golsInter) {
                gremioStats++;
            } else {
                empates++;
            }
            qntDeJogos++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int continuar = scanner.nextInt();

            if (continuar == 2) {
                terminar = true;
            }
        }

        System.out.println(qntDeJogos + " grenais");
        System.out.println("Inter:" + interStats);
        System.out.println("Gremio:" + gremioStats);
        System.out.println("Empates:" + empates);

        if (gremioStats > interStats) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Inter venceu mais");
        }

        scanner.close();
    }
}
