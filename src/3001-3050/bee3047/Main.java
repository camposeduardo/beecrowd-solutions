package bee3047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextByte();
        int a = scanner.nextByte();
        int b = scanner.nextByte();

        int c = m - a - b;
        if (c > a && c > b) {
            System.out.println(c);
        } else {
            int maior = Math.max(a, b);
            System.out.println(maior);
        }

        scanner.close();
    }
}
