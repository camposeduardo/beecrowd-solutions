package bee1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDePares = scanner.nextInt();

        for (int i = 0; i < quantidadeDePares ; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double) x / y);
            }
        }

        scanner.close();
    }
}
