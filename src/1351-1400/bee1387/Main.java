package bee1387;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finish = false;

        while (!finish) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x + y != 0) {
                System.out.println(x + y);
            } else {
                finish = true;
            }


        }

        scanner.close();
    }
}
