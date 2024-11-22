package bee1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeCursos = scanner.nextInt();

        for (int i = 0; i <= quantidadeDeCursos; i++) {
            String curso = scanner.nextLine();
        }
        System.out.println("Ciencia da Computacao");

        scanner.close();
    }
}
