package bee1164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes ; i++) {
            int total = 0;
            int num = scanner.nextInt();

            for (int j = 1; j < num ; j++) {
                if (num % j == 0) {
                    total += j;
                }
            }
            if (total == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }

        scanner.close();
    }
}
