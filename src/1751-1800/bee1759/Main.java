package bee1759;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeHo = scanner.nextInt();
        StringBuilder ho = new StringBuilder();

        for (int i = 0; i < quantidadeDeHo; i++) {
            if (i == (quantidadeDeHo - 1)) {
                ho.append("Ho!");
            } else {
                ho.append("Ho ");
            }
        }

        System.out.println(ho);

        scanner.close();
    }
}
