package bee1150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int z = scanner.nextInt();
        int quantosNumeros = 1;
        int total = 0;

        boolean finish = false;

        if (z < x) {
            while (!finish) {
                z = scanner.nextInt();

                if (z > x) {
                    finish = true;
                }
            }
        }
        total = x;

        for (int i = x; i < z ; i++) {
            total += i;
            if (total > z) {
                quantosNumeros++;
                break;
            }
            quantosNumeros++;
        }

        System.out.println(quantosNumeros);

        scanner.close();

    }
}
