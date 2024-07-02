package bee1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        while (casos > 0) {
            int valor = scanner.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            } else if (valor % 2 == 0) {
                if (valor > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (valor > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            casos --;
        }

        scanner.close();
    }
}
