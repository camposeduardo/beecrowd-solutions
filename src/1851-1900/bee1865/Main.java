package bee1865;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; i++) {
            String nome = scanner.next();
            int forca = scanner.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        scanner.close();
    }
}
