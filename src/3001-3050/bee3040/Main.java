package bee3040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; i++) {
            int altura = scanner.nextInt();
            int diametro = scanner.nextInt();
            int quantidadeDeGalhos = scanner.nextInt();

            if ((altura >= 200 && altura <= 300) && (diametro >= 50) && (quantidadeDeGalhos >= 150)) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
        scanner.close();
    }
}
