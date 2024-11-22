package bee1866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes ; i++) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

        scanner.close();
    }
}
