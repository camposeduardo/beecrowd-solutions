package bee1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < casos ; i++) {
            int valor = scanner.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
