package bee1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        for (int i = 0; i < casos ; i++) {
            int x = scanner.nextInt();
            boolean primo = true;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }

        }

        scanner.close();
    }
}
