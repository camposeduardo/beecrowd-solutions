package bee1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 2; i <= valor ; i+=2) {
            System.out.println(i + "^" + 2 + " = " + (int) Math.pow(i, 2));
        }

        scanner.close();
    }
}
