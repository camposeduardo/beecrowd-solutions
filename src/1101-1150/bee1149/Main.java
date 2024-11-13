package bee1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] valores = scanner.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int total = 0;

        for (int i = 1; i < valores.length ; i++) {
            int n = Integer.parseInt(valores[i]);
            if (n > 0) {
                for (int j = 0; j < n; j++) {
                    total += a + j;
                }
            }
        }

        System.out.println(total);
        scanner.close();

    }
}
