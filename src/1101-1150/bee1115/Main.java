package bee1115;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while (!finish) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }

        scanner.close();
    }
}
