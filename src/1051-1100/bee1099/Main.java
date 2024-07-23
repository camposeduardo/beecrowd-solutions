package bee1099;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; i++) {
            int totalDeImpares = 0;

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int max = Math.max(x, y);
            int min = Math.min(x, y);

            for (int j = min + 1; j < max; j++) {
                if (j % 2 != 0) {
                    totalDeImpares += j;
                }
            }
            System.out.println(totalDeImpares);
        }
        scanner.close();
    }
}
