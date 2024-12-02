package bee2172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int p = scanner.nextInt();
            int m = scanner.nextInt();
            if (p == 0 && m == 0) {
                break;
            }
            System.out.println(p * m);
        }

        scanner.close();
    }
}
