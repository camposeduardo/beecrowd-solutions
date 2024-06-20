package bee1241;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            String x = scanner.next();
            String y = scanner.next();

            if (x.length() > y.length()) {
                if (x.endsWith(y)) {
                    System.out.println("encaixa");
                }
                else {
                    System.out.println("nao encaixa");
                }
            } else {
                if (y.endsWith(x)) {
                    System.out.println("encaixa");
                }
                else {
                    System.out.println("nao encaixa");
                }
            }
        }
        scanner.close();
    }
}
