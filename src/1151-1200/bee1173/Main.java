package bee1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("N[" + i + "] = " + valor);
            valor *= 2;
        }
        scanner.close();
    }
}
