package bee1589;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeTestes = scanner.nextInt();

        for (int i = 0; i < numeroDeTestes; i++) {
           int r1 = scanner.nextInt();
           int r2 = scanner.nextInt();
           System.out.println(r1 + r2);
        }

        scanner.close();
    }
}
