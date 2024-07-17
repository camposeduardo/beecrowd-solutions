package bee1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < casos ; i++) {
            int quantidade = scanner.nextInt();
            String especie = scanner.next();

            if (especie.equals("C")) {
                totalCoelhos += quantidade;
            }

            if (especie.equals("R")) {
                totalRatos += quantidade;
            }

            if (especie.equals("S")) {
                totalSapos += quantidade;
            }
        }

        int total = totalCoelhos + totalSapos + totalRatos;
        double percentualCoelhos = ((double) totalCoelhos / total * 100);
        double percentualRatos = ((double) totalRatos / total * 100);
        double percentualSapos = ((double) totalSapos / total * 100);

        System.out.println("Total: " + (totalCoelhos+totalRatos+totalSapos) + " cobaias");
        System.out.printf("Total de coelhos: %d\n", totalCoelhos);
        System.out.printf("Total de ratos: %d\n", totalRatos);
        System.out.printf("Total de sapos: %d\n", totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos );
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos );

        scanner.close();
    }
}
