package bee2862;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; i++) {
            int poder = scanner.nextInt();

            if (poder > 8000) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }

        scanner.close();
    }
}
