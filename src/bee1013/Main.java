package bee1013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int maiorXY = (x + y + Math.abs(x - y)) / 2;
        if (maiorXY > z) {
            System.out.println(maiorXY + " eh o maior");
        } else {
            System.out.println(z + " eh o maior");
        }
        scanner.close();
    }
}
