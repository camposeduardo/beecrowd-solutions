package bee1467;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a != b && a != c) {
                System.out.println("A");
            } else if (b != a) {
                System.out.println("B");
            } else if (c != b) {
                System.out.println("C");
            } else {
                System.out.println("*");
            }

        }



        scanner.close();
    }
}
