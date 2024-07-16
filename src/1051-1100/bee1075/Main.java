package bee1075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 1; i <= 10000 ; i++) {
            if (i % valor == 2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
