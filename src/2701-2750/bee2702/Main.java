package bee2702;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] refeicoesVetor = scanner.nextLine().split(" ");
        String[] requisitadasVetor = scanner.nextLine().split(" ");

        int total = 0;

        for (int i = 0; i < refeicoesVetor.length; i++) {
            int ref = Integer.parseInt(refeicoesVetor[i]);
            int req = Integer.parseInt(requisitadasVetor[i]);

            if (!(ref > req)) {
                total += req - ref;
            }
        }

        System.out.println(total);

        scanner.close();
    }
}
