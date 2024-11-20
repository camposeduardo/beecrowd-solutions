package bee1176;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] fibonacci = new long[61];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        int numeroDeTestes = scanner.nextInt();

        for (int i = 0; i < numeroDeTestes; i++) {
            int n = scanner.nextInt();
            System.out.println("Fib(" + n + ") = " + fibonacci[n]);
        }

        scanner.close();
    }
}
